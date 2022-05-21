import java.util.LinkedList;

class A {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
		

        //Case 3:
        //LinkedList as a Queue
        list.offer(44);
        list.offer(89);
        list.offer(9);
        list.offer(17);

        System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());
        // System.out.println(list.peek());

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        //Case 2:
        //LinkedList as a Stack
        
        list.push(34);
        list.push(67);
        list.push(25);
        list.push(9);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        

        //Case 1:
        // LinkedList as a List
        
        list.add(23);
        list.add(12);
        list.add(56);
        list.add(89);

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        
    }
}