package uravnenie;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		System.out.print("Input number->>");
		Integer n = getNumber();
		System.out.println("Numbers"+" "+n.toString().length());
	}
	
	
	private static Integer getNumber() {
		Scanner s = new Scanner(System.in);
		String str1;
		while(true) {
			str1 = s.nextLine();
			if(str1 != null && !"".equals(str1) && str1.matches("^\\d+$")) {
				return Integer.parseInt(str1);
			} else{
				System.err.println("ERROR!!!");
			}
		}
	}	
		



	

	

}
