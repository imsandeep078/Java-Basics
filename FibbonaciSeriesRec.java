// FIBBONACCI SERIES USING RECURSION

class FibbonaciSeriesRec
{
static int a=0,b=1,c;
public static void main(String[] ar)
{
System.out.print(a+" "+b);
FibbonaciSeriesRec f=new FibbonaciSeriesRec();
f.fib(10);
}
void fib(int i)
{
if(i>=1)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
fib(i-1);
}
}
}