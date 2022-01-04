import java.util.Scanner;

class CheckPrime
{
  public static void main(String args[]) 
  {
	  int n1,n2;
	  int i,j;
	  System.out.print("Enter the value of n1 and n2");
	  Scanner sc=new Scanner(System.in);
	  n1=sc.nextInt();
	  n2=sc.nextInt();
	  
	  for(i=n1;i<=n2;i++)
	  {
		  for(j=2;i<=n2;j++)//value saves in j variable
		  {
			  if(i%j==0)
				  break;
			  
		  }
		  if(i==j)
			  System.out.print(j+" ");
	  }
  }
}