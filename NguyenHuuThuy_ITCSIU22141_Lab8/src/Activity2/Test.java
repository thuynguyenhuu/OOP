package Activity2;

public class Test 
{
	
    public static void main(String[] args) 
    {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Size of stack after pop: " + stack.size());
    }
    
}