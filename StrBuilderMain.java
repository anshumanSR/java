import java.io.*;
class StrBuilderMain
{
public static void main(String [] args)
{
StringBuilder s1= new StringBuilder("Java Programming");
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(" ");
s1.append(" Language");
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(" ");
s1.insert( 1, "OPPS");
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(" ");
s1.replace(1,5, " hehe");
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(" ");
s1.delete( 1,5 );
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(" ");
s1.reverse();
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(" ");



}
}