import java.util.Scanner;
class Add
{
public static void main(String args[])
{
Scanner sr=new Scanner(System.in);
char d=' ';
do
{
System.out.println("enter 1 add&enter 2 sub");
int n=sr.nextInt();
int n1=sr.nextInt();
int n2=sr.nextInt();
if(n==1)
{
 System.out.println(n1+n2);
}
else if(n==2)
{
 System.out.println(n1-n2);
}
System.out.println("enter y to continue");
 d=sr.next().charAt(0);
continue;
}while((d=='y')||(d=='y'));

}
}
