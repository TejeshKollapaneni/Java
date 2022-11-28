import java.util.*;
class Queue1
{
	public static void main(String[] args)
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();//priority queue object creation
		queue.add("Amit");//add the element in the queue
		queue.add("Ragul");
		queue.add("jansi");
		queue.add("vijay");
		queue.add("jai");
		System.out.println("Head:"+queue.element());
		System.out.println("Head:"+queue.peek());//retrive the element
		Iterator itr=queue.iterator();//traverse the element using iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove();//using remove() method remove the head of thia queue
		System.out.println("After invoking remove() methods");
		Iterator itr1=queue.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		queue.poll();//using poll() method remove the head of thiS queue
		System.out.println("After invoking  poll() methods");
		Iterator itr2=queue.iterator();//TRAVERSING THE ELMENT USING ITERATOR
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
