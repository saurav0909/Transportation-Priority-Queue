package TransportationRequestComparator;

import java.util.Comparator;
import java.util.PriorityQueue;

import transportation.Transportation;

public class TransportationRequestComparator implements Comparator<Transportation>{
	
	@Override
	public int compare(Transportation t1,Transportation t2) {
		return Integer.compare(t1.getId(),t2.getId());
	}
	
    public static void main(String[] args) {
        PriorityQueue<Transportation> queue = new PriorityQueue<>(new TransportationRequestComparator());

        
        queue.add(new Transportation("Medical Supplies", 1));
        queue.add(new Transportation("Food Delivery", 3));
        queue.add(new Transportation("Passenger Transport", 2));

        System.out.println("Transporation Order");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


}
