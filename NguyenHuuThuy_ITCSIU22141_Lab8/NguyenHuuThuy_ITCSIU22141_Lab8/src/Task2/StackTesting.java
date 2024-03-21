package Task2;

import java.io.*; 

public class StackTesting<data>
{

	public static void main(String[] args) throws IOException 
	{
		ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
		
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        
        System.out.println("Bottom element of ArrayStack: " + arrayStack.bottom());
        
        arrayStack.reverse();
        
        System.out.println("Top element of ArrayStack after reverse: " + arrayStack.peek());

        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        
        System.out.println("Bottom element of LinkedStack: " + linkedStack.bottom());
        
        linkedStack.reverse();
        
        System.out.println("Top element of LinkedStack after reverse: " + linkedStack.peek());

	}

}