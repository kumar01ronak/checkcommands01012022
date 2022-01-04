package Javabasics;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		try {
			If(a<18)
			{
				throw new ArithmeticException("User less than 18 yrs can not access this application");
		    }

	}
}