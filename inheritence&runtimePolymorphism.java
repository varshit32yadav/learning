<<<<<<< HEAD
*******************************************************************************/
public class Main
{
        public static void main(String[] args) {
                //System.out.println("Hello World");
                Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
                p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties and behaviour of the object
            //System.out.println(p1.name+" "+p1.age);  
                Person p2 =new Person(12,"Sam"); //creating the objecvt with help of constructor;
                
                p1.walk(3); 
                //p2.walk();
        //----------------------------------------------------  
                developer d1=new developer(22,"Varshit",608);
                d1.dowork(); d1.run(34);
                
                d1.walk();  // walk() in developer will get called first(not walk()in Person as explained below)
        
                /*
                when d1.walk() is called , then d1 first searches in its own(developer) class ,when not found then it searches in its paremt 
                class(Person) and if there also not found then ot searches in Person's parent class ...and goes on
                */
                
                //This is called Runtime Polymorphism where during runtime you will get to know which method(walk()) will be called .
                //as walk() is present in both developer and its parent(Person) class. but method walk() in developer will execute first as explained above 


                
        }
        
}
 class developer extends Person{  //inheritence
    int id;
    public developer(int age,String name,int id ){
        super(age,name); //to call parent class cosntructor.(also,call to super must be first statement in constructor)
        this.id=id;
    }
    void walk(){
        System.out.println("developer "+name +" is walking");
    }
    void run(int run){
        System.out.println(name+"running "+run+"with id "+id);
    }
}
 class Person {
    
    //properties of person
    String name;
    int age;
    
    static int count=0; 
   
    public Person(){ //constructor
        count++; //indicates how many objects of Person calss has been made.
        System.out.println("creating objects");
    }
    public Person(int newage ,String newname ){
        this();       
        this.age=newage;  
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
    void dowork(){
        System.out.println(name + " is working");
    }
}
=======
public class Main
{
        public static void main(String[] args) {
                //System.out.println("Hello World");
                Person p1 =new Person();    //person class is just sit in program memmory if you dont have its objects to use its contnent.
                p1.age=24;p1.name="anuj";   //with the help of dot operator you can access the properties and behaviour of the object
            //System.out.println(p1.name+" "+p1.age);  
                Person p2 =new Person(12,"Sam"); //creating the objecvt with help of constructor;
                
                p1.walk(3); 
                //p2.walk();
        //----------------------------------------------------  
                developer d1=new developer(22,"Varshit",608);
                d1.dowork(); d1.run(34);
                
                d1.walk();  // walk() in developer will get called first(not walk()in Person as explained below)
        
                /*
                when d1.walk() is called , then d1 first searches in its own(developer) class ,when not found then it searches in its paremt 
                class(Person) and if there also not found then ot searches in Person's parent class ...and goes on
                */
                
                //This is called Runtime Polymorphism where during runtime you will get to know which method(walk()) will be called .
                //as walk() is present in both developer and its parent(Person) class. but method walk() in developer will execute first as explained above 


                
        }
        
}
 class developer extends Person{  //inheritence
    int id;
    public developer(int age,String name,int id ){
        super(age,name); //to call parent class cosntructor.(also,call to super must be first statement in constructor)
        this.id=id;
    }
    void walk(){
        System.out.println("developer "+name +" is walking");
    }
    void run(int run){
        System.out.println(name+"running "+run+"with id "+id);
    }
}
 class Person {
    
    //properties of person
    String name;
    int age;
    
    static int count=0; 
   
    public Person(){ //constructor
        count++; //indicates how many objects of Person calss has been made.
        System.out.println("creating objects");
    }
    public Person(int newage ,String newname ){
        this();       
        this.age=newage;  
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
    void dowork(){
        System.out.println(name + " is working");
    }
}
>>>>>>> 19deab0 (oops)
