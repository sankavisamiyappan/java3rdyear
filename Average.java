 class  Average
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5};
int sum=0,avg;
int len=arr.length;
for(int i=0;i<len;i++)
{
sum=sum+arr[i];
}
avg=sum/len;
System.out.println("the sum is"+sum);
System.out.println("the avg is"+avg);
}
}
