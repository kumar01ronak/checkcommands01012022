
public class MaxandMinElement {

	public static void main(String[] args) {
		int[] arr= {19,38,383,383,393,39,696,493,69756,6,874,60000};
		int min= arr[0];
		int max= arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
		}
		System.out.println("Maximum element"  + max);
		
	for(int i=1;i<=arr.length-1;i++) 
	{
		if(arr[i]<min)
		{
			min =arr[i];
		}
		
	}
	System.out.println("Minimum element"  + min);
	}

}
