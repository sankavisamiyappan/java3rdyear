 public class Prime2
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int length=args.length;
if(length==0)
{
System.out.println("please enter the integer number");
}
if(a==1)
{
System.out.println("1 is neigther primre or composition");
}
else if(a==0)
{
System.out.println("1 is neigther primre or composition");
}
else
{
int i,flag=0;
for(i=2;i<=a/2;i++)
{
if(a%i== 0)
{
flag=1;
break;
}
}
if(flag== 0)
{
System.out.println("This is a Prime Number");
}
else
 {
System.out.println("This is not a Prime Number");
}
flag=0;
}
}
}
