/*
 * Assignment 9
 *
 * Student name:Shane Murdock 
 * Student number: 2899741
 *
 */
import java.util.*;
public class Assignment9{
 public static void main(String[] args) {
  MonthSeasons m1 = new MonthSeasons();
  m1.put();
  System.out.println();






   //Q1 Test =====================================
  //Test array
  Module mod[] = {
   	 new Module("Programming","Donal",36),
   	 new Module("Networks","Faheem",36),
   	 new Module("Graphics","Barry",36),
   	 new Module("Web","Ruairi",36),
   	 new Module("Hardware","Paddy",36),
   	 new Module("Algorithms","Eoin",36),
   	 new Module("OOP","Tony",36),
   	 new Module("Maths","Paddy",36),
   	 new Module("BigData","Osama",36)
   };
   

   // Q1 end ======================================
   System.out.println(Converter.toFahrenheit(60));
   System.out.println(Converter.toCelcius(60));
   System.out.println(Converter.toMiles(60));
   System.out.println(Converter.toKilometer(60));
   System.out.println();
   //Q2 Test ======================================
   Arrays.sort(mod, Module.lectCompare());
   for(Module m : mod) printP(m);
   System.out.println();
   Arrays.sort(mod,Module.lectCompare());
   for(Module m : mod) printPLecturer(m);
  }
    public static void printP(Module m){
   System.out.println(m.title() +" "+m.lecturer()+" "+m.hours());
  }
  public static void printPLecturer(Module m){
   System.out.println(m.lecturer()+" "+m.title()+" "+m.hours());
  }

   //Q2 end =======================================
   //Q3 Test ======================================
  public static MonthSeasons(){
    MonthSeasons m1 = new MonthSeasons();
    m1.print();
    System.out.println();

    
  }
 
 
 
}
class Converter{
  private Converter(){}
  public static double toFahrenheit(double c){return (c * 9.0/5.0) + 3;}
  public static double toCelcius(double f){return (f -32)*5.0/9.0;}
  public static double toMiles(double k){return k /1.609;  }
  public static double toKilometer(double m){return 1.609*m;}
}
  class Module implements Comparable<Module>{
  	private String title;
  	private String lecturer;
  	private int hours;
  	Module(String t, String l, int h){
  		title = t; lecturer = l; hours = h;
  	}
  	public String title(){return title;}
  	String lecturer(){return lecturer;}
    int hours(){return hours;}
    public boolean equals(Object ob){
    	if(!(ob instanceof Module)) return false;
    	Module m = (Module)ob;
    	return title.equals(m.title);
    }
    public int hashCode(){return title.hashCode();}
    public String toString(){return title+" "+lecturer+" "+hours;}
    public int compareTo(Module m){
      if(m == null) return -1;
      if(this.equals(m)) return 0;
      if(!title.equals(m.title)) 
        return title.compareTo(m.title);
      return lecturer.compareTo(m.lecturer);
  }
  public static Comparator<Module> lectCompare(){
      return new Comparator<Module>(){
    public int compare(Module m1, Module m2){
      if(m1.equals(m2)) return 0;
      if(m1.hours < m2.hours) return 1;
      return -1;
    }
   };
 }
}
class Seasons implements Comparable<Seasons>{
  public enum Month{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, 
      AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public enum Season{SPRINT, SUMMER, AUTOM, WINTER};

    private final Month month;
    private final Season season;
    public Seasons(Month month, Season season){
      this.month = month;
      this.season = season;
    }

    public Month month(){return month;}
    public Season season(){return season; }
    public String toString() { return month + " of " + season; }
    public boolean equals(Object ob){
      if(!(ob instanceof Seasons)) return false;
      Seasons m = (Seasons)ob;
      return month.equals(m.month) && season.equals(m.season);
    }
    public int hashCode(){return season.hashCode()*month.hashCode();}
    public int compareTo(Seasons m){
      if(m == null) return -1;
      if(this.equals(m)) return 0;
      if(!season.equals(m.season)) 
        return season.compareTo(m.season);
      return month.compareTo(m.month);
    }
}

class MonthSeasons{
  private Month date[] = new Month[12];
  MonthSeasons(){
    int k = 0;
    for(Month.Seasons s : Month.Seasons.values()){
      for(Month.Seasons m : Month.Seasons.values()){
        date[k] = new Month(m,s);
        k++;
      }
    }
  }
  public void print(){ 
    int t = 0;
    for(Month m : season){
      System.out.printf("%-20s",m);
      t++;
      if(t % 4 == 0) System.out.println();
    }
  }
  public void sort(){Arrays.sort(season);}
}