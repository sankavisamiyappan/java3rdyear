 import java.util.Scanner;
class Color
{
public static void main(String args[])
{
Scanner sr=new Scanner(System.in);
String s=sr.next();
switch(s)
{
case "R":System.out.println("R->Red");
break;
case "B":System.out.println("B->Blue");
break;
case "G":System.out.println("G->Green");
break;
case "O":System.out.println("O->Orange");
break;
case "Y":System.out.println("Y->Yellow");
break;
case "W":System.out.println("W->White");
break;
default:System.out.println("invalid color");
}
}
}

