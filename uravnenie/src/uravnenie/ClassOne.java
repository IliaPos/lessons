package uravnenie;

import java.util.Scanner;

public class ClassOne {

	public static void main(String[] args) {
		
		
	    System.out.println("Input number a->>");
	    double a = getNumber();
	    System.out.println("Input number b->>");
	    double b = getNumber();
	    System.out.println("Input number c->>");
	    double c = getNumber();

	    double d = (b*b)-4*a*c;
//	    System.out.println("d="+d);
	    
	    if(d<0){
	    	System.err.println("No answer!");
	    } else{
		    double x1 = (-b + Math.sqrt(d)) / (2 * a);
		    double x2 = (-b - Math.sqrt(d)) / (2 * a);
		    if(d==0){
		    	System.out.println("x="+x1);
		    	
		    }else{
			    System.out.println("x1="+x1);
			    System.out.println("x2="+x2); 	
		    }
		    
	    }
	}
		
	private static double getNumber() {
		Scanner s = new Scanner(System.in);
		String str1;
		while(true) {
			str1 = s.nextLine();
			if(str1 != null && !"".equals(str1) && str1.matches("^\\d+\\.?\\d*$")) {
				return Double.parseDouble(str1);
			} else{
				System.err.println("ERROR!!!");
			}
		}
	}

}
