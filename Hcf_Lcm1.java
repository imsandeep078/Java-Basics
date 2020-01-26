import java.util.Scanner;
 
public class Hcf_Lcm1
{
public static void main(String args[]) 
{
		
int a, b, x, y, t, hcf, lcm;
Scanner scan = new Scanner(System.in);
 
System.out.print("Enter 1st Number : ");
x = scan.nextInt();
System.out.print("Enter 2nd Number : ");
y = scan.nextInt();
 
a = x;
b = y;
 
while (a!= b) 
{
if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}

hcf = a;
lcm=x*y/hcf;
		
System.out.println("HCF = " + hcf +" LCM = " + lcm);
}
}