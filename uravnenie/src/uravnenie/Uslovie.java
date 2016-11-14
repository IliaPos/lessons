package uravnenie;

import java.util.Scanner;

public class Uslovie {

	public static void main(String[] args) {
		System.out.println("Input number n->>");
	    double n = getNumber();
	    if(n%2==0){
	    	System.out.println("Число чётное");
	    } else {
	    	System.out.println("Число нечётное");
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