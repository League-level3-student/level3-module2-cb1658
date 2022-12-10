package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import _02_Intro_To_Searching_Algorithms._01_LinearSearch;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	
    	String[] cha = {"bbbb","ca","balt","boing","hy"};
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(_01_LinearSearch.linearSearch(cha,"balt"), 2);
        assertEquals(_01_LinearSearch.linearSearch(cha,"boing"), 3);
    
    }
	@Test
    public void testBinarySearch() {
		int[] cha = {2,5,8,20,21,30};
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(_02_BinarySearch.binarySearch(cha,0,cha.length-1,5), 1);
        assertEquals(_02_BinarySearch.binarySearch(cha,0,cha.length-1,6), -1);
    }
}
