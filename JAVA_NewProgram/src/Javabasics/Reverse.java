//Reverse the element in array

package Javabasics;


public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int []{0,1,2,3,4};
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"");
		
		}
		System.out.println();
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]+"");
			

	}

}
