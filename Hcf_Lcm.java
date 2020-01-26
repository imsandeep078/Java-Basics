import java.util.Scanner;
 
public class Hcf_Lcm
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
 
while (b != 0) 
{
t = b;
b = a % b;
a = t;
}
hcf = a;
lcm=x*y/hcf;
		
System.out.println("HCF = " + hcf +" LCM = " + lcm);
}
}