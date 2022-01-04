
public class SearchElement {

	public static void main(String[] args) {
		int[] a= {10,293,38,56,29,47,39};
		int SE=38;
		boolean flag=false;
		for(int i=0;i<=a.length-1;i++)
		{
		if(a[i]==SE)
		{
			System.out.println("Element found at " + i);
			flag=true;
			break;
		}
		
		
		}
		if(flag==false)
		System.out.println("Element not fount");
		
	}

}
