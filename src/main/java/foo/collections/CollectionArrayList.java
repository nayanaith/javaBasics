package foo.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

 public class CollectionArrayList {
     public static void main( String[] args ) {
     // add elements in colors array to list
    	 
    String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
//    List< String > list = new ArrayList< String >(); // before java 1.7
    List< String > list = new ArrayList<>();// from java 1.7 onward
    
 for ( String color : colors )
     list.add( color );
 
     //add elements in removeColors array to removeList
     String[] removeColors = { "RED", "WHITE", "BLUE" };
     
     List< String > removeList = new ArrayList< String >();
     
     for ( String color : removeColors )
         removeList.add( color );
     
     System.out.println( "ArrayList: " );
     for ( int count = 0; count < list.size(); count++ )
         System.out.printf( "%s   ",list.get( count ));
     
     // remove from list the colors contained in removeList
     removeColors( list, removeList );
     
     System.out.println( "\n\nArrayList after calling removeColors: " );
     
     for ( String color : list )
         System.out.printf( "%s   ", color );
     }//end main
     
     private static void removeColors(Collection<String> collection1,
                                      Collection<String> collection2){
         
         Iterator<String> iterator=collection1.iterator();
         
         while(iterator.hasNext())
         {
             if(collection2.contains(iterator.next()))
                 iterator.remove();
             //end if
         }//end while
         
     }//end removeColors
     
}//end CollectionTest
     
     

     