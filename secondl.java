import java.util.*;
class secondl
{
public static void main(String args[])
{
int i,j,n,temp;
int a[]=new int[100];
Scanner obj=new Scanner(System.in);
System.out.println("enter the number of elements");
n=obj.nextInt();
System.out.println("enter the elements");
for(i=0;i<n;i++)
a[i]=obj.nextInt();
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{if(a[j]>a[j+1])
{temp=a[j];
a[j]=a[j=1];
a[j+1]=temp;
}
}
}
System.out.println("the second largest elemnt is"+a[n-2]);
}}
