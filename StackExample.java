package datastuctures;
class StackOverflowException extends Exception{
	StackOverflowException(String s){
	super(s);
	}
}
	
	class StackUnderflowException extends Exception{
		StackUnderflowException(String s){
		super(s);
		}
	}
class StackEx{
	int arr[]=new int[2];
	int position=0;
	public void push(int ele) throws StackOverflowException{
		if(position>= arr.length) 
		{
		StackOverflowException n=new StackOverflowException("Stack array is invalid");
			throw n;
	}
	    arr[position]=ele;
	    position++;
	    System.out.println("the given elements are :"+ele);
	    
	}
	public void pop() throws StackUnderflowException{
		if(position==0) {
			StackUnderflowException m=new StackUnderflowException("Stack array is empty");
			throw m;
		}
		position--;
		System.out.println("the pop element is "+ position);
	}
}
public class StackExample  {
public static void main(String[] args) {
	StackEx st=new StackEx();
	try {
	st.push(10);
	st.push(20);
	st.push(200);
	}
	catch(StackOverflowException s) {
		System.out.println(s.getMessage());
	}
	try {
		st.pop();
		st.pop();
		st.pop();
		}
		catch(StackUnderflowException s) {
			System.out.println(s.getMessage());
		}
	
	}
}
