import java.util.*;
class Starpattern2
{
public static void main(String[] ar)
{
for(int i=1;i<=5;i++)
{
for(int j=5;j>=i;j--)
{
System.out.print("*");
}
System.out.println();
}
}
}