import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRandomQueue {
	private static RandomQueue<String> queue = new RandomQueue<>();
	
	@Test
	public static void main(String[] args) {
		queue.enqueue("Abel");
		queue.enqueue("Moses");
		queue.enqueue("Samuel");
		queue.enqueue("John");
		queue.enqueue("Simba");
		queue.dequeue();
		queue.dequeue();
		
		try {
			assertEquals((long) 3, (long) queue.size());
			System.out.println("True\n");
		}
		catch(AssertionError e) {
			System.out.println(e);
		}
		
		for (Object x:queue.getList()) {
			System.out.println((String) x);
		}
		
	}
}
