package com.epam.maven_and_oop.Maven_and_oop;

import java.util.Scanner;

public class Chocolate implements newtask
{
int co;
public void choc(int c)
{
co=c;
}
public void swe(int c)
{
co=c;
}
public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("number of chocolates");
int n=sc.nextInt();
Chocolate a[]=new Chocolate[n];
for(int i=0;i<n;i++)
{
a[i]=new Chocolate();
}
System.out.println("cost of chocolates");
for(int i=0;i<n;i++)
{ 
int cos=sc.nextInt();
a[i].choc(cos);
}
System.out.println("number of biscuits");
int n1=sc.nextInt();
Chocolate b[]=new Chocolate[n1];
for(int i=0;i<n1;i++)
{
b[i]=new Chocolate();
}
System.out.println("cost of biscuits");
for(int i=0;i<n;i++)
{ 
int cost=sc.nextInt();
b[i].swe(cost);
}
for(int i=0;i<n;i++)
{
for(int j=1;j<n-i;j++)
{ 
if(a[j-1].co> a[j].co)
{  
int temp;
    temp =a[j-1].co;  
    a[j-1].co = a[j].co;  
    a[j].co = temp;  
}  
}
}
for(int i=0;i<n;i++)
System.out.println(a[i].co);
System.out.println("Enter a range");
int x=sc.nextInt();
int y=sc.nextInt();
for(int i=0;i<n1;i++)
{
if(b[i].co>=x && b[i].co<=y)
System.out.println("candie"+(i+1));
}
sc.close();
 }

}
