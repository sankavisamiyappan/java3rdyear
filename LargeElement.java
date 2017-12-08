 class  LargeElement
{
public static void main(String args[])
{
int temp;
int arr[]={1,2,3,4,5};
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
System.out.println("the first min"+arr[0]+" "+ "second min"+arr[1]);
System.out.println("the first max"+arr[len-1] +" " +"second min"+arr[len-2]);
}
}
