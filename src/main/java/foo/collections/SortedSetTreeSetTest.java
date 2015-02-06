package foo.collections;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTreeSetTest {
    public static void main(String args[]){
        String[] colors={"yellow",
                         "green",
                         "black",
                         "tan",
                         "grey",
                         "white",
                         "orange",
                         "red",
                         "green"};
        
//        SortedSet<String> tree= new TreeSet<String>(Arrays.asList(colors));
        TreeSet<String> tree= new TreeSet<String>(Arrays.asList(colors));
        
        System.out.print("Sorted set: ");
        printSet(tree);
        
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));
        
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));
        
        System.out.printf("first: %s\n",tree.first());
        System.out.printf("last: %s\n", tree.last());
    }//end main
    
    private static void printSet(SortedSet<String> set){
        for(String s:set)
            System.out.printf("%s \t",s);
        
        System.out.println();
    }//end printSet
}//end SortedSetTreeSetTest

