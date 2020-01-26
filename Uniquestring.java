// TO FIND NO. OF FREQUENCY OF UNIQUE STRING

import java.util.*;
class Uniquestring
{
public static void main(String[] ar)
{
int[] a=new int[26];
System.out.print("Enter the String : ");
String s=new Scanner(System.in).next();
System.out.println("Length of String is : "+s.length());
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)>=65 && s.charAt(i)<=90)
{
a[s.charAt(i)-65]++;
}
else if(s.charAt(i)>=97 && s.charAt(i)<=122)
{
a[s.charAt(i)-97]++;
}
}
for(int i=0;i<26;i++)
{
if(a[i]>0)
{
System.out.println((char)(i+65)+" "+a[i]);
}
}
}
}