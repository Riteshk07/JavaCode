import java.util.PriorityQueue;
// ordered and sorted

class A{
	public static void main (String [] args){
		PriorityQueue <String>q = new PriorityQueue<String>();
		PriorityQueue <Integer>s = new PriorityQueue<Integer>();
		
		s.offer(12);
		s.offer(78);
		s.offer(23);
		s.offer(45);
		s.offer(10);
		
		q.offer("om");
		q.offer("ram");
		q.offer("ramesh");
		q.offer("ritesh");
		q.offer("raghunandan");
		
		for (int i=0; i<5; i++){
			System.out.print(q.poll()+" - ");
			System.out.println(s.poll());
		}
	}
}