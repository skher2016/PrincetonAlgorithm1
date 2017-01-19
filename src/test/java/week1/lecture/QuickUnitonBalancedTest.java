package week1.lecture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class QuickUnitonBalancedTest {
	@Test
	public void quickFindTest(){
		QuickUnionBalanced uf = new QuickUnionBalanced(10);
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
		assertEquals("[6, 2, 6, 4, 6, 6, 6, 2, 4, 4]", Arrays.toString(uf.getA()));
	}
}
