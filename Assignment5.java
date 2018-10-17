/**
 *
 * Student Name; Shane Murdock	
 * Student Number: 2899741
 */

public class Assignment5 {
 public static void main(String[] args) {
  //Test Rational class here ========================
  Rational k = new Rational(4,5);
  System.out.println(k);
  Rational k1 = new Rational(20,8);
  System.out.println(k1);
  Rational k2 = k.add(k1);
  System.out.println(k2);
  Rational k3 = k.mult(k1);
  System.out.println(k3);
  Rational k4 = k.sub(k1);
  System.out.println(k4);
  //Rational k5 = k.multBy(k1);
  //int x = 7;
  //System.out.println(k5);
  Rational k6 = k.div(k1);
  System.out.println(k6);
  boolean k7 = k.le(k1);
  System.out.println(k7);
  boolean k8 = k.eq(k1);
  System.out.println(k8);
  boolean k9 = k.gt(k1);
  System.out.println(k9);

  //=================================================
	Rational st[] = {
	 	new Rational(1,2), new Rational(3,5), new Rational (-1,5), 
	 };

	 Rational sum = new Rational(0,1);
	 for(Rational x : st) sum = sum.add(x);
	 	System.out.println("Sum = "+sum);
	 // find smallest number
	 Rational k10 = k.min(k1);
	 System.out.println(k10);
	 // find largest
	 Rational k11 = k.max(k1);
	 System.out.println(k11);

 }
}

interface Operations{
	public Rational add(Rational q);
	public Rational mult(Rational q);
	//public Rational multBy(Rational q, int k);
	public Rational sub(Rational q);
	public Rational div(Rational q);

	public boolean le(Rational q); //returns true if this less than q
	public boolean eq(Rational q); //returns true if this equals q
	public boolean gt(Rational q); //returns true if this greater than q
	public Rational min(Rational q); //returns min of this and q
	public Rational max(Rational q); //returns max of this and q
} 
class Rational implements Operations{
	private int num,den;
	public Rational(int n, int d){//assume d != 0
        if(n < 0 && d < 0){ n = -n; d = -d;}
        else if(d < 0){ n = -n; d = -d;}
        //ensures that d never negative and n positive e.g. 1/-2 is changed to -1/2
        int g = gcd(Math.abs(n), Math.abs(d));
        num = n/g; den = d/g;
	}
	public Rational(int n){num = n; den = 1;}
	public int num(){return num;}
	public int den(){return den;}
	public Rational add(Rational q){
		int n = num*q.den()+den*q.num;
		int d = den*q.den();
		return new Rational(n,d);
	}

	public Rational mult(Rational q){
		int n = num*q.num();
		int d = den*q.den();
		return new Rational(n,d);
	}
	/*public Rational multBy(Rational q,int k){
		int n = num*k;
		int d = den;
		return new Rational (n,d);

	}*/
	public Rational sub(Rational q){
		int n = num*q.den()-den*q.num;
		int d = den*q.den();
		return new Rational(n,d);
	}
	public Rational div(Rational q){
		int n = num*q.den();
		int d = den*q.num();
		return new Rational(n,d);
	}
	public boolean le(Rational q){
		int i = 0; 
		int x = q.num/q.den;
		if(i<x){
			return true;
		}else return false;
	}
	public boolean eq(Rational q){
		int i = 4/5; 
		int x = q.num/q.den;
		if(i==x){
			return true;
		}else return false;
	}
	public boolean gt(Rational q){
		int i = 0; 
		int x = q.num/q.den;
		if(i<x){
			return true;
		}else return false;
	}
	public Rational min(Rational q){
		if(this.le(q)) return this;
		else return q;
	}
	public Rational max(Rational q){
		if(this.gt(q)) return this;
		else return q;
	}
	// ... all the other required methods

	public String toString(){return num+"/"+den;}
	private int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b,a%b);
     }
}