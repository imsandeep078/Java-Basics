// TO REMOVE DUPLICACY IN A SORTED ARRAY USING TEMPORARY ARRAY(INTEGER VALUES)

import java.util.*;
class RemoveDuplicacy
{
public static void main(String[] ar)
{
int a[]=new int[5],j=0;;
int temp[]=new int[a.length];
for(int i=0;i<5;i++)
{
System.out.print("Enter "+i+" Element : "+a[i]);
a[i]=new Scanner(System.in).nextInt();
}
for(int i=0;i<a.length-1;i++)
{
if(a[i]!=a[i+1])
{
temp[j]=a[i];
j++;
}
}
temp[j]=a[a.length-1];
{
for(int i=0;i<temp.length;i++)
{
System.out.println(temp[i]);
}
}
}
}