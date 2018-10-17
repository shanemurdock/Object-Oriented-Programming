/**
 *
 * Student name: Shane Murdock	
 * Student number: 2899741
 */




import java.util.*;

public class Assignment8_2016{
	public static void main(String args[]){
	 //Test Q1 =======================================
	
	Person per1 = new Person("0000000", "Able", "00/00/0000");
	Person per2 = new Person("0000000", "Cain", "200/0001/1000");

		System.out.println(per1.equals(per2));
		System.out.println(per1.compareTo(per2));
		System.out.println(per1.hashCode()+" "+ per2.hashCode());


	Person [] per = new Person[]{ 
		new Person("11111111", "Shane", "26/07/1986"),
		new Person("33333333", "Peter", "01/07/1985"),
		new Person("22222222", "James", "22/08/1991")
	};
	


	Arrays.sort(per);// The sort wont work I dont know why I've been at it for days I'm moving on... 
		for (Person p : per){
			System.out.println(p);
		}

	Vector v1 = new Vector(1,2);
	System.out.println(v1);
	Vector v2 = new Vector(4,2);
	System.out.println(v1.equals(v2));
	System.out.println(v1.equals(v1));
	System.out.println(v1.compareTo(v2));
	System.out.println(v1.hashCode()+" "+v2.hashCode());
	//Test Q2 =======================================
	  
	}
}
//Q1  =============================================
//Add classes for Q1 here =========================
final class Person implements Comparable<Person>{
	private final String prsi;
	private final String name;
	private final String dob;
	Person(String p, String n, String d){
		prsi = p; name = n; dob = d;
	}
	public String prsi(){return prsi;}
	public String name(){return name;}
	public String dob(){return dob;}
	public String toString(){
		return prsi+ ", "+ name+", "+ dob;
		
	}
	
	

	public boolean equals(Object ob){
		if(!(ob instanceof Person)) return false; 
		Person p = (Person)ob;
			return prsi.equals(p.prsi);

	}
	public int compareTo(Person p)throws ClassCastException{
		if(p==null){
			return -1;
		}
		else{
			return(prsi.compareTo(p.prsi));
		}

	}
	
	public int hashCode(){
		Double p = new Double(prsi);
		int h = prsi.hashCode()+name.hashCode()+dob.hashCode();
		return(h);
	}


}





//Q2 ===============================================
final class Vector implements Comparable<Vector>{
	private final double a,b;
	public Vector(double a0, double b0){a = a0; b = b0;}
	public double a(){return a;}
	public double b(){return b;}

	public String toString(){
		
		return "Vector "+ a +", "+ b;
	}

	public boolean equals(Object ob){
		if(!(ob instanceof Vector))
			return false;
		Vector v1 = (Vector)ob;
		return a == v1.a&&b==v1.b;
	}
	public int compareTo(Vector v1, Vector v2) throws ClassCastException{
		if(v1.a == null) return -1; 
		else{
			return(v2==v1);
		}
	}
	public int hashCode(){
		Double v1 = new Double(v2);
		int h = v1.a()+v2.hashCode();
		return(h);
	}


} 


//end =============================
