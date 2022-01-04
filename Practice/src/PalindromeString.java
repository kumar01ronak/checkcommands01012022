import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String s, rev="";
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("This is palindrome string");
		}
		else
			System.out.println("This is not palindrome string");
			
	}

}
