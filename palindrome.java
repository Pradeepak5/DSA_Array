import java.util.Scanner;

public class palindrome {
	public boolean isPalindrome(String word) {
		char[] inputword=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		while(start<end) {
			if(inputword[start]!=inputword[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String args[]) {
		palindrome p=new palindrome();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Word : ");
		String word=s.nextLine(); 
		if(p.isPalindrome(word)) {
			System.out.println("The given word is Palindrome.");
		}else {
			System.out.println("The given word is Not a Palindrome.");
		}
	}

}
