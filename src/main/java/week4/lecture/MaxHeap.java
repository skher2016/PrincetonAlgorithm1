package week4.lecture;

public class MaxHeap<T extends Comparable<T>> {
	
	private T[] heap;
	private int num;
	
	public MaxHeap(int size){
		heap =(T[]) new Comparable[size];
	}
	
	public void insert(T key){
		num = num +1;
		heap[num] = key;

		int j = num;
		int parents = j/2;
		while ( j > 0 && parents > 0 && heap[j].compareTo(heap[parents]) > 0){
			swap(j, parents);
			j = parents;
			parents = j/2;
		}		
	}
	
	private int less(int left, int right){
		if ( heap[left] == null && heap[right] == null){
			return -1; //leaf
		}else if ( heap[left] == null ){
			return right;
		}else if ( heap[right] == null ){
			return left;
		}else if ( heap[left].compareTo(heap[right]) <= 0){
			return left;
		} else{
			return right;
		}
	}
	
	private void swap(int i1, int i2){
		T temp = heap[i1];
		heap[i1] = heap[i2];
		heap[i2] = temp;
	}
	
	public T delete(){
		T max = heap[1];
		swap(1, num);
		
		int j = 1;
		int child = less(2*j, 2*j+1);
		while ( j < num && heap[child].compareTo(heap[j]) > 0 ){
			swap(child, j);
			j = child;
		}
		return max;
	}
}
