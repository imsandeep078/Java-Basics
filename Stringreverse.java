import java.util.*;
class Stringreverse
{
public static void main(String[] ar)
{
System.out.println("Enter String");
String s=new Scanner(System.in).next();
StringBuffer s1=new StringBuffer(s);
s1=s1.reverse();
System.out.println("Reverse of String is : "+s1);
}
}