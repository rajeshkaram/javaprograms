package pages;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=154;
		int temp,c=0,a;
		temp=n;
		
		while(n>0) {
			
			a=n%10;
			n=n/10;
			
			c=c+(a*a*a);
			
		}
		if(temp==c) 
			
			System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");
		}
	}


