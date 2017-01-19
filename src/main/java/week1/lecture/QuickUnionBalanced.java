package week1.lecture;

public class QuickUnionBalanced {
	private int [] a;
	private int [] children;
	
	public QuickUnionBalanced(int size){
		a = new int[size];
		children = new int[size];
		// initialize the array
		for ( int i = 0 ; i < size; i++){
			a[i] = i;
			children[i] = 1;
		}
	}
	public boolean connected(int p, int q){
		if ( p >= a.length || q >= a.length){
			throw new IllegalArgumentException("There is no node like " + p + " or " + q);
		}
		
		return a[p] == a[q];
	}
	
	public void union(int p, int q){
		if ( p >= a.length || q >= a.length){
			throw new IllegalArgumentException("There is no node like " + p + " or " + q);
		}
		int pRoot = root(p);
		int qRoot = root(q);
		
		int pChildren = children[pRoot];
		int qChildren = children[qRoot];
		
		if  ( pChildren < qChildren ){
			a[pRoot] = qRoot;
			children[qRoot] = children[pRoot] + children[qRoot];
			children[pRoot] = 0;
		}else{
			a[qRoot] = pRoot;
			children[pRoot] = children[pRoot] + children[qRoot];
			children[qRoot] = 0;			
		}
	}
	
	private int root(int obj){
		int i = obj;
		while ( a[i] != i ){
			i = a[i];
		}
		return i;
	}
	public int[] getA(){
		return a;
	}
}
