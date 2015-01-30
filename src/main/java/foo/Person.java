package foo;

import java.util.Comparator;

public class Person {
	String id;
	String fname;
	String lname;
	
	public Person(String id, String fname, String lname){
		this.id=id;
		this.fname=fname;
		this.lname=lname;
	}//end constructor
	
	public String getId(){
		return id;
	}
	
	public String getFname(){
		return fname;
	}
	
	public String getLname(){
		return lname;
	}
	
	
@Override
public String toString(){
	return "ID :"+this.getId()+"\tFname:"+this.getFname()+"\tLname: "+this.getLname()+"\n";
}//end toString

//@Override
//public int compareTo(Person ob) {
//	return this.getId().compareTo(ob.getId());
//}

static final Comparator<Person> SORT_fName =  new Comparator<Person>(){
    public int compare(Person o1, Person o2) {
        int result = o1.getFname().compareTo(o2.getFname());
        if (o1.getFname().equals(o2.getFname()))
            result =o1.getFname().compareTo(o2.getFname())*-1;
        return (result);
    }
};
	
}//end class
