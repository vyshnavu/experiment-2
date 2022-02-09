import java.util.Scanner;
class summatrix
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int m,n,i,j;
int a[][]=new int[100][100];
int b[][]=new int[100][100];
int c[][]=new int[100][100];
System.out.println("enter the no of rows and columns");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("enter the matrix 1");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=obj.nextInt();
System.out.println("enter the matrix 2");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=obj.nextInt();
for(i=0;i<m;i++)
for(j=0;j<n;j++)
c[i][j]=a[i][j]+b[i][j];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]);
}
System.out.println("");}
}}
