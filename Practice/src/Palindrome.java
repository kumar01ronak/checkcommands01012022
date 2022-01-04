import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,r,c,s=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(c==s)
		{
			System.out.println("This is Palindriome Number");
		}
		else
			System.out.println("This is not a palindrome number");
	}

}
