class  Minimum
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5};
int len=arr.length;
int max=-999;
int min=999;
for(int i=0;i<len;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println("the maximum element is"+max);
System.out.println("the minimum element is"+min);
}
}

