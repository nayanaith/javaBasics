package foo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*reffered following 
 * https://examples.javacodegeeks.com/core-java/util/hashmap/java-hashmap-example/
 */


public class HashMapEx2 {
	public static void main(String args[]){
		HashMap<String,Integer> simpleCountryMap=new HashMap<String,Integer>();
		
		HashMap<String,ArrayList<String>> colorMap=new HashMap<>();
		
		// Put elements to the hashMap
		simpleCountryMap.put("USA",1);
		simpleCountryMap.put("Greece",2);
		simpleCountryMap.put("Sri Lanka",3);
		simpleCountryMap.put("Egypt",4);
		simpleCountryMap.put("Pakistan",5);

		// take a value of a specific key
		System.out.println("Value for USA is "+simpleCountryMap.get("USA"));
		System.out.println("Value for Sri Lanka is "+simpleCountryMap.get("Sri Lanka"));
		
		// see if a specific value or key is into the hashMap
		System.out.println("Country list contains Sri Lanka ="+simpleCountryMap.containsKey("Sri Lanka"));
		System.out.println("Country list contains Sri Lanka ="+simpleCountryMap.containsKey("Mexico"));
		
		// create an arrayList to store darkColors
		ArrayList<String> darkColors=new ArrayList<>();
		
		darkColors.add("Black");
		darkColors.add("Brown");
		darkColors.add("Dark Grey");
		darkColors.add("Dark Blue");
		
		// create list two and lightColors
		ArrayList<String> lightColors=new ArrayList<>();
		lightColors.add("Light blue");
		lightColors.add("Light green");
		
		//put values into map
		colorMap.put("darkColors", darkColors);
		colorMap.put("lightColors", lightColors);
		
		//get set of entries
		 // Get a set of the entries
	      Set<Entry<String, ArrayList<String>>> setMap = colorMap.entrySet();
				        
				        // Get an iterator
	   	Iterator<Entry<String,  ArrayList<String>>> iteratorMap = setMap.iterator();
		
			         
		    System.out.println("\nHashMap with Multiple Values");
		
	
			        while(iteratorMap.hasNext()) {
		          Map.Entry<String, ArrayList<String>> entry =
		                    (Map.Entry<String, ArrayList<String>>) iteratorMap.next();
		
			            String key = entry.getKey();
	           List<String> values = entry.getValue();
		            System.out.println("Key = '" + key + "' has values: " + values);
		
			        }
		}//end main
}//end HashMapEx2
