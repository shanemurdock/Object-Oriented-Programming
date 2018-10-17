/* Assignment10_2016

Student name:Shane Murdock 
Student number:2899741

*/
import java.util.*;
public class Assignment10{
	public static void main(String args[]){
	  //Create instance of Friends class and test methods here.
	 Set<Person> f1 = new TreeSet<>();
		Set<Person> f2 = new TreeSet<>();
		Set<Person> f3 = new TreeSet<>();
		f1.addAll(Arrays.asList(
		            new Person("Mary","O'Conner"),
								new Person("Joe","Murray"),
								new Person("Pat","Floyde"),
								new Person("Mike", "Peterson"),
								new Person("Rose","Jameson")
							));
		f2.addAll(Arrays.asList(
		            new Person("Mary","O'Conner"),
								new Person("James","Joyce"),
								new Person("Pat","Peterson"),
								new Person("Sean","Jumper"),
								new Person("Michelle","Froyde")
							));
		f3.addAll(Arrays.asList(
		            new Person("Mary","O'Conner"),
								new Person("Sean", "Slevins"),
								new Person("Pat","Jimston"),
								new Person("Sheila","Floyde"),
								new Person("Rose","Jumper")
							));
		
		Set<Person> f4 = new TreeSet<>();
		f4.addAll(f1);f4.retainAll(f2);
		f4.retainAll(f3);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		// Code below creates an instance of Person
		// and shows how to add a list to it.
		
		Person friends = new Person();
		friends.add(Arrays.asList(
		            new Person("Mary","O'Conner"),
								new Person("Sean","Peterson"),
								new Person("Pat","McCoy"),
								new Person("Sheila","O'reilly"),
								new Person("Rose","Jumper")
							));
		System.out.println(friends);;
	}
}

class Friends{
	private Set<Person> fr = new TreeSet<>();
	 public void add(List<Person> ls){
	fr.addAll(ls);	
}
 public String toString(){return fr.toString();}
}

final class Person implements Comparable<Person>{
	private final String sName;
  private final String fName;
	Person(String fn, String sn){fName = fn; sName = sn;}
	public String sName(){return sName;}
  public String fName(){return fName;}
	public String toString(){return fName+" "+sName;}
	public boolean equals(Object ob){
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return sName.equals(p.sName) && fName.equals(p.fName);
	}
	public int compareTo(Person p){
		if(p == null) return -1;
    if(this.equals(p)) return 0;
		return sName.compareTo(p.sName);
	}
	public int hashCode(){
    return 41 * sName.hashCode() * fName.hashCode();
  }
  public void add(Person p){
  	
  }
  public void search(Person p){

  }
  public void size() {

  }
  public String getSurname(String s){

  }
  public String getFirstname(String f){
  	

  }
  public String getFreq(String f){
  	for(f==Set<Person>){
  		f++;
  	}

  }
  del(Person p){
  	if(Set<Person>==p){
  		p=null; 
  	}

  } 
  Set<Person>sort(per){
  	for (Person p : per){
			System.out.println(p);
		}

  }
}