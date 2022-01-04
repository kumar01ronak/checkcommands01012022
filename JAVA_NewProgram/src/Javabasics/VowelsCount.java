package Javabasics;
import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();

		for (int i=0 ; i<s1.length(); i++){
			char ch = s1.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				count ++;
			}
		}
		System.out.println("Number of vowels"+count);
	}


}


