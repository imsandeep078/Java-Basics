class BubbleSort
{
public static void main(String[] ar)
{
int a[]={23,43,45,2,34,55,66};
int temp,count=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length-1-i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;

count=1;
}
}
if(count==0)
{
break;
}
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}