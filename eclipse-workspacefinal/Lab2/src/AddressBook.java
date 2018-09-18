/**
 * 
 */
import java.util.*;

/**
 * @author sarahlamonica
 *
 */
public class AddressBook {
	
	static LinkedList<BuddyInfo> ss = new LinkedList<BuddyInfo>();
	

	
	public static void addBuddy(BuddyInfo x) {
		ss.add(x);
	}
	
	public static void removeBuddy(BuddyInfo x)
	{
		ss.remove(x);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BuddyInfo x = new BuddyInfo();
		x.setName("Sarah");
		BuddyInfo y = new BuddyInfo();
		y.setName("Shoana");
		BuddyInfo z = new BuddyInfo();
		z.setName("Zebra");
		addBuddy(x);
		addBuddy(y);
		addBuddy(z);
		removeBuddy(y);
		
		  Iterator iterator = ss.iterator();
	        while (iterator.hasNext()) {
	            // Print element to console
	            System.out.println(((BuddyInfo) iterator.next()).getName());
	        }
		
		
		

	}

}
