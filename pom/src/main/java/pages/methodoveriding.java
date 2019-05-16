package pages;

public class methodoveriding {
	
	
	 public static void main( String args[]) {
			
		   methodoveriding obj = new methodoveriding();
		   obj.disp();

		
		     methodoveriding obj2 = new Demo();
		     obj2.disp();
	 }
	 //Overridden method
	   public void disp()
	   {
		System.out.println("disp() method of parent class");
	   }	   
	}
	  class Demo extends methodoveriding{
	   //Overriding method
	   public void disp(){
		System.out.println("disp() method of Child class");
	   }
	   
	   }
	  
	   
	

