package week2.lecture;

/**
 * This class implements push/pop stack operation using linked list.
 * 
 * Running time for push: constant
 * Running time for pop: constant
 * 
 * Analysis: Use more space comparing to array implementation(with resize)  
 * 
 * @author sher
 *
 */
public class LinkedStackOfString implements StackOfString{

	private Node list;
	private class Node{
		String item;
		Node next;
		@Override
		public String toString() {
			return item;
		}
		
		
	}
	@Override
	public boolean isEmpty() {
		if (list == null){
			return true;
		}
		return false;
	}

	@Override
	public void push(String item) {
		
		Node saveFirstNode = list;
		
		Node newNode = new Node();
		newNode.item = item;
		newNode.next = saveFirstNode;
		
		list = newNode;
		
	}

	@Override
	public String pop() {
		if ( isEmpty()){
			throw new UnsupportedOperationException("Stack is empty. Nothing to pop");
		}
		Node popped = list;
		list = list.next;
		return popped.item;
	}

	@Override
	public String toString() {
		String listString="";
		Node curr = list;
		while ( curr != null ){
			listString = listString + curr.toString();
			curr = curr.next;
		}
		return listString;
	}

	
}
