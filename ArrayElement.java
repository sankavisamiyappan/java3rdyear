 import java.util.Scanner;
class ArrayElement
{
public static void main(String args[])
{
Scanner sr=new Scanner(System.in);
System.out.println("enter the emement to search");
int n=sr.nextInt();
int flag=0;
int arr[]={1,4,34,56,7};
int len=arr.length;
for(int i=0;i<len;i++)
{
if(n==arr[i])
{
System.out.println("element is"+i              );
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(-1);
}
}
}
