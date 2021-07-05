/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{   static int size,front,rear;static int []ar;
    Main(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        this.ar=new int [size];
        
    }   
    static void push(int x){
        if(rear==ar.length) return;
        else  ar[++rear]=x;
        
        if(front==-1) front++;
        
    }
   static int pop(){
        if(front==-1 || front>rear) return -1;
        else  return ar[front++];
        
    }
    static void display(int f,int r){
        while(f<=r){
            System.out.print(ar[f++]);
        }
    }
    
    
	public static void main(String[] args) {
		Main q=new Main(3);
		q.push(2);
		q.push(3);
		q.push(4);
		display(front,rear);
		
		System.out.print("\n"+q.pop());
		 System.out.println();
		 q.push(5);
		display(front,rear);
			System.out.print("\n"+q.pop());
		System.out.println();
		display(front,rear);
				System.out.print("\n"+q.pop());
		System.out.println();
		display(front,rear);
			System.out.print("\n"+q.pop());
	    
		
	}
	
}
