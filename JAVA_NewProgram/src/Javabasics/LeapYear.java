package Javabasics;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(year%4==0)
		{
			if (year%100!=0 || year%400==0) {
				System.out.println("year is leap year");	
			}

		}
		else {
			System.out.println("year is not leap year");
		}


	}

}
