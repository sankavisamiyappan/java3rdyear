class DuplicateArray
{
public static void main(String args[])
{
int temp;
int count=0;
int arr[]={65,75,95,85,45,75};
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
count=1;
break;
}
else
{
count=0;
}
}
if(count==0)
{
System.out.println("the sorted element is"  +arr[k]);
}
}
}
}

