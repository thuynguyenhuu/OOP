package Task3;

import java.util.*;

public class ArrayBag 
{
	private Object[] items;
	
	private int numItems;
	
	public static final int DEFAULT_MAX_SIZE = 50;
	
	public ArrayBag() {
        this.items = new Object[DEFAULT_MAX_SIZE];
        this.numItems = 0;
    }
	
	public ArrayBag(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize must be > 0");
        }
        this.items = new Object[maxSize];
        this.numItems = 0;
    }
	
	public int numItems() {
        return this.numItems;
    }
	
	public boolean add(Object item) 
    {
        if (item == null) 
        {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (numItems < items.length) 
        {
            items[numItems] = item;
            numItems++;
            return true;
        }
        return false;
    	
    }
	
	public boolean remove(Object item) 
    {
        for (int i = 0; i < numItems; i++) 
        {
            if (items[i].equals(item)) 
            {
                items[i] = items[numItems - 1];
                items[numItems - 1] = null;
                numItems--;
                return true;
            }
        }
        return false;
    }
	
	public boolean contains(Object item) 
    {
        for (int i = 0; i < numItems; i++) 
        {
            if (items[i].equals(item)) 
            {
                return true;
            }
        }
        return false;
        
    }
	
	public Object grab() 
	{
        if (numItems == 0) 
        {
            throw new NoSuchElementException("Bag is empty");
        }
        
        int randomIndex = (int) (Math.random() * numItems);
        
        return items[randomIndex];
        
    }
	
	public Object[] toArray() {
        Object[] copy = new Object[this.numItems];
        
        for (int i = 0; i < this.numItems; i++) {
            copy[i] = this.items[i];
        }
        
        return copy;
    }
	
	public String toString() {
        String str = "{";
        
        for (int i = 0; i < this.numItems; i++) {
            str = str + this.items[i];
            if (i != this.numItems - 1) {
                str += ", ";
            }
        }
        
        str = str + "}";
        return str;
    }

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("size of bag 1: ");
        int size = scan.nextInt();
        
        ArrayBag bag1 = new ArrayBag(size);
        scan.nextLine();
        
        String itemStr; 
        
        for (int i = 0; i < size; i++) 
        {
            System.out.print("item " + (i + 1) + ": ");
            itemStr = scan.nextLine();
            bag1.add(itemStr);
        }
        
        System.out.println("bag 1 = " + bag1);
        System.out.println();
        
        Object item = bag1.grab();
        System.out.println("grabbed " + item);
        System.out.println();
        
        Object[] items = bag1.toArray();
        
        for (int i = 0; i < items.length; i++) 
        {
            System.out.println(items[i]);
        }
        
        System.out.println();
        
        System.out.print("item to remove: ");
        itemStr = scan.nextLine();
        
        if (bag1.contains(itemStr)) 
        {
            bag1.remove(itemStr);
        }
        
        System.out.println("bag 1 = " + bag1);
        System.out.println();
        
        ArrayBag b = new ArrayBag(10);
        b.add("hello");
        b.add("world");
        String s = (String) b.grab();
        System.out.println("bag b = " + b);
        System.out.println("grabbed " + s);
        
        scan.close();
	}
}
