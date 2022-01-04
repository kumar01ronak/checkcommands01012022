//   *
//  **
// ***
//****
public class Starpattern4 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=4;i++)//inner loop for row
		{
			for(j=3;j>=i;j--)//outer loop for column to print space
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)//outer loop for column to print *
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
