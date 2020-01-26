// TO FIND NUMBER IS PRIME OR NOT?

import java.util.*;
class Primeno
{
public static void main(String[] ar)
{
System.out.println("Enter Number");
int n=new Scanner(System.in).nextInt();
int m=n/2;
int Num=0;
for(int i=2;i>=m;i++)
{
if(n%2==0)
{
System.out.println(n+ " is not a prime number");
Num=1;
break;
}
}
if(Num==0)
{
System.out.println(n+ " is a prime number");
}
}
}