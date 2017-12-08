class Character1
{
public static void main(String args[])
{
char c1='A';
int in1=(int)c1;
for(int i = 97; i <=122; i++)
 {             
  if(in1==i)
{
 char c2= Character.toUpperCase(c1);
System.out.println(c1+"->"+c2);
 }   
}
for(int i=65;i<=90;i++)
{
if(in1==i)
{
 char c2=Character.toLowerCase(c1);
{
System.out.println(c1+"->"+c2);
}
}
}
}
}
