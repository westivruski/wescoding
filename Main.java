import java.util.Scanner;
public class Main {

	 
public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	  int s = 0;
	  int d = 0;
	  
   for(int i=1;i <=10;i++){ 
	  System.out.println("Enter number #"+i+":");
    
	  boolean hasNextInt = sc.hasNextInt();
		 if(hasNextInt){  
		 d = sc.nextInt();
		  sc.nextLine();
		  s = s+d;
	}else{
	 System.out.println("Error");
	  }
	
	 }
	  System.out.println("the sum of numbers is : " + s);
   sc.close();
	}
}