import java.util.*;

public class PriorityQueue {
	
	public static void main(String[] args) {
		PriorityQueue a = new PriorityQueue();
		a.add(5);
		a.add(3);
		a.add(9);
		a.add(1);
		a.add(2);
		a.offer(7);
		a.print();
		a.peek();
		a.print();
		a.poll();
		a.print();
		a.clear();
		a.print();
	}
	
	private ArrayList<Integer> queue; 
	
	//constructor that creates a priority queue with capacity of 11
	public PriorityQueue() {
		queue = new ArrayList<Integer>(11);
	}
	
	//prints out elements in priority queue (for purposes of the main method)
	public void print() {
		for(int i = 0; i < queue.size(); i++) {
			System.out.print(queue.get(i));
		}
	}
	
	//adds the specified element into the priority queue
	public void offer(Integer a) {
		queue.add(a);
		queue = order(queue);
	}
	
	//adds the specified element into the priority queue
	public void add(Integer a) {
		queue.add(a);
		queue = order(queue);
	}
	
	//orders elements in priority queue from least to greatest
	private ArrayList<Integer> order(ArrayList<Integer> a) {
		Integer temp;
		Integer index = 0;
		boolean swapped = true;
		while(swapped == true) {
			swapped = false;
			index++;
			for(int i = 0; i < a.size() - index; i++) {
				if(a.get(i) > a.get(i + 1)) {
					temp = a.get(i);
					a.set(i, a.get(i + 1));
					a.set(i + 1, temp);
					swapped = true;
				}
			}
		}
		return a;
	}
	
	//returns but does not remove the head of the queue
	public Integer peek() {
		return findMax();
	}
	
	//returns and removes the head of the queue
	public Integer poll() {
		Integer retval = findMax();
		queue.remove(0);
		return retval;
	}
	
	//helper method that returns the head of the queue
	private Integer findMax() {
		return queue.get(0);
	}
	
	//removes all elements from this priority queue
	public void clear() {
		for(int i = 0; i < queue.size(); i++) {
			queue.remove(i);
		}
	}
	
	//errors with this merge method
//	public void merge(PriorityQueue a) {
//		for(int i = 0; i < a.size(); i++) {
//			queue.add(a.get(i));
//		}
//	}
	
}
