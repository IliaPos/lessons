package uravnenie;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		System.out.println("¬ведите число:");
		double a = getNumber();
		if  (a<0){
			System.out.println(-1);
			
		}  else {
			if(a==0){
				System.out.println(0);
				
			} else{
				System.out.println(1);
			}
		}

	}
		
		private static double getNumber() {

			Scanner s = new Scanner(System.in);
			String str1;
			while(true) {
				str1 = s.nextLine();
				if(str1 != null && !"".equals(str1) ) {
					return Double.parseDouble(str1);
				} else{
					System.err.println("ERROR!!!");
				}
			}
	}
}
