 class Pattern
{
 public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int i,j;
for(i=1;i<=a;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*"+" ");
}
System.out.println();
}
}
}
