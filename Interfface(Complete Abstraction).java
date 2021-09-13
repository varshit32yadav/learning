public class Main implements Car,Person   //multiple interfaces to extend properties (which we cant do in multiple inheritence)
{
	public static void main(String[] args) {
	  Main m1=new Main();
	  m1.start();
	  m1.walk();
	  System.out.println(m1.id);
	    
	}
	
	@Override
	public void start(){
	    System.out.println("Cars is starting ");
	}
	@Override
	public void walk(){
	    System.out.println("Cars is Walking also (Transformer) ");
	}	
}
interface Car{
    void start();  //by default it takes only abstract methods(or you can write as--> public abstract void start()) ;
}
interface Person {
    final int id =10; //non-fibal/static keywords and non abstract methods are not allowed in interface thats why complete abstraction.(Better then abstract classes).
    public abstract void walk();
}
