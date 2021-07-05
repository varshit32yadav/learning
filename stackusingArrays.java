public class Main{
	    static 	int size;
		static int ar[];
		static int top;
	Main(int size){
		this.size=size;
		this.ar=new int [size];
		this.top=-1;
	}
	static int isEmpty()
	{
		if(top==-1)
			return 1;
		return 0;
	}
	static 	int isfull(){
		if(top==size-1)
			return 1;
		return 0;
	}
		static int peek(int pos){
        int x=-1;
		if(top-x-1<0)
			return x;
		else
			x=ar[top-pos-1];
		return x;
	}
		static void push (int x){
		if(top==size-1){
			System.out.print("full");
			return;
		}
		else{
			top++;
			ar[top]=x;
		}

	}
		static int pop()
	{   int x=-1;
		if(top==-1){

			System.out.print("empty");
			return x;
		}
		else{
			x=ar[top--];
		}
		return x;
	}
	static void display(int []ar){
	    while(top>=0){
	        System.out.print(" "+ar[top--]);
	    }
	}

    public static void main(String args[]){
     Main st=new Main(5);
     st.push(1);
     st.push(2);
     st.push(3);st.push(4);st.push(5);
     st.pop();//System.out.println(top);
     System.out.println(peek(2));
     display(ar);
    }
}


if(c==']'||c==')'||c=='}' && st.top>=0){
                char x=st.ar[st.top-1];
                if(c==')' && x=='(') st.top--;
                if(c==']' && x=='[') st.top--;
                if(c=='}' && x=='{') st.top--;
            }