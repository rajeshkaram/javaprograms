package pages;



//abstract parent class
abstract class x{
 //abstract method
 public abstract void test();
}
//Dog class extends Animal class
public class y extends x{

 public void test(){
	System.out.println("testing");
 }
 public static void main(String args[]){
	x obj = new y();
	obj.test();
 }

}

	