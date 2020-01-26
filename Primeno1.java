// TO FIND PRIME NUMBER BETWEEN TWO NUMBERS 

import java.util.*;
class Primeno1
{
public static void main(String[] ar)
{
System.out.print("Enter 1st Number : ");
int start=new Scanner(System.in).nextInt();
System.out.print("Enter 2nd Number : ");
int last=new Scanner(System.in).nextInt();

int count=0;
for (int i = start; i <= last; i++)
{
for (int j = 2; j < i; j++)
{
if (i % j == 0)
{
count = 0;
break;
}
else
{
count = 1;
}
}
if (count == 1 || i==2)
{
System.out.print(i+ " ");
}
}
}
}