// TO FIND THE MISSING NUMBER IN AN ARRAY(MOST EFFICIENT)

import java.util.*;
class MissingNum2
{
public static void main(String[] ar)
{
int[] a={1,2,3,4,5,6,7,8,9,11};
int XOR1=a[0];
for(int i=1;i<a.length;i++)
{
XOR1=XOR1^a[i];
}
int XOR2=1;
for(int i=2;i<=a.length+1;i++)
{
XOR2=XOR2^i;
}
System.out.print("Missing No. is : "+(XOR1^XOR2));
}
}