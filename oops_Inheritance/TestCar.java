package oops_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		Audi obj=new Audi();
		obj.start();  //Overridden
		obj.stop();   //inherited
		obj.autoPark(); //individual 

	}

}
