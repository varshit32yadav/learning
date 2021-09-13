<<<<<<< HEAD
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
		p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties and behaviour of the object
		System.out.println(p1.name+" "+p1.age); 
		 
		p1.walk(3); //now walk() will not get call walk(int steps )will get called as parameter is supplied
		p1.walk();//now walk() will be called
		
		/*hence this is polymorphism.Polymorphism is the ability of any data to be processed in more than one form.
		The word itself indicates the meaning as poly means many and morphism means types. */
		
		//this is compile time polymorphism , during compile time only you will get to know which method is going to be called .
		
		
		
		
		
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
    void walk(int steps){
        System.out.println(name + " walked "+ steps+" steps");
        
    }
}
=======
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
		p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties and behaviour of the object
		System.out.println(p1.name+" "+p1.age); 
		 
		p1.walk(3); //now walk() will not get call walk(int steps )will get called as parameter is supplied
		p1.walk();//now walk() will be called
		
		/*hence this is polymorphism.Polymorphism is the ability of any data to be processed in more than one form.
		The word itself indicates the meaning as poly means many and morphism means types. */
		
		//this is compile time polymorphism , during compile time only you will get to know which method is going to be called .
		
		
		
		
		
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
    void walk(int steps){
        System.out.println(name + " walked "+ steps+" steps");
        
    }
}
>>>>>>> 19deab0 (oops)
