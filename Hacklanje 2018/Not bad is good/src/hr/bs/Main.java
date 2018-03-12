package hr.bs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		String newString = inputString.replaceAll("\\b[nN][oO][tT]\\b.+?\\b[bB][aA][dD]\\b", "good");
		
		System.out.println(newString);
		sc.close();
	}

}
