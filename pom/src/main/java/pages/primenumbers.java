package pages;

public class primenumbers {

	
	public static void main(String args[]) {
		
		int num=3;
		boolean flag=false;
		for(int i=2;i<num/2;i++) {
			
			if(num%i==0) {
				
				flag=true;
				break;
				
			}
		}if(!flag) 
			System.out.println("number is primenumber"+num);
			else
				System.out.println("number is not primenumber"+num);
		}
	}

