public class LinkedList {
   static Node head,a; // head of list
   static int c=0;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } 
    } 
 
    
    public static void main(String[] args)
    {
        int []ar={9,9,9,9,9};
        create(ar,ar.length);
       // loop(head);
       // removeLoop(head);
       int []ar2=count(head,ar.length);
       display2(ar2,head,ar2.length,ar.length);
        display(head);
    }

    public static void create(int[]ar,int n)
    {
        head=new Node(ar[0]);
      
        head.data=ar[0];
        head.next=null;
        Node  last=head;
        for (int i=1;i<n;i++)
          {  Node p=new Node(ar[0]);
          p.data=ar[i];
          p.next=null;
          last.next=p;
          last=p;
          }
          
    }
     public static int[]  count(Node p,int n)
     { int k=0,s=1;Node q=p; 
         while(q!=null){c++;q=q.next;}
         for(int i=0;i<n;i++)
         {  int r=p.data;
            s+=r*Math.pow(10,c-i-1);
             p=p.next;
         } int a=s;
         while(a>0)
         {int r=a%10;k++;a=a/10;}
         int []ar1=new int [k];
         while(s>0)
         {int r=s%10; ar1[--k]=r;s/=10;}
         return ar1;
         
     }
     public static void display2(int[]ar2,Node p,int n,int m)
     {  Node q=p;
          for(int i=0;i<m;i++)
          {
              p.data=ar2[i];
              q=p;
              p=p.next;
          }
          if(n>m)
          { Node temp=new Node(ar2[n-1]);
            temp.data=ar2[n-1];
            temp.next=null;
            q.next= temp;
          }
     }
    
    public static void loop(Node p)
     {   while(p.next!=null)
     {
         p=p.next;
     }   p.next=a;
         
     }
    public static void display(Node p)
     {
         if(p!=null)
          
         {   System.out.print(p.data);
             display(p.next);
            
         }
         else
         return;
     }
      public static void removeLoop(Node head){
        Node p=head;
        Node q=head;
        // code here
        // remove the loop without losing any nodes
        
        if(head==null || head.next == null)
                 {return;}
        
        while(q.next!=null && q!=null)
        {
            p=p.next;
            q=q.next.next;
            if(q==p)
            {  break;}
        }
                p=head;
                while(p.next!=q.next)
                {
                    p=p.next;
                    q=q.next;
                }
            
         q.next=null;
      
    
    }
 }