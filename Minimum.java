import java.util.*;
class Largest
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[20],min=0;
for(int i=0;i<5;i++)
{
System.out.print("Enter "+i+" Element : ");
a[i]=sc.nextInt();
}
min=a[0];
for(int i=0;i<5;i++)
{
if(min>a[i])
{
min=a[i];
}
}
System.out.println(min);
}
}