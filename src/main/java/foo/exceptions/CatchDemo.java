package foo.exceptions;

/**
 * Created by Naya on 5/31/2014.
 */
public class CatchDemo {
    public static void main(String[] args){
        System.out.println("Instantiating a MyFileUtilities object...");
        MyFileUtilities util=new MyFileUtilities("F:\\programing\\git\\javaBasics\\utils\\first.txt");
       
      //  MyFileUtilities util=new MyFileUtilities(args[0]);
        System.out.println("Invoking readOneByte() method...");
        System.out.println(util.readOneByte());
    }
}//end class
