package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr); 
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        Boolean boom = false;
        for(int cacha = 0; cacha < arr.length; cacha++) {
        	if(key == arr[cacha]) {
        		boom = true;
        	}
        }
        return boom;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        Collections.sort(list);
        if(Collections.binarySearch(list,key)>-1) {
        	return true;
        }
        return false;
    }
}
