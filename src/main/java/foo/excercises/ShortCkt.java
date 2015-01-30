package foo.excercises;

public class ShortCkt
{
public static void main(String args[])
{
int i = 0;
boolean t = true;
boolean f = false;
boolean	b= true;
b = (t | ((i++) == 0));
b = (f | ((i+=2) > 0));
System.out.println(i);
}
}