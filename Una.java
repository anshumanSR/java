import java.util.Scanner;
class Una
{
public static void main( String args[])
{
Scanner sc= new Scanner (System.in);
System.out.print("enter a number: ");
int a= sc.nextInt();
System.out.print("enter another number: ");
int b= sc.nextInt();
int ans = a>>2;
System.out.println("answer is: " +ans);


}
}