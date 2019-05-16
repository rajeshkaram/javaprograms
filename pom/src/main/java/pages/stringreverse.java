package pages;

public class stringreverse {

	public static void main(String args[]) {
		
		String source="professsion  qa automation engineer";
		for(String part:source.split(" ")) {
			
			System.out.println(new StringBuilder(part).reverse().toString());
		}
		
		System.out.println(" ");
	}
}
