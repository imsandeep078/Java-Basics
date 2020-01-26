// TO FIND THE MISSING NUMBER IN AN ARRAY

import java.util.*;
class MissingNum1
{
public static void main(String[] ar)
{
int a[]={1,2,3,4,5,6,7,8,9,11};
int total_len=a.length+1;
int total_sum=total_len*(total_len+1)/2;
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.print("Missing No. is : "+(total_sum-sum));
}
}