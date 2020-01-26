import java.util.*;
class Searching
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[20],Search;
for(int i=0;i<5;i++)
{
System.out.print("Enter "+i+" Element : ");
a[i]=sc.nextInt();
}
System.out.print("Enter Searching Element : ");
Search=sc.nextInt();
for(int i=0;i<5;i++)
{
if(Search==a[i])
{
System.out.println("Element is present at " +i+" position");
}
}
}
}