package week2.lecture;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedStackOfChange {

	@Test
	public void shouldPushMultipleItems(){
		LinkedStackOfString stack = new LinkedStackOfString();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		assertEquals("cba", stack.toString());
		
	}
	
	@Test
	public void shouldPopMultipleItems(){
		LinkedStackOfString stack = new LinkedStackOfString();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		String actual1 = stack.pop();
		String actual2 = stack.pop();
		
		assertEquals("c", actual1);
		assertEquals("b", actual2);
	}
	
	@Test
	public void shouldPushAndPop(){
		LinkedStackOfString stack = new LinkedStackOfString();
		stack.push("a");
		stack.push("b");
		String actual1 = stack.pop();
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		
		String actual2 = stack.pop();
		String actual3 = stack.pop();
		
		assertEquals("b", actual1);
		assertEquals("f", actual2);
		assertEquals("e", actual3);
		
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void shouldNotPopGivenEmptyStack(){
		LinkedStackOfString stack = new LinkedStackOfString();
		stack.push("a");
		stack.push("b");
		stack.pop();
		stack.pop();
		stack.pop();		
	}
	
}
