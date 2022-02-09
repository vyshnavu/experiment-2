import java.util.Scanner;
class largematrix
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int m,n,i,j,large;
int a[][]=new int[100][100];
System.out.println("enter the no of rows and columns");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("enter the matrix");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=obj.nextInt();
large=a[0][0];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{if(a[i][j]>large)
large=a[i][j];
}}
System.out.println("the largest elemnt is"+large);
}}
