import java.util.Scanner;

public class CharVowelorConsonant {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		char ch;
		sc= new Scanner(System.in);

		System.out.print("Please Enter any Character =  ");
		ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch <= 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch <= 'O' || ch == 'U') 
		{
			System.out.println(ch + " is Vowel");
		}
		else 
		{
			System.out.println(ch + " is Consonant");
		}
	}
}