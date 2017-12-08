class  Prime1
{
 public static void main(String args[])
 {
 int i,j,flag=0;
for(i=10;i<=99;i++)
{
for(j=2; j<=i/2; j++)
{
if(i%j == 0)
{
flag=1;
}
}
if(flag==0)
{
System.out.println("The Prime Number are"+i);
}
flag=0;
}
}
}
