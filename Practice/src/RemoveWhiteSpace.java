
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s="How  to  find              max and     min   element from   an array  ?";
		s=s.replaceAll("\\s", "");
				System.out.println(s);
	}

}
