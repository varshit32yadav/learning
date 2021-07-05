public class Stack{
    static Node top;
public static class Node {
    Node next;int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}


     public static void main(String []args){
       top=null;
       int [] ar={1,2,3,4,5};
       push(1);
       push(2);
       push(3);push(4);push(5);
       display(top);
       System.out.println();
      System.out.println("popped"+pop());
      System.out.println("peeked"+peek(2));
       
     }
   static   void push(int x){
         if(top==null){
             Node st=new Node(x);
             top=st; 
         }
         else{
             Node st=new Node(x);
                if(st==null) {System.out.print("full");}
             st.next=top;top=st;
         }
        
         
     }
     static int pop()
     {   int x=-1;Node p=top;
         if(top==null){
             return x;
             //System.out.println("stack is empty");
         }
         else{
             p=top;
             top=top.next;
             x=p.data;
         }
         return x;
     }
    static  int peek(int x)
     {
         Node p=top,r=null;
         for(int i=0;p!=null&&i<x;i++){
             r=p;
             p=p.next;
         }
         if(p!=null)return r.data;
         else return -1;
     }
     static void display(Node p)
     {
         while(p!=null){
             System.out.print(" "+p.data);
             p=p.next;
         }
     }
     

     
}