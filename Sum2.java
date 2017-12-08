 class Sum1
{
public static void main(String args[])
{
int sum=0;
int position1=0,position2=0;
int arr[]={10,3,6,1,2,7,9};
int len=arr.length;
for(int i=0;i<len;i++)
{
if(arr[i]==6)
{
position1=i;
}
if(arr[i]==7)
{
position2=i;
}
}
for(int i=0;i<len;i++)
{
if(position1>position2)
{
sum=sum+arr[i];
}
else
{
if((i>=0 && i<=position1-1) || (i>=position2+1 && i<= len-1))
{
sum=sum+arr[i];
}
}
}
System.out.println("the sum is"+sum);
}
}
