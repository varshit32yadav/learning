<<<<<<< HEAD
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
		p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties of the object
		System.out.println(p1.name+" "+p1.age);  
		p1.walk(); ////with the help of dot operator you can access the behaviour of the object
		p1.eat();
		
	}
	
}
class Person {
    //properties of person
    String name;
    int age;
    
    //behaviour(mehtods)of person
    void walk(){
        System.out.println(name +" is walking");
        
    }
    void eat(){
        System.out.println(name +" is eating ");
        
    }
}
=======
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
		p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties of the object
		System.out.println(p1.name+" "+p1.age);  
		p1.walk(); ////with the help of dot operator you can access the behaviour of the object
		p1.eat();
		
	}
	
}
class Person {
    //properties of person
    String name;
    int age;
    
    //behaviour(mehtods)of person
    void walk(){
        System.out.println(name +" is walking");
        
    }
    void eat(){
        System.out.println(name +" is eating ");
        
    }
}
>>>>>>> 19deab0 (oops)
