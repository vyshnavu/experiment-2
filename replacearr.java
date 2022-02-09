import java.util.*;
class replacearr
{
public static void main(String args[])
{
int i,p,n,x;
int a[]=new int[100];
Scanner obj=new Scanner(System.in);
System.out.println("enter the number of elements");
n=obj.nextInt();
System.out.println("enter the elements");
for(i=0;i<n;i++)
a[i]=obj.nextInt();
System.out.println("enter the position to chnage the element");
p=obj.nextInt();
System.out.println("enter the element");
x=obj.nextInt();
a[p]=x;
for(i=0;i<n;i++)
{System.out.println(a[i]);
}
}}
