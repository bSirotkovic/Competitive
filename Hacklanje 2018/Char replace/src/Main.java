import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputWord = sc.nextLine();
		StringBuffer targetWord = new StringBuffer();
		
		for(Character c : inputWord.toCharArray()) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				targetWord.append("-");
			}
			else if (c >= '0' && c <= '9') {
				targetWord.append("*");
			}
			else {
				targetWord.append("?");
			}
		}
		
		System.out.println(targetWord);
		sc.close();
	}

}
