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
	String[] array1 = new String[3];
	
	String[] array2 = {"red","blue","black","green"}; 
	
	List <String> list = new ArrayList<String>();
	
	List<String> linkList = new LinkedList<String>();
	
	Set <String> set = new HashSet<String>(list);
	
	Set <String> set2 = new HashSet<String>();
	
	SortedSet <String> tree1= new TreeSet <String>(); 
	
	SortedSet <String> tree= new TreeSet <String>(Arrays.asList(array1));
	
	Map <String , Integer> myMap = new HashMap <String, Integer> ();	
	
	Iterator<String> iterator=list.iterator();
}//end HowToCreate
