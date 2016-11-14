package uravnenie;

import java.util.Scanner;

public class Treygolnik {
	
	

	public static void main(String[] args) {
		double c2;
		System.out.println("Input number a->>");
		double a = getNumber();
		System.out.println("Input number b->>");
		double b = getNumber();
		
		c2=(a*a)+(b*b);
		double c=Math.sqrt(c2);
		double s=0.5*a*b;
        System.out.println(s );
     
        
        double p=a+c+b;
        System.out.println(p);
		
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
