package week1.lecture;

public class UnionFind {
	
	private int [] a;
	
	public UnionFind(int size){
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
		int pContents = a[p];
		int qContents = a[q];
		
		for ( int i=0; i < a.length; i++){
			if (a[i] == pContents ){
				a[i] = qContents;
			}
		}
	}
	
	public int[] getA(){
		return a;
	}
}
