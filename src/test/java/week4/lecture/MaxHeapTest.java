package week4.lecture;

import org.junit.Test;

public class MaxHeapTest {

	@Test
	public void shouldInsert(){
		MaxHeap<Integer> heap = new MaxHeap<Integer>(10);
		
		heap.insert(1);
		heap.insert(2);
		heap.insert(4);
	}
}
