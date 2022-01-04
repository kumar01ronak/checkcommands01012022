package Javabasics;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "RONAKKUMAR";
		int count;
		char string[] = string1.toCharArray();
		for(int i=0; i<string.length;i++)
		{
			count=1;
			for(int j=i+1; j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(string[i]);
		}

	}

}
