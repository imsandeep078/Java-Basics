// TO REMOVE DUPLICACY FOR BOTH SORTED OR UNSORTED IN AN ARRAY(INTEGER VALUES)

import java.util.*;
class RemoveDuplicacy2
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++)
{
System.out.print("Enter "+i+" Element : "+a[i]);
a[i]=sc.nextInt();
}
HashSet<Integer> h=new HashSet<>();
{
for(int i=0;i<5;i++)
{
h.add(a[i]);
}
}
for(int n : h)
{
System.out.println(n+ " ");
}
}
}