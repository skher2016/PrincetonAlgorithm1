package week1.lecture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class QuickUnionFindTest {
	@Test
	public void quickFindTest(){
		QuickUnionFind uf = new QuickUnionFind(10);
		uf.union(4, 3);
		uf.union(3, 8);
		uf.union(6, 5);
		uf.union(9, 4);
		uf.union(2, 1);
		
		assertTrue(uf.connected(8, 9));
		assertFalse(uf.connected(5, 0));
		
		uf.union(5, 0);
		uf.union(7, 2);
		uf.union(6, 1);
		uf.union(7, 3);
		assertEquals("[1, 8, 1, 8, 3, 0, 5, 1, 8, 8]", Arrays.toString(uf.getA()));
	}
}
