// EVEN NUMBERS PATTERN

class Numpattern
{
public static void main(String[] ar)
{
for(int i=1;i<=5;i++)
{
int count=i;
for(int j=1;j<=i;j++)
{
int num=2*count;
System.out.print(num+" ");
count++;
}
System.out.println();
}
}
}