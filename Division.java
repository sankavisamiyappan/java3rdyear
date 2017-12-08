 import java.util.Scanner;
class Division
{
public static void main(String args[])
{
int i;
Scanner sr=new Scanner(System.in);
int n=sr.nextInt();
for(i=0;i<=n;i++)
{
if((i%2==0)&&(i%3==0)&&(i%5==0))
{
System.out.println(i);
}
}
}
}
