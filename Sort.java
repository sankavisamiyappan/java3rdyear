 class Sort
{
public static void main(String args[])
{
int temp;
int arr[]={65,75,95,85,45};
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
System.out.println("the sorted element is"  +arr[k]);
}
}
}

