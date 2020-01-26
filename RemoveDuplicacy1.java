// TO REMOVE DUPLICACY IN A SORTED ARRAY(INTEGER VALUES)

import java.util.*;
class RemoveDuplicacy1
{
public static void main(String[] ar)
{
int a[]=new int[5],j=0;;
for(int i=0;i<5;i++)
{
System.out.print("Enter "+i+" Element : "+a[i]);
a[i]=new Scanner(System.in).nextInt();
}
for(int i=0;i<a.length-1;i++)
{
if(a[i]!=a[i+1])
{
a[j]=a[i];
j++;
}
}
a[j]=a[a.length-1];
{
for(int i=0;i<j+1;i++)
{
System.out.println(a[i]);
}
}
}
}