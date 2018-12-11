package hashset;

import java.util.*;

/*
 * Write a function that, given an array A of N integers, returns the smallest positive integer that does no occur in A.
 * 
 * For example, given A = [1, 3, 6, 4, 1, 2] the function should return 5.
 * Given [1,2,3] the function should return 4.
 * Given [-1, -3] the function should return 1.
 * 
 * N is an integer within the range 1.. 100 and each element of the array falls within the range -100 .. +100
 * 
 */
public class HashSetSolution {
    public int solution(int[] A) {
        
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int counter = 1;
        
        //Add all elements from array to hashset.
        for(int i = 0; i < A.length; i++)
            hashSet.add(A[i]);
            
        while(hashSet.contains(counter)){
            counter++;
        }
        
        return counter;
        
    }
}