package foo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonManupulate{
	public static void main(String args[]){
		
		Person p1=new Person("102", "Nimal","Bandara");
		Person p2=new Person("123", "Sunil","Gunapala");
		Person p3=new Person("32","Pikal","Jinendra");
		Person p4=new Person("456","Ranidu","Sepala");
		
		ArrayList<Person> pList=new ArrayList<Person>();
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		
		for(Person p:pList){
			System.out.printf("%s", p);
		}
		
		Collections.sort(pList, Person.SORT_fName);
		
		for(Person p:pList){
			System.out.printf("%s", p);
		}
	}//end main
}//end PersonManupulate
