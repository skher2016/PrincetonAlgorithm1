package week1.lecture;

public class QuickUnionFind {
private int [] a;
	
	public QuickUnionFind(int size){
		a = new int[size];
		// initialize the array
		for ( int i = 0 ; i < size; i++){
			a[i] = i;
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
		
		if  ( pRoot != qRoot ){
			a[pRoot] = qRoot;
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
