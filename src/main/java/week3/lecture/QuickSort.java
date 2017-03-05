package week3.lecture;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

	public void sort(Comparable[] a){
		Collections.shuffle(Arrays.asList(a));
		quickSort(a, 0, a.length-1);
	}
	
	private void quickSort(Comparable[] a, int start, int end){
		if ( end - start <= 0 ){
			return;
		}
		//partition
		int pivotLoc = partition(a, start,end);
		quickSort(a, start, pivotLoc-1);
		quickSort(a, pivotLoc+1, end);
	}
	
	private int partition(Comparable[] a, int start, int end){
		int leftIndex = start + 1;
		int rightIndex = end ;
		int pivot = start;
		//System.out.println("Pivot: " + a[pivot] +", array: " + Arrays.toString(a) + ", start: " + start+", end: "+end);
		while ( true ){
			// Find a value that is bigger than pivot
			while (leftIndex <= end && a[pivot].compareTo(a[leftIndex]) > 0 ){
				leftIndex++;
			}
			while ( rightIndex > start && a[pivot].compareTo(a[rightIndex]) <= 0  ){
				rightIndex--;
			}
			if ( rightIndex < leftIndex){
				swap(a, rightIndex, pivot);
				//System.out.println("partition: " + Arrays.toString(a));
				break;
			}else{
				swap(a, leftIndex, rightIndex);
				//System.out.println("partition: " + Arrays.toString(a));
			}
						
		}
		return rightIndex;
	}
	
	private void swap(Comparable[] a, int i, int j){
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
