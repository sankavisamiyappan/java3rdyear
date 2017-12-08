class Palindrome
{
public static void main(String args[])
{
String s1=args[0];
StringBuffer sb=new StringBuffer(s1);
String s2=sb.reverse().toString();
if(s1.equals(s2))
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not palindrome");
}
}
}
