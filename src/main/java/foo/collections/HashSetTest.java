package foo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    public static void main(String args[]){
        String[] colors= {  "red",
                            "white",
                            "blue",
                            "green",
                            "gray",
                            "orange",
                            "tan",
                            "white",
                            "cyan",
                            "peach",
                            "gray",
                            "orange"};

        //List<String> list=new ArrayList<String>(Arrays.asList(colors));
        List<String> list=Arrays.asList(colors);
        
        Iterator<String> iterator=list.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }//end while
        
        System.out.printf("\n\nList:%s\n",list);
        
        System.out.printf("\nWith non duplicates\n");
        printNonDuplicates(list);
    }//end main
    
    
    private static void printNonDuplicates(Collection<String> values){
        
        Set<String> set=new HashSet<String>(values);
        
        for(String value:set)
            System.out.printf("%s ",value);
        
        System.out.println();
    }//printNonDuplicates
}//end HashSetTest
