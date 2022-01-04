
public class EvenAndOdd {

	public static void main(String[] args) {
		int[] arr= {1,2,23,3,6,44,4,5,6,67,30,35,95,4,3,20};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even no.'s are " + arr[i]);
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println("odd no.'s are " + arr[i]);
			}
		}
	}

}
