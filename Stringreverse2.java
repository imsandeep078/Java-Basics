import java.util.*;
class Stringreverse2
{
public static void main(String[] ar)
{
System.out.println("Enter String");
String s=new Scanner(System.in).next();
int len=s.length();
System.out.print("Reverse of a String '"+s+"' is  : ")
while (len >0)
{
System.out.print(s.charAt(len-1));
len--;
}
}
}