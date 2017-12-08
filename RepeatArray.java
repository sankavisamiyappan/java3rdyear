class RepeatArray
{
public static void main(String args[])
{
int temp;
int count=0;
int arr[]={10,20,10,30,40};
int len=arr.length;
for(int i=0;i<len;i++)
{
for(int j=i+1;j<len;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int k=0;k<len;k++)
{
for(int m=k+1;m<len;m++)
{
if(arr[k]==arr[m])
{
System.out.println("the repeated  element is"  +arr[k]);
count=1;
k=k+1;
break;
}
else
{
count=0;
}
}
}
}
}
