public class TestRandomQueue {
	private static RandomQueue<String> queue = new RandomQueue<>();
	public static void main(String[] args) {
		queue.enqueue("Abel");
		queue.enqueue("Moses");
		queue.enqueue("Samuel");
		queue.enqueue("John");
		queue.enqueue("Simba");
		queue.dequeue();
		queue.dequeue();
		
		for (Object x:queue.getList()) {
			System.out.println((String) x);
		}
	}
}
