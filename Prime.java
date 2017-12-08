 import java.util.Scanner;
public class Prime
{
public static void main(String args[])
{
 int num, i, count=1;
Scanner scan = new Scanner(System.in);
System.out.print("Enter a Number : ");
num = scan.nextInt();
for(i=2; i<=num/2; i++)
{
if(num%i == 0)
{
count=count+1; 
}
}
if(count == 1)
{
System.out.println("This is a Prime Number");
}
else
{
System.out.println("This is not a Prime Number");
 }
 }
}
