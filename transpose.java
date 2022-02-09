import java.util.Scanner;
class transpose
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int m,n,i,j;
int a[][]=new int[100][100];
int b[][]=new int[100][100];
System.out.println("enter the no of rows and columns");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("enter the matrix");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=obj.nextInt();
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{b[i][j]=a[j][i];
}}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
System.out.print(b[i][j]);
System.out.println("");
}
}}
