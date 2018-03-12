package hr.bs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] occurances = new int[26];
		
		String inputLine = sc.nextLine();
		int lastNumValue = Integer.MIN_VALUE;
		
		for (char c : inputLine.toCharArray()) {
			int numValue = (int)Character.toLowerCase(c)-97;
			if(numValue < 0 || numValue > 25) continue;
			if(numValue > lastNumValue) lastNumValue = numValue;
			occurances[numValue]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if(occurances[i] == 0) continue;
			if(i == lastNumValue) {
				System.out.print((char)(i+97)+":"+occurances[i]);
				continue;
			}
			
			System.out.println((char)(i+97)+":"+occurances[i]);
		}
		
		sc.close();
	}

}
