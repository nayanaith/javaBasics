package foo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HowToCreate {
	public static void main(String args[]){
	String[] array1 = new String[3];
	
	String[] array2 = {"red","blue","black","green"}; 
	
	/*
	 * Type[] variableName = new Type[capacity];

	   Type[] variableName = {comma-delimited values};
	*/
	
	List <String> list = new ArrayList<String>();
	
	List<String> linkList = new LinkedList<String>();
	
	Set <String> set = new HashSet<String>(list);
	
	Set <String> set2 = new HashSet<String>();
	
	SortedSet <String> tree1= new TreeSet <String>(); 
	
	SortedSet <String> tree= new TreeSet <String>(Arrays.asList(array1));
	
	Map <String , Integer> myMap = new HashMap <String, Integer> ();	
	
	Iterator<String> iterator=list.iterator();
	
	//---- some examples
	List<String> a1 = new ArrayList<String>();
	a1.add("sdf");
	a1.add("Program");
	a1.add("Creek");
	a1.add("Java");
	a1.add("Java");
	System.out.println("ArrayList Elements");
	System.out.print("\t" + a1 + "\n");
	 
	List<String> l1 = new LinkedList<String>();
	l1.add("Program");
	l1.add("Creek");
	l1.add("Java");
	l1.add("Java");
	System.out.println("LinkedList Elements");
	System.out.print("\t" + l1 + "\n");
	 
	Set<String> s1 = new HashSet<String>(); // or new TreeSet() will order the elements;
	s1.add("Program");
	s1.add("Creek");
	s1.add("Java");
	s1.add("Java");
	s1.add("tutorial");
	System.out.println("Set Elements");
	System.out.print("\t" + s1 + "\n");
	 
	Map<String, String> m1 = new HashMap<String, String>(); // or new TreeMap() will order based on keys
	m1.put("Windows", "2000");
	m1.put("Windows", "Windows");
	m1.put("Language", "Java");
	m1.put("Website", "programcreek.com");
	System.out.println("Map Elements");
	System.out.print("\t" + m1);
	
	}//end main
}//end HowToCreate
