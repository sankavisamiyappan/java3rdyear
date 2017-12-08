class Switch
{
public static void main(String args[])
{
int length=args.length;
if(length==0)
{
System.out.println("please enter the number of month");
}
else
{
int s=Integer.parseInt(args[0]);
switch(s)
{
case 1:System.out.println("januvary");
break;
case 2:System.out.println("febrary");
break;
case 3:System.out.println("march");
break;
case 4:System.out.println("april");
break;
case 5:System.out.println("may");
break;
case 6:System.out.println("june");
break;
default:System.out.println("invalid month");
}
}
}
}

