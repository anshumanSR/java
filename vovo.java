import java.util.Scanner;
class vovo
{
public static void main (String args[])
{
Scanner sc= new Scanner (System.in);
char vo;
System.out.println("enter char: ");
vo=sc.next().charAt(0);
System.out.println(vo=='a' || vo== 'e' || vo=='i' || vo=='o' || vo=='u' ? "vowel" : "consonant");
//System.out.println( (((vo=='a'||vo=='e')||(vo=='i'|| vo=='o'))|| vo=='u') ? "vowel" : "consonant");
}
}