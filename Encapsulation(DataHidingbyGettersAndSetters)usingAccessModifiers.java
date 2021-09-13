

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		laptop l1=new laptop(20);
		l1.setPrice(31);
		l1.getRam();
		//System.out.println(l1.price+" "+l1.ram);//now price is private so you cant simply access price simply(by l1.price) .(but ram you can access as that is not private . 
		//you have to use getter function (l1.getPrice()) to access this   this is DATA HIDING.
		System.out.println(l1.getPrice());
		System.out.println(l1.getRam());
	}
}

class laptop{ 
    private int price =0;    //private is an aceess modifier.to not to let anyone access this variable outside LAptop class.
    int ram;
    public laptop(int ram){
        //this.price=price;
        this.ram=ram;
    }
    public void setPrice(int price){                   //setter function to set price
        //check if admin is there or not
        boolean isAdmin=false;         //if isAdmin=ture; then you can set the price;
        if(isAdmin==true)
        {this.price=price;}
        
        else System.out.println("you are not admin");
    }
    public void setRam()                     //setter function 
    {
        this.ram =ram;
        
    }
    public int  getPrice() {                  //getter function to get the price.
    return price;
        
    }
    public int  getRam() {                     //getter function
    return ram;
        
    }
} //we use getter and setter functions to protect our data .YOu dont want that your variables can be accessed by everyone .