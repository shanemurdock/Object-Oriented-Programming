/**
 * Assignment 2_2016
 *
 * Student Name:n Shane Murdock	
 * Student Number: 2899741
 */
public class Assignment3_2016{
	public static void main(String args[]){
	

//Q1 class ===============================================
public class Assignment3{
	public static void main(String args[]){
	IntManager in = new IntManager(100);
	System.out.println(in);
	for(int j = 0; j<20; j++){
		int x =(int)(Math.random()*20);
		in.add(x);
	}
	System.out.println(in);
	System.out.println(in.found(12));
	System.out.println(in.max());
	System.out.println(in.min());
	System.out.println(in.sumOdd());
	System.out.println(in.freq(13));
	SYstem.out.println(in.oddArray());	
		
	}
}

//The class IntManager listed below manages an array of Integer values. Your task is to complete the methods listed //in the interface. 
class IntManager{
	private Integer dt[];
	private int size;
	IntManager(int k){dt = new Integer[k]; size = 0;}
	public void add(Integer x){
		if(size < dt.length){
			dt[size] = x; size++;
		}
	}
	public boolean found(Integer x){
		//return true if x in dt; false otherwise
		for (int j = 0; j<size;j++){
			if(dt[j].equals(x))
				return true;
		}
		return false; 
	}
	public Integer max(){
	  //return largest value in dt; null if size == 0
		if (size==0){
			return null; 
		}
		int maxSize = dt[0];
		for(int j = 0; j<size;j++){
			if(maxSize<dt[j]){
				maxSize = dt[j];
			}
		}
		return maxSize;



	}
	public Integer min(){
		if(size ==0){
			return null; 
		}
		int minSize = dt[0];
		for(int j = 0; j<size; j++){
			if(minSize>dt[j]){
				minSize = dt[j];
			}
		}
		return minSize;
	}
	public Integer sumOdd(){
		//calculate sum of odd values

		int sum = 0; 
		for (int j = 0; j<size; j++)
			if(dt[j]%2==1){
				sum = sum+dt[j];
			}
			return sum; 
	}
	public Integer freq(Integer x){
		//count frequency of occurrence of x in dt
		Integer freq = 0; 
		for(int j = 0; j < size; j++){
			if ( dt[j]== freq){
				freq++;
			}
		}
		return freq;

	}
	public Integer[] oddArray(){
		Integer odd[]= new Integer[size];
		int x = 0; 
		for(int j = 0; j<size;j++){
			if(dt[j]%2==1){
				odd[x] = dt[j];
				x++;
			}
		}
		return odd; 
	}
	public String toString(){
		if(size == 0) return "[]";
		String s = "[";
		for(int j = 0; j < size - 1; j++)
			s = s + dt[j] + ",";
		return s+dt[size-1]+"]";
	}
}



//Q2 classes ================================================
public class Assignment3_2016{
	public static void main(String args[]){
	
	
		
		/*Q2  ==============================================
		  This code is a sample test for Q2.*/
	         
        TicketManager tm = new TicketManager();
          System.out.println(tm);
          Ticket t1 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
          tm.buy(t1);
          System.out.println(tm);
          Ticket t2 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
          tm.buy(t2);
          System.out.println(tm);
          for(int j = 0; j < 200; j++)
               tm.buy(new Ticket((int)(Math.random()*5),(int)(Math.random()*5)));
          System.out.println(tm.sold());
          Ticket draw = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
          System.out.println(tm.freqWinner(draw));
          
          
     }
}
class Ticket{
	private final int a,b;
	Ticket(int a1, int b1){a = a1; b = b1;}
	public int a(){return a;}
	public int b(){return b;}
	public String toString(){return "["+a+","+b+"]";}
}
class TicketManager{
	private Ticket[] tickets;
	private int sold = 0;
	private int maxTickets = 500;
	TicketManager(){}
	public boolean buy(Ticket t){
		if(sold<maxTickets){
			tickets[sold] = new Ticket(t.a(),t.b());
			sold++;
			return true;
		}
		return false; 
	}
	public int freqWinner(Ticket t){
		int freq = 0; 
		for(int f = 0; f < sold; f++){
			if ( maxTickets < freq){
				freq++;
			}
		}
		return freq;

	}
	public boolean search(Ticket t){
		int drawn = 0;
		if (t.a==drawn&&t.b==drawn){
			
			return true;
		}
		return false;

	}
	public int sold(Ticket t){
		int s = sold; 
		int count = 0; 
		while (count < s){
			count ++;

		}
		return count;
	}
	public boolean allsold(){
		int all = 0;
		if(all == maxTickets)
			return true; 
	}
	public String toString(){
	
		if(sold == 0) return "[]";
		String s = "[";
		for(int j = 0; j < sold - 1; j++)
			s = s + tickets[j] + ",";
		return s+tickets[sold-1]+"]";
	}
}
