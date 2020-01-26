// TO FIND MISSING NUMBER IN ARRAY

class Missingnum
{
public static void main(String[] ar)
{
int[] a=new int[] {1,2,3,5,6,9,11,12,14,16,17,19,21};
for(int i=1;i<a.length;i++)
{
if((a[i]-a[i-1])!=1)
{
System.out.println("no is missing between "+a[i-1]+ " and "+a[i]);
}
}
}
}