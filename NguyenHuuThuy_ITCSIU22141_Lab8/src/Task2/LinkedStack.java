package Task2;

public class LinkedStack <E> implements Stack<E> 
{
	private Node<E> top; 
    private int size; 
     
    public LinkedStack()
    {
        top = null; 
        size = 0; 
    } 
 
    public boolean isEmpty() 
    { 
        return (size == 0); 
    } 
 
    public E peek() 
    { 
        if (size == 0) 
        { 
            throw new java.util.EmptyStackException(); 
        } 
        return top.element;  
    } 
 
    public E pop() 
    { 
        if (isEmpty()) 
        { 
            throw new java.util.EmptyStackException(); 
        } 
        E element = top.element; 
        top = top.next;         
        --size; 
        return element; 
    } 
 
    public void push(E element) 
    { 
        top = new Node<E>(element, top); 
        ++size;
    } 

    public int size() 
    { 
    	return size; 
    }     

    private static class Node<E> 
    { 
    	E element; 

    	Node<E> next; 

    	Node(E element, Node<E> next) 
    	{ 
    		this.element = element; 
    		this.next = next; 

    	} 
    	
    }
    
    public E bottom() 
    {
        if (isEmpty()) 
        {
            throw new java.util.EmptyStackException();
        }
        Node<E> current = top;
        while (current.next != null) 
        {
            current = current.next;
        }
        return current.element;
    }
    
    public void reverse() 
    {
        Node<E> prev = null;
        Node<E> current = top;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
    }

}