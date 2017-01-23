package week2.lecture;

public class ArrayStackOfString implements StackOfString{
	
	private String stack[] = new String[1];
	private int size=0;

	@Override
	public boolean isEmpty() {
		if ( size == 0){
			return true;
		}
		return false;
	}

	@Override
	public void push(String item) {
		if (  stack.length < size + 1 ){
			resize(size *2);
		}
		
		stack[size++] = item;
	}
	
	private void resize(int n){
		if ( n == 0) return;
		String temp[] = new String[n];
		
		for ( int i=0; i < stack.length; i++){
			temp[i] = stack[i];
		}
		stack = temp;
	}

	@Override
	public String pop() {
		if ( isEmpty()){
			throw new UnsupportedOperationException("Stack is Empty");
		}
		if ( size < stack.length/4){
			resize(stack.length/4);
		}
		String poppedValue = stack[size-1];
		stack[size-1] = null;
		size--;
		return poppedValue;
	}

	@Override
	public String toString(){
		String result = "";
		for ( int i = size-1; i >=0 ; i--){
			result = result + stack[i];
		}
		return result;
	}
}
