// TO DELETE/REMOVE ELEMENT FROM AN ARRAY

import java.util.*;
class DeleteElement
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5],count=0;
for(int i=0;i<5;i++)
{
System.out.print("Enter "+i+" Element : "+a[i]);
a[i]=sc.nextInt();
}
System.out.print("Enter Delete item : ");
int del=sc.nextInt();
for(int i=0;i<a.length;i++)
{
if(del==a[i])
{
for(int j=i;j<a.length-1;j++)
{
a[j]=a[j+1];
count++;
break;
}
}
}
if(count==0)
{
System.out.print("Element not found");
}
else
{
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+ " ");
}
}
}
}
