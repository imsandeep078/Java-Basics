import java.util.*;
class Intreverse
{
public static void main(String[] arg)
{
int a=new Scanner(System.in).nextInt();
int rev=0;
while(a!=0)
{
rev=rev*10;
rev=rev+a%10;
a=a/10;
}
System.out.println(rev);
}
}