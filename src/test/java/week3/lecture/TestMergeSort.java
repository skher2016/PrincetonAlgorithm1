package week3.lecture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class TestMergeSort {

	@Test
	public void shouldSortGivenOddElements(){
		String input[] = {"i","h","g","f","e","d","c","b","a"};
		
		MergeSort obj = new MergeSort();
		Comparable[] actual = obj.sort(input);
		
		assertEquals("[a, b, c, d, e, f, g, h, i]", Arrays.toString(actual));
	}
	
	@Test
	public void shouldSortGivenEvenElements(){
		Integer input[] = {4,6,8,2,1,11};
		
		MergeSort obj = new MergeSort();
		Comparable[] actual = obj.sort(input);
		
		assertEquals("[1, 2, 4, 6, 8, 11]", Arrays.toString(actual));
	}
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotSortGivenInvalidInput(){
		MergeSort obj = new MergeSort();
		Comparable[] actual = obj.sort(null);
	}
	
	@Test
	public void shouldSortGivenLargeSet(){
		//Given
		Random rand = new Random();
		Integer input[] = new Integer[1000000];
		for ( int i = 0; i < 1000000; i++){
			input[i] = rand.nextInt(10000);
		}
		
		//When
		MergeSort obj = new MergeSort();
		Comparable[] actual = obj.sort(input);
		
		//Then
		for ( int i = 0 ; i < 999999; i++){
			assertTrue(actual[i].compareTo(actual[i+1]) <= 0);
		}
	}
}
