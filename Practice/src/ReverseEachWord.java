
public class ReverseEachWord
{

	public static void main(String[] args) 
	{
		String s="My NAme Is Ronak Kumar";

		String[] iArr=s.split(" ");
		String revs="";
		
		for(String w:iArr) 
		{ 
			String revw=""; //revw=reverseword

			for(int i=w.length()-1;i>=0;i--) 
			{
				
				revw=revw + w.charAt(i);
			}
			revs=revs+revw+" ";
			
		}
		System.out.println(revs);

	}

}
