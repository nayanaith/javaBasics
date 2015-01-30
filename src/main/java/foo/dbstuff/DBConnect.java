package foo.dbstuff;
import java.sql.*;

public class DBConnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
public DBConnect(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
		 st=con.createStatement();
		 
	}catch(Exception ex){
		System.out.println("Error"+ex);
	}
}//end constructor

public void getData(){
	try{
		String query = "select * from persons";
		rs = st.executeQuery(query);
		System.out.println("Records from data base");
		
		while (rs.next()){
			String name = rs.getString("name");
			String age = rs.getString("age");
			System.out.println("Name: "+name+"  "+"Age: "+age);
		}
	}catch (Exception ex){
		System.out.println(ex);
	}
}//end getData

}//end DBConnect
