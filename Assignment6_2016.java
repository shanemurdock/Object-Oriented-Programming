/**
 *
 * Student Name; Shane Murdock	
 * Student Number: 2899741
 */

public class Assignment6_2016{
	public static void main(String args[]){
	  Shape s1 = new Square("Square",5.2, 5.2);
	  s1.display();
	  System.out.printf("%.2f",s1.area());
	}
}
//Q1  =============================================
//Add classes for Q1 here =========================

public class ShapeTest{
	public static void main(String args[]){
	  Shape s1 = new Square("Square", 5.2, 5.2);
	  s1.display();
	  System.out.printf("%.2f",s1.area());
	  Shape s2 = new Circle("Circle", 6);
	  s2.display();
	  System.out.printf("%.2f",s2.perimeter());
	}
}
abstract class Shape{
	private String name;
	public Shape(String n){name = n;}
	public abstract double area();
	public abstract double perimeter();
	public String name(){return name;}
	public void display(){
		System.out.printf("%s with area %6.2f and perimeter %6.2f\n",
			 name, area(), perimeter());
	}
}

class Square extends Shape{
	private double width, length;
	public Square(String n, double w, double l){
		super(n); width = w; length = l;
	}
	public double width(){return width;}
	public double length(){return length;}
	public double area(){return width*length;}
	public double perimeter(){return 2*width + 2*length;}
	public double diagonal(){
		return Math.sqrt(width*width+length*length);
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(String n, double r){
		super(n); radius = r; 
	}
	public double radius(){return radius;}
	public double area(){return Math.PI * (radius * radius);}
	public double perimeter(){return Math.PI * 2 * radius;}
}


//Q2 ===============================================
//edit this class here =============================
class CarTest{
	public static void main(String [] args){
		Car car1 = new Car("05D12263", "Mitsubishi", 5000, 2000.00);
			car1.toString();
			System.out.println(car1);
	}
}

class Car{
	private final String reg;
	private final String make;
	private final int kilometers;
	private final double price;
	public Car(String r, String m, int k, double p){
	 reg = r; make = m; kilometers = k; price = p; 
	}
	public String reg(){return reg;}
	public String make(){return make;}
	public int kilomters(){return kilometers;}
	public double price(){return price;}
	public String toString(){
		return reg+", "+make+", "+kilometers+", "+price;
	}
}


//Q3 ==================================================
// See separate file RationalTest.java on Moodle to develop your test code
// When you are finished you should copy your RationalTest class code here
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
public class RationalTest{
 Rational r1 = new Rational(1,2);
 Rational r2 = new Rational(3,4);
 Rational r3 = new Rational(-1,2);
 Rational r4 = new Rational(1,4);
 Rational dt[];
 public RationalTest(){
   dt = new Rational[4];
   dt[0] = r1; dt[1] = r2; dt[2] = r3; dt[3] = r4;
 }
 @Test
 public void testAdd1(){
    assertEquals(r1.add(r3),new Rational(0));
 }
 @Test
 public void testSub1(){
    assertEquals(r2.sub(r4),new Rational(1,2));
 }
 @Test
 public void testMult1(){
 	assertEquals(r3.mult(r1),new Rational(-1,4));
 }
 @Test
 public void testDiv1(){
 	assertEquals(r4.div(r1),new Rational(1,2));
 }
 @Test 
 public void testEquals1(){
 	assertEquals(r1.equals(r2),new Rational(false));
 }
}
//Given below is the class Rational. ========================
// Do not edit this code ====================================
 
class Rational{
	private final int num, den;
	Rational(int n, int d){
		assert d != 0;
		if(n == 0){num = 0; den = 1;}
		else{
		  int g = gcd(Math.abs(n), Math.abs(d)); 
		  if(n < 0 && d < 0){num = -n/g; den = -d/g;}
		  else if(d < 0) { num = -n/g; den = -d/g;} 
		  else {num = n/g; den = d/g;}
		}
	}
	Rational(int n){num = n; den = 1;}
	public int num(){return num;}
	public int den(){return den;}
	public String toString(){
		 if(num == 0) return num+"";
		 else if(den == 1) return num+"";
		 else return num+"/"+den;
	}
	public Rational add(Rational k ){
		assert k != null;
		return new Rational(num*k.den+k.num*den, den*k.den);
	}
	public Rational sub(Rational k){
		assert k != null;
		return new Rational(num*k.den - k.num*den, den*k.den);
	}
	public Rational mult(Rational k){
		assert k != null;
		return new Rational(num*k.num,den*k.den);
	}
	public Rational div(Rational k){
		assert k != null;
		return new Rational(num*k.den, den*k.num);
	}
	public Rational add(int x){return new Rational(num+den*x,den);}
	public Rational sub(int x){return new Rational(num-den*x,den);}
	public Rational mult(int x){return new Rational(x*num,den);}
	public Rational div(int x){return new Rational(num,den*x);}
  public boolean equals(Object ob){
  	if(!(ob instanceof Rational)) return false;
  	Rational p = (Rational)ob;
  	return num == p.num && den == p.den;
  }
	//Private methods ===========================================
	private int gcd(int a, int b){ 
	  //implements Euclid's algorithm to find greatest common divisor
		if(a == b) return a;
		while(a != b) if(a > b) a = a - b; else b = b - a; return a;  
		// recursive version of Euclid
		//if(b==0) return a; else return gcd(b,a % b); 
	}
	
}


// =====================================================