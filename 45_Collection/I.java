import java.util.PriorityQueue;
// ordered and sorted

class A{
	public static void main (String [] args){
		PriorityQueue q = new PriorityQueue();
		
		//q.offer(12);
		//q.offer(78);
		//q.offer(23);
		//q.offer(45);
		//q.offer(10);
		
		q.offer("om");
		q.offer("ram");
		q.offer("ramesh");
		q.offer("ritesh");
		q.offer("raghunandan");
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}