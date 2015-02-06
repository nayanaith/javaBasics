package foo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {
    public static void main (String args[]){
        Map <String,Integer> myMap= new HashMap<String, Integer>();
        createMap(myMap);
        displayMap(myMap);         
    }//end main
    
    private static void createMap(Map <String,Integer> map){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        
        String input=scanner.nextLine();
        String[] tokens = input.split(" ");
        
//        for(String w:tokens)
//            System.out.printf("%s\t\t\t", w);
        
        for(String token:tokens){
            String word=token.toLowerCase();         
            
            if(map.containsKey(word)){
                int count=map.get(word);
                map.put(word,count+1);
            }//end if
            else
                map.put(word, 1);
        }//end for
        scanner.close();
    }//end createMap
    
    private static void displayMap(Map <String, Integer> map){
        Set<String> keys=map.keySet();
        
        TreeSet<String> sortedKeys=new TreeSet<String>(keys);
        System.out.println("\nMap Contains:\nKey\t\tValue");
        for(String key: sortedKeys){
            System.out.printf("%-10s%10s\n",key,map.get(key));
        }//end for
        
            System.out.printf("\nSize: %d\nisEmpty:%b\n",map.size(),map.isEmpty());       
        
    }//end displayMap
}//end WordTypeCount
