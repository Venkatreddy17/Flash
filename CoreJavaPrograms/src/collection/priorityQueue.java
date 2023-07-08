package collection;


import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue =new PriorityQueue<String>();
		queue.add("Java");
		queue.offer("Python");
		queue.add("DA");
		queue.add("C++");
		queue.add("Angular");
		//queue.add(null);//NullPointerException
		
		for (String string : queue) {
			System.out.println(string);
		}
			System.out.println("\nHead of quee : "+queue.element());
			System.out.println("\nRemoving element : "+queue.remove());//will throw Exception if quee is empty;
			
			System.out.println("queue after removing element : ");
			
			for (String string : queue) {
				System.out.println(string);
				
			}
			System.out.println("\nRemoving element : "+queue.poll());//will return null if queue is empty 
			System.out.println("\nquene after removing element :");
			for (String string : queue) {
				System.out.println(string);
			}
				
			}
			
		
		
		
		

	}


