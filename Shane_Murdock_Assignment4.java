/**
 *
 * Student name: Shane Murdock	
 * Student number: 2899741
 */

public class Assignment4_2016 {
  public static void main(String[] args) {
        // Code for test here
  	Person person1 = new Person("Shane", "0838171650", "Male");
  	Person person2 = new Person("Thomas", "0851137718", "Male");
  	person1.toString();
  	person2.toString();
  	System.out.println(person1);
  	System.out.println(person2);

  	Student student1 = new Student("Shane", "0838171650", "Male",2899 ,"Programming");
  	student1.toString();
  	System.out.println(student1);

  	Lecturer teacher = new Lecturer("Thomas", "0851137718", "Male", 28997412, "Compter Science");
  	teacher.toString();
  	System.out.println(teacher);

  }
}
//Q1 classes ==================================================
class Person{
	private String name;
	private String phone;
	private String gender;
	Person(String n, String p, String g){
		name = n; phone = p; gender = g; 
	}
	public String name(){return name; }
	public String phone(){return phone; }
	public String gender(){return gender; }
	public String toString(){
		return name+"-" + phone+"-"+ gender; 
		
	}



	class Student{
		private String name;
		private String phone;
		private String gender;
		private int studentNumber;
		private String subject;
		 
		Student(String n, String p, String g, int sn, String sub){
			name = n; phone = p; gender = g; 
			studentNumber = sn; subject = sub;  
		}
		public String name(){return name; }
		public String phone(){return phone; }
		public String gender(){return gender; }
		public int studentNumber(){return studentNumber;}
		public String subject(){return subject; }
		public String toString(){
			return name+"-" + phone+"-"+ gender+"-"+studentNumber+"-"+subject; 
		}

	}

	class Lecturer{
		private String name;
		private String phone;
		private String gender;
		private double staffNumber;
		private String department; 
		Lecturer(String n, String p, String g, double st, String d){
			name = n; phone = p; gender = g;
			staffNumber = st; department = d;  
		}
		public String name(){return name; }
		public String phone(){return phone; }
		public String gender(){return gender; }
		public double staffNumber(){return staffNumber;}
		public String department(){return department;}
		public String toString(){
			return name+"-" + phone+"-"+ gender+"-"+staffNumber+"-"+department; 
		}

	}
}

//Q2 class ====================================================
import java.util.*;
class Person{
	private String name;
	private String phone;
	private String gender;
	Person(String n, String p, String g){
		name = n; phone = p; gender = g; 
	}
	public String name(){return name; }
	public String phone(){return phone; }
	public String ender(){return gender; }
	public String toString(){
		return name+"-" + phone+"-"+ gender; 
		
	}

	class Student{
		private String name;
		private String phone;
		private String gender;
		private int studentNumber;
		private String subject;
		 
		Student(String n, String p, String g, int sn, String sub){
			name = n; phone = p; gender = g; 
			studentNumber = sn; subject = sub;  
		}
		public String name(){return name; }
		public String phone(){return phone; }
		public String gender(){return gender; }
		public int studentNumber(){return studentNumber;}
		public String subject(){return subject; }
		public String toString(){
			return name+"-" + phone+"-"+ gender+"-"+studentNumber+"-"+subject; 
		}

	}

	class Lecturer{
		private String name;
		private String phone;
		private String gender;
		private double staffNumber;
		private String department; 
		Lecturer(String n, String p, String g, double st, String d){
			name = n; phone = p; gender = g;
			staffNumber = st; department = d;  
		}
		public String name(){return name; }
		public String phone(){return phone; }
		public String gender(){return gender; }
		public double staffNumber(){return staffNumber;}
		public String department(){return department;}
		public String toString(){
			return name+"-" + phone+"-"+ gender+"-"+staffNumber+"-"+department; 
		}

	}
	class Students{
		private Student[] data;
		private int size;
		public Students(int n){
			data = new Student[n];
			size = 0;
		}
		public Students(Scanner in){
			System.out.println("");

		}
		public boolean add(){
			return(size == data.length);
		}
		public Book searchGender(String t){//instances of Book class are immutable
		boolean found = false;
		int g = 0; 
		while(g<size && !found){
			if(t.equals(books[g].title()))
				found = true;
			else
				g++;
		}
		if(found) return books[j];
		else return null; 
		}
		public String[]searchStudentNum(String a){
			// To return a list of titles by a given author we first
			// determine the frequency of occurence of a books by the author
			// and then return the titles
			int s = 0; 
			for(int s = 0; s<size; s++){
				if(a.equals(gen[s].studentNumber())) s++;
			}
			String[]gen = new String[s];
			int k = 0;
			for(int s = 0; s<size; s++){
				if(a.equals(studentNumber[s].gender())){
					gen[k] =studentNumber[s].();
					k++;
				}
			}
			return gen; 
		}
		//public boolean search(String sNum){}
		//public Student[] getGender(char g){}
		//public Student[] getSubject(String sub){}
		
		
		public int size(){return size;}
		public String toString(){
			if(size == 0) return "[]";
			String s = "[";
			for(int j = 0; j < size - 1; j++)
				s = s + data[j] + ",";
			return s+data[size-1]+"]";
		}
	}
}
import java.util.*;
public class StudentsTest {
  public static void main(String[] args) {
        // Code for test here
    Scanner in = new Scanner(System.in);
    // create library and add some books
    Students per = new Student(10);
    per.add("Tony", "1234", "male"); per.add("Paul", "4321", "male");
    per.add("John", "3333", "male"); per.maleadd("Joe", "2222","male");
    per.add("Peter", "1111","male");
    per.add("Shane", "J5555","male");
    per.add(in);

    System.out.println(per);

    Student p = per.lent



  	Person person1 = new Person("Shane", "0838171650", "Male");
  	Person person2 = new Person("Thomas", "0851137718", "Male");
  	person1.toString();
  	person2.toString();
  	System.out.println(person1);
  	System.out.println(person2);

  	Student student1 = new Student("Shane", "0838171650", "Male",2899 ,"Programming");
  	student1.toString();
  	System.out.println(student1);

  	Lecturer teacher = new Lecturer("Thomas", "0851137718", "Male", 28997412, "Compter Science");
  	teacher.toString();
  	System.out.println(teacher);


  }
}
//=============================================================