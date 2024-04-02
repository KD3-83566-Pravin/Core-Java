import java.util.Scanner;
public class Que2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	      double num1=0.0;
	      double num2=0.0;
	      boolean flag=false;
	      System.out.println("enter number1");
	      if(sc.hasNextDouble()) {
	    	  if(sc.hasNextInt()) {
	    		  System.out.println("given number is not double");
	    	  }
	    	  else {
	    		  num1=sc.nextDouble();
	    		  flag=true;
	    	  }
	    	  
	      }
	      if(flag) {
	    	  System.out.println("enter number2");
		      if(sc.hasNextDouble()){
		    	  if(sc.hasNextInt()) {
		    		  System.out.println("given number is not double");
		    	  }
		    	  else {
		    		  num2=sc.nextDouble();
		    		 System.out.println("avg: "+((num1+num2)/2));
		    	  }
		    	  
		      }
	    	  
	      }
		
	}

}
