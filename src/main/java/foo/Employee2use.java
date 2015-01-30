package foo;

public class Employee2use {
	public static void main(String args[]){				
		System.out.printf("# of Employees before instantiation: %d\n",Employee2.getCount());
		
		Employee2 e1=new Employee2("Bunti","Babara");
		Employee2 e2=new Employee2("Brow","Babara");
		
		//show that 'static count' value is always same when accessed from all available paths
		System.out.println("\nEmployees after instantiation:");
		System.out.printf("via e1.getCount :%d\n",Employee2.getCount());
		System.out.printf("via e2.getCount :%d\n",Employee2.getCount());
		System.out.printf("via Employee2.getCount(): %d\n\n",Employee2.getCount());
		
		
		//get names of Employees
		System.out.println("First Name\tLast Name");
		System.out.printf("%s\t\t%s\n",e1.getFirstName(),e1.getLastName());
		
		System.out.printf("%s\t\t%s",e2.getFirstName(),e2.getLastName());
		
		e1=null;
		e2=null;

		
	}//end main
}//end class
