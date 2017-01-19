package week1.lecture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class UnionFindTest {

	@Test
	public void quickFindTest(){
		UnionFind uf = new UnionFind(10);
		uf.union(4, 3);
		uf.union(3, 8);
		uf.union(6, 5);
		uf.union(9, 4);
		uf.union(2, 1);
		assertEquals("[0, 1, 1, 8, 8, 5, 5, 7, 8, 8]",Arrays.toString(uf.getA()));
		
		assertTrue(uf.connected(8, 9));
		assertFalse(uf.connected(5, 0));
		
		uf.union(5, 0);
		uf.union(7, 2);
		uf.union(6, 1);
		assertEquals("[1, 1, 1, 8, 8, 1, 1, 1, 8, 8]", Arrays.toString(uf.getA()));
	}
}
