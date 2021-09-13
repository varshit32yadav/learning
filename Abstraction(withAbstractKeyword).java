
public class Main
{
	public static void main(String[] args) {
		
		//Car c1=new Car();  CAR is abstract and connot be Instantiated .
		//c1.price=10;
		Audi a1=new Audi ();
		a1.price =10;
		a1.start();
		Bmw b1=new Bmw ();
		b1.start();
		b1.price=10;b1.daam(b1.price);
	   
	   
	}
}
class Audi extends Car{
    
    public void start()  //Override the abstract method start();
    {
        System.out.println("Car is starting audi");
    }
}
class Bmw extends Car{
    
    public void start()  //Override the abstract method start();
    {
        System.out.println("Car is starting bmw");
    }
    void daam(int price){System.out.println(price);}
}
abstract class Car{  
    int price;
    abstract void start();  //method without body

    void price(){           //also can have non-abstract methods
    	System.out.println(price);
    }

} 