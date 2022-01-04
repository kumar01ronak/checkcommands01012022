import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		int a=0,b=1,c,n,i;
		System.out.println("Enter the term");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(a+" ");	
			c=a+b;
			a=b;
			b=c;
		
		}
	}
}
