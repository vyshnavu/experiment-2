import java.util.*;
class arrsmall
{
public static void main(String args[])
{
int i,n,small;
int a[]=new int[100];
Scanner obj=new Scanner(System.in);
System.out.println("enter the number of elements");
n=obj.nextInt();
System.out.println("enter the elements");
for(i=0;i<n;i++)
a[i]=obj.nextInt();
small=a[0];
for(i=1;i<n;i++)
{if(a[i]<small)
small=a[i];
}
System.out.println("smallest num is"+small);
}}

