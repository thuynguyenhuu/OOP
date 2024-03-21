package Task1;

public class Stack <T> 
{
	
	private int maxStack;
	private int emptyStack; 
	private int top;
	private T[] items; 
	 
	public Stack(int size) 
	{ 		
      maxStack= size; 
      emptyStack = -1; 
      top = emptyStack;     
      items = (T[]) new Object[maxStack]; 
	} 
	 
	public void push(T c) 
	{ 	  		
		items[++top] = c; 	   
	} 
	 	   
	public T pop() 
	{ 		
		return items[top--]; 	   		
	} 
	
	 	   
	public boolean full()  
	{ 			
		return top + 1 == maxStack; 			
	} 
	 	
	public boolean empty()  
	{ 			
		return top == emptyStack; 	   		
	}
	
}