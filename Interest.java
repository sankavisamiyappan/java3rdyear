 class Interest
{
public static void main(String args[])
{
String gender=args[0];
int age=Integer.parseInt(args[1]);
if((gender.equals("female"))&& (age>=1 && age<=58))
{
System.out.println("the interest is==8.2%");
}
else if((gender.equals("female"))&& (age>=59 && age<=120))
{
System.out.println("the interest is==7.6%");
}
else if((gender.equals("male")) && (age>=1 && age<=60))
{
System.out.println("the interest is==9.2%");
}
else if((gender.equals("male") )&& (age>=61 && age<=120))
{
System.out.println("the interest is==8.3%");
}
else
{
System.out.println("not valid");
}
}
}

