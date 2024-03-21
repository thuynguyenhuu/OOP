package Activity1;

public class Stack 
{
	private int maxStack;
	private int emptyStack; 
	private int top; 
	private char[] items; 
	 
	public Stack(int size) { 
	      maxStack= size; 
	      emptyStack = -1; 
	      top = emptyStack; 
	      items = new char[maxStack]; 
	   } 
	 
	   public void push(char c) { 
	      items[++top] = c; 
	   } 
	 
	   public char pop() { 
	      return items[top--]; 
	   } 
	 
	   public boolean full()  { 
	      return top + 1 == maxStack; 
	   } 
	 
	   public boolean empty()  { 
	      return top == emptyStack; 
	   }
	   
}
