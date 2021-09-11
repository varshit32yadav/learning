public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
		p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties and behaviour of the object
		System.out.println(p1.name+" "+p1.age);  
		Person p2 =new Person(12,"Sam"); //creating the objecvt with help of constructor;
		
		p1.walk(3); 
		p2.walk();
		
		
		

		System.out.println("no of obj created for Person= "+Person.count);  //static is accessed directky form the class itself.
		
		
	
		
		
		
	}
	
}
class Person {
    
    //properties of person
    String name;
    int age;
    
    static int count=0;  //(static)class ka property hai. simply call (Person.count). you dont need to create any object for this.
   
    public Person(){ //constructor
        count++; //indicates how many objects of Person calss has been made.
        System.out.println("creating objects");
    }
    public Person(int newage ,String newname ){
        this();       //1) used to call other constructors of the class.
        this.age=newage; //2)(used to access the variables of the class)storing age to the class variable age(by doin this.age);
        this.name =newname;
        
    }
    //this is constructors overloading concept;
    
    //behaviour(mehtods)of person
    void walk(){
        System.out.println(name +" is walking");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps+" steps");
    }
}
