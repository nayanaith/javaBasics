package foo.unitest.enums;

//import java.util.Scanner;

public class UsConValues {
    public static void main(String args[]){
        Currency cur=Currency.DIME;
        showMe(cur);
       // Scanner in = new Scanner(System.in);
        //Currency cu =new Currency(12);
    }//end main
   
    public static void showMe(Currency cur){
        switch (cur) {
        case PENNY:
            System.out.print("Penny coin\t");
            System.out.printf("%d",cur.getValue(cur));
                break;
        case NICKLE:
            System.out.print("Nickle coin\t");
            System.out.printf("%d",cur.getValue(cur));
                break;
        case DIME:
            System.out.print("Dime coin\t");
            System.out.printf("%d",cur.getValue(cur));
                break;
        case QUARTER:
            System.out.print("Quarter coin\t");
            System.out.printf("%d",cur.getValue(cur));
        }//end switch
    }//end printUsCoin
}//end class
