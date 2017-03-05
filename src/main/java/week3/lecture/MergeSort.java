package week3.lecture;

import java.util.Arrays;

public class MergeSort {

	public Comparable[] sort(Comparable[] a){
		if ( a == null || a.length == 0 ){
			throw new IllegalArgumentException("Input array is empty");
		}
		if ( a.length == 1 ){
			return a; // No need to sort
		}
		Comparable [] aux = new Comparable[a.length];
		
		mergeSort(a, aux, 0, a.length -1);
		return a;
	}
	
	private void mergeSort(Comparable[] a, Comparable aux[], int start, int end){
		if ( end - start < 1 ){
			return;
		}
	
		int mid = start + ( end - start)/2;
		mergeSort(a, aux, start, mid);
		mergeSort(a, aux, mid+1, end);
		
		// copy array
		for ( int i = start ; i <= end; i++){
			aux[i] = a[i];
		}
		//System.out.println("start: " + start + ", mid: "+ mid + ", end: "+ end);
		// merge
		merge(a, aux, start, mid, end);
		//System.out.println("left:" + left + ", right:" + right + ",k: " + k);
		
		//System.out.println(Arrays.toString(a));
	}

	//TODO: Implement bottom merge sort
//	public Comparable[] bottomUpMerge(Comparable[] a){
//		Comparable[] aux = new Comparable[a.length];
//		
//		for ( int i = 2 ; i < a.length; i = i * i){
//			int size = i;
//			for ( int j = 0 ; j < size; j = j+size){
//				int start = j;
//				int end = j+size;
//				int mid = start +( end-start)/2;
//				merge(a, aux, start, mid, end);
//			}
//		}
//	}
	private void merge(Comparable[] a,Comparable[] aux, int start, int mid, int end ){
		int left = start;
		int right = mid +1;
		for ( int k= start; k <= end; k++){
			if ( left > mid ){ // compared all left elements
				a[k] = aux[right]; 
				right++;
			}else if ( right > end){ // compared all right elements
				a[k] = aux[left];
				left++;
			}else if ( aux[left].compareTo(aux[right]) <= 0 ){
				a[k] = aux[left];
				left++;
			}else{
				a[k] = aux[right];
				right++;
			}
		}
	}
}
