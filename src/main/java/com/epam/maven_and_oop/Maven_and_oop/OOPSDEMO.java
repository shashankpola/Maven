package com.epam.maven_and_oop.Maven_and_oop;
class A implements A1{
	public void NUM()
	{
		System.out.println("all NUMs");
	}

public void dis() {
System.out.println("A");
}
}
class B extends A {
@Override
public void dis() {
System.out.println("B");
}
public int add(int x, int y) {
return x+y;
}
public double add(double x,double y) {
return x+y;
}
}
class Enc {
private String na;
public String getna() {
return na;
}
public void setna(String nen) {
na = nen;
}
}
abstract class Tw {
public abstract void run();
}
class Scooty extends Tw{
public void run(){
System.out.println("\nScooty is Running..");
}
}
public class OOPSDEMO {
	public static void main(String[] args) {
		A a=new A();
		a.dis();
		B b=new B();
		b.dis();
		System.out.println(b.add(44,77));
		System.out.println(b.add(4.,7.));
		Enc cap = new Enc();
		cap.setna("Shashank");
		System.out.print("name : " + cap.getna() );
		Tw test = new Scooty();
		test.run();
		}
}
