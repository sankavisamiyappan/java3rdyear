import java.util.Scanner;
class ReverseNumber
{
public static void main(String args[])
{
int arr[]=new int[3];
Scanner s= new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
for(int i=0;i<3;i++)
{
int r=n%10;
arr[i]=r;
n=n/10;
}
}
for(int j=0;j<3;j++)
{
System.out.print(arr[j]);
}
}
}
