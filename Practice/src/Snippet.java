

public class Snippet {
	
		   public int add(int a, int b){
		      int c = a+b;
		      return c;
		   }
		   public void add(int a, int b, int c){
		      int z = a+b+c;
		      System.out.println(z);
		   }
		   public static void main(String args[] ){
			   Snippet obj = new Snippet();
		      System.out.println(obj.add(40, 50));
		      System.out.println(obj.add(4, 50));
		   }
		}
