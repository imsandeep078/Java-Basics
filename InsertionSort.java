class InsertionSort
{
public static void main(String[] ar)
{
int a[]={23,43,45,2,34,55,66};
int temp,j;
for(int i=0;i<a.length;i++)
{
temp=a[i];
j=i;
while(j>0 && a[j-1]>temp)
{
a[j]=a[j-1];
j=j-1;
}
a[j]=temp;
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}