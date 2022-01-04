
public class Rstring {

	public static void main(String[] args) {
		int i,count=0;
		String str = "ronak Kumar singer";
		for(i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='r')
			{
			count++;	
			}
		}
		System.out.println(count);
		

	}

}
