package hr.bs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer lastNum = null;
		
		while(sc.hasNextInt()) {
			Integer curNum = sc.nextInt();
			
			if(lastNum != null && curNum.equals(lastNum)) continue;
			
			System.out.print(curNum + " ");
			lastNum = curNum;
		}
		
		sc.close();
	}

}
