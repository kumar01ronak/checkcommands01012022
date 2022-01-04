import java.util.Scanner;

public class CountTheWord {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s;
		int count=1;
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++) 
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		System.out.println("No. of words in String is" +count);
		
		
	}

}
