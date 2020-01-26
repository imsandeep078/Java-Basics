import java.util.*;
class Stringreverse1
{
public static void main(String[] ar)
{
System.out.print("Enter Value : ");
String s=new Scanner(System.in).next();
char[] c=s.toCharArray();
for(int i=c.length-1;i>=0;i--)
System.out.print(c[i]);
}
}