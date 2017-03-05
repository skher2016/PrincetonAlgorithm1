package week3.lecture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class TestQuickSort {
	@Test
	public void shouldSortGivenEvenElements(){
		System.out.println("Even number");
		Integer input[] = {4,6,8,2,1,11};
		
		QuickSort obj = new QuickSort();
		obj.sort(input);
		
		assertEquals("[1, 2, 4, 6, 8, 11]", Arrays.toString(input));
	}
	
	@Test
	public void shouldSortGivenOddElements(){
		System.out.println("Odd number");
		String input[] = {"i","h","g","f","e","d","c","b","a"};
		
		QuickSort obj = new QuickSort();
		obj.sort(input);
		
		assertEquals("[a, b, c, d, e, f, g, h, i]", Arrays.toString(input));
	}
	
	@Test
	public void shouldSortOneElement(){
		System.out.println("one number");
		Integer input[] = {10};
		
		QuickSort obj = new QuickSort();
		obj.sort(input);
		
		assertEquals("[10]", Arrays.toString(input));
	}
	@Test
	public void shouldSortTwoElements(){
		System.out.println("two numbers");
		Integer input[] = {10, 8};
		
		QuickSort obj = new QuickSort();
		obj.sort(input);
		
		assertEquals("[8, 10]", Arrays.toString(input));
	}
	
	@Test
	public void shouldSortBigArray(){
		Integer input[] = generateRandomArray(10000000);
		
		QuickSort obj = new QuickSort();
		obj.sort(input);
		
		for ( int i=0; i < input.length -1; i++ ){
			assertTrue(input[i] <= input[i+1]);
		}
	}
	
	private Integer[] generateRandomArray(int size){
		Random rand = new Random(System.currentTimeMillis());
		
		Integer a[] = new Integer[size];
		for ( int i = 0; i < size; i++ ){
			a[i] = rand.nextInt(size);
		}
		return a;
	}
}
