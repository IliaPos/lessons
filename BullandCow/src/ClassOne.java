import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ClassOne {
	static boolean found=false;
	static Integer answer[] = new Integer[4];
	static Set<Integer> set = new HashSet<Integer>();
	
	
	public static void main (String[] args) {
		Integer x;
		Random rand = new Random();
		
//		for(int i=0; i<4; i++) {
//			System.out.println(answer[i]);
//		}
		
		for(int i=0; i<4; i++) {
			
			while(answer[i] == null) {
				x = rand.nextInt(10);
//				System.out.println(x);
				if(!set.contains(x)) {
					set.add(x);
					
					answer [i]=x;
				}
			}
				
			
			
		}
//		System.out.print("secretka > ");
//	for(int i=0; i<4; i++) {
//		System.out.print(answer[i]);
//	}
//	System.out.println();
		int k=1;
		while(!found) {
//			System.out.printkykln();
			Scanner s = new Scanner(System.in);
			System.out.print("Input number ("+k+"): ");
			String str1 = s.nextLine();
//			System.out.println();
			if(str1 != null && !"".equals(str1) && str1.length() == 4 && str1.matches("\\d+")) {
				Integer [] kropot = getKropot(str1);
				if(isValid(kropot)) {
					String res = getResult(kropot);
					System.out.println(res);
					k++;
				} else {
					System.out.println("Wrong number!!!");
				}
			} else {
				System.out.println("Wrong number!!!");
			}
		}
        System.out.println("You win!!!");
		
	}
	
	private static boolean isValid(Integer[] kropot) {
		Set<Integer> digits = new HashSet<Integer>();
		for(int i=0; i<4; i++) {
			if(digits.contains(kropot[i])) {
				return false;
			} else {
				digits.add(kropot[i]);
			}
		}
		return true;
	}

	private static String getResult(Integer[] kropot) {
		int b=0;
		int c=0;
		for(int i=0; i<4; i++){
			if(answer[i].equals(kropot[i])) {
				b++;
			} else {
				if(set.contains(kropot[i])) {
					c++;
				}
				
			}
		}
		if(b==4) {
			found=true;
		}
		return "bulls - " + b + ", cows - "+ c;
	}

	private static Integer[] getKropot(String kr) {
		Integer kropot[] = new Integer[4];
		for(int i=0; i<4; i++){
			kropot[i] = Integer.parseInt(kr.substring(i, i+1));
		}
		return kropot;
	}
	
}
