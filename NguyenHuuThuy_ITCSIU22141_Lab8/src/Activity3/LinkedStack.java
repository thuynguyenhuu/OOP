package Activity3;

import Activity2.Stack;

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

}