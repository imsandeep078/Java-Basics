// RIGHT ANGLE MIRROR STAR PATTERN

class Starpattern3
{
public static void main(String[] ar)
{
for(int i=0;i<=4;i++)
{
for(int j=4;j>=0;j--)
{
if(i<j)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
}
}