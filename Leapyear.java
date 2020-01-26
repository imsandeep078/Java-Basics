import java.util.*;
class Leapyear
{
public static void main(String[] ar)
{
System.out.print("Enter Year : ");
int year=new Scanner(System.in).nextInt();
if(((year%4==0 )&&( year%100!=0) ) || (year%400==0))
System.out.println(year+" is a Leap Year");
else
System.out.println(year+" is not a Leap Year");
}
}
