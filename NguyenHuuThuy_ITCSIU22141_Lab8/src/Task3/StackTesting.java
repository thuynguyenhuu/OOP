package Task3;

public class StackTesting 
{

	public static void main(String[] args) 
	{
		ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
		
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        
        System.out.println("Bottom element of ArrayStack: " + arrayStack.bottom());
        System.out.println("Popped bottom element of ArrayStack: " + arrayStack.popBottom());
        System.out.println("New bottom element of ArrayStack: " + arrayStack.bottom());

        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        
        System.out.println("Bottom element of LinkedStack: " + linkedStack.bottom());
        System.out.println("Popped bottom element of LinkedStack: " + linkedStack.popBottom());
        System.out.println("New bottom element of LinkedStack: " + linkedStack.bottom());

	}

}
