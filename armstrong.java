import java.util.Scanner;
public class armstrong
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit");
int limit=s.nextInt();
int a,b,c,sum;
b=1;
System.out.println("Armstrong numbers are:");
while(b<=limit)
{
sum=0;
c=b;
while(c>0)
{
a=c%10;
sum += (a * a * a);
c /= 10;
}
if(sum==b)
{
System.out.print(b+"\t");
}
b++;
}
}
}