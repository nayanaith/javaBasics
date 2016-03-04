package foo.collections;

import java.util.HashMap;

public class HashMapSample {
	static HashMap<String,Boolean> myMap=new HashMap<>();
	
	public static void main(String args[]){
			myMap.put("Naya",true);
			myMap.put("John",false);
			myMap.put("Gayathri",false);
			myMap.put("Senaka",false);
		
			for(String keyValue:myMap.keySet()){
				if(myMap.get(keyValue)==true)
					System.out.printf("%s \t",keyValue);
			}//end for
			
			System.out.println();
	}//end main
}//end HashMapSample
