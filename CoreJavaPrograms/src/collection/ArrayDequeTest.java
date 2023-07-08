package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("coffe");
		deque.offer("Tea");
		deque.offer("Ice-cream");
		deque.offer("Biryani");
		deque.offerFirst("chiken-Biryani");
		deque.offerLast("Samosa");
		
		for (String string : deque) {
			System.out.println(string);
			
		}
		System.out.println("\nRemoving 1st Element : ");
		deque.pollFirst();
		for (String string : deque) {
			System.out.println(string);
			
		}
		System.out.println("\nRemoving Last Element : ");
		deque.pollLast();
		for (String string : deque) {
			System.out.println(string);
			
		}
		

	}

}
