import java.util.Arrays;
import java.util.Random;

public class RandomQueue<E> {
	@SuppressWarnings("unchecked")
	private E[] List = (E[]) new Object[4];
	private int index = 0;
	private Random random = new Random();

	public RandomQueue() {
		
	}
	// Get list index method
	public E getList(int index) {
		return List[index];
	}
	// Get list method
	public E[] getList() {
		return List;
	}
	// enqueue method
	public void enqueue(E object) {
		if (size() >= 4 && List[size()-1] != null) {
			resize();
			List[index] = object;
			index++;
		}
		else {
			List[index] = object;
			index++;
		}
	}
	// dequeue method
	public void dequeue() {
		int rand = random.nextInt(size());
		List[rand] = List[size()-1];
		// decrease list size
		E[] newList = Arrays.copyOfRange(List, 0, size()-1);
		List = newList;
	}
	// get list size method
	public int size() {
		return List.length;
	}
	// resize method
	public void resize() {
		E[] newList = Arrays.copyOfRange(List, 0, size()+1);
		List = newList;
	}
}
