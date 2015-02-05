package foo.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedlistObserve {
    public static void main(String args[]){
        String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
        
        List< String > list1 = new LinkedList< String >();
        for ( String color : colors )
            list1.add( color );
        
        String[] colors2 ={ "gold", "white", "brown", "blue", "gray", "silver" };
        List< String > list2 = new LinkedList< String >();
        
        for ( String color : colors2 )
            list2.add( color );
        
        list1.addAll( list2 );
        list2 = null;
        printList( list1 );
        
        convertToUppercaseStrings( list1 );
        printList( list1 );
        
        System.out.print( "\nDeleting elements 4 to 6..." );
        removeItems( list1, 4, 7 );
        printList( list1 );
        printReversedList( list1 );
    }//end main
    
    public static void printList(List <String> list){
        System.out.println("\nlist: ");
        
        for(String color:list)
            System.out.printf("%s  ",color);
        System.out.println();
    }//end printList
    
    private static void convertToUppercaseStrings(List<String> list){
        ListIterator<String> iterator=list.listIterator();
        
        while(iterator.hasNext()){
            String color=iterator.next();
            iterator.set(color.toUpperCase());
        }
    }//end convertToUpperCaseStrings
    
    private static void removeItems(List <String> list,
                                        int start,
                                        int end){
        list.subList(start, end).clear();
    }//end removeItems
    
    private static void printReversedList(List<String> list){
        ListIterator<String> iterator=list.listIterator(list.size());
        System.out.println("\nReversed List:");
        
        while(iterator.hasPrevious()){
            System.out.printf("%s  ",iterator.previous());
        }
        
    }//end printReversedList
}//end LinkedlistObserve
