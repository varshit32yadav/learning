import java.util*;
public class GFg
{
    static class Node
    {
        Node left,right;
        int key;
        Node(int key)
        {
            this.key=key;
        }
    }
static Node root,temp=root;

public static void main(String args[])
{
     int []ar={8,3,5,4,9,7,2};
     
     create();
    inorder(root); 
}
 public static void create()
    {    Scanner sc=new Scanner(System.in); int x;
        if(root==null)
        {
            Node n=new Node(8);
            n.key=8;
            n.left=null;n.right=null;
            root=n;
            
        } temp=root;
         Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
         while(!q.isEmpty())
         {
             temp=q.peek();
             System.out.println("enter left");
              x=sc.nextInt();
             if(x!=-1)
             {
                Node n=new Node(x);
                temp.left=n;n.key=x;
                n.left=null;n.right=null;
                q.add(temp.left);
             }
             System.out.println("enter right");
              x=sc.nextInt();
             if(x!=-1)
             {
                Node n=new Node(x);
                temp.right=n;n.key=x;
                n.left=null;n.right=null;
                q.add(temp.right);
             }
         }
    }
 static void inorder(Node temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

}