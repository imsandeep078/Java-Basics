class SelectionSort
{
public static void main(String[] ar)
{
int a[]={23,43,45,2,34,55,66};
int temp,min;
for(int i=0;i<a.length;i++)
{
min=i;
for(int j=i+1;j<a.length;j++)
{
if(a[j]<a[min])
{
min=j;
}
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}