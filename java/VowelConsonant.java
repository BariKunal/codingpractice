/*5. Vowel or Consonant
Description: Write a program that takes a character input from the user and checks if it is a vowel (a, e, i, o, u) or a consonant. Use if-else for this task.
Concepts Covered: if-else, character comparison, logical operators.*/

import java.util.*;
public class VowelConsonant
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Character...");
		char ch = sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Vowel...");
		}
		else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel...");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}