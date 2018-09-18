/**
 * 
 */
import java.util.*;

/**
 * @author sarahlamonica
 * AddressBook Class with a Linked List of Buddy Info Objects
 */
public class AddressBook {
	
	static LinkedList<BuddyInfo> ss = new LinkedList<BuddyInfo>();
	

	/**
	 * Add a buddy to the list
	 * @param x
	 */
	public static void addBuddy(BuddyInfo x) {
		ss.add(x);
	}
	
	/**
	 * Remove a buddy from your list
	 * @param x
	 */
	public static void removeBuddy(BuddyInfo x)
	{
		ss.remove(x);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create new buddies
		BuddyInfo x = new BuddyInfo();
		x.setName("Sarah");
		BuddyInfo y = new BuddyInfo();
		y.setName("Shoana");
		BuddyInfo z = new BuddyInfo();
		z.setName("Zebra");
		
		//test add and remove
		addBuddy(x);
		addBuddy(y);
		addBuddy(z);
		removeBuddy(y);
		
		//print out all of the buddies
		  Iterator iterator = ss.iterator();
	        while (iterator.hasNext()) {
	            // Print element to console
	            System.out.println(((BuddyInfo) iterator.next()).getName());
	        }
		
		System.out.println("Address Book");
		

	}

}
