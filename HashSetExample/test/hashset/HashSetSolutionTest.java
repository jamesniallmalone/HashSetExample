package hashset;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HashSetSolutionTest {
	
	@Test
	public void testHappyPath() {
		int[] sol = {5,10,1,2,7,3,4};
		int answer = new HashSetSolution().solution(sol);
		
		assertTrue(answer == 6);
		
	}
	
	//Given [-1, -3] the function should return 1.
	@Test
	public void testNegativeNumbers() {
		int[] sol = {-1, -3};
		int answer = new HashSetSolution().solution(sol);
		
		assertTrue(answer == 1);
	}
	
	//given A = [1, 3, 6, 4, 1, 2] the function should return 5.
	@Test
	public void testPremise() {
		int[] sol= {1, 3, 6, 4, 1, 2};
		int answer = new HashSetSolution().solution(sol);
		assertTrue(answer == 5);
	}
	
}
