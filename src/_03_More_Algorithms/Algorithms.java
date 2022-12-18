package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.List;


public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return Integer.toString(num1*num2);
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for(int i = 0; i < eggs.size(); i++) {
        	if(eggs.get(i) == "cracked") {
        		return i;
        	}
        }
        return -1;
    }
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	for(int i = 0; i < oysters.size(); i++) {
        	if(oysters.get(i) == true) {
        		count++;
        	}
        }
        return count;
    }
    public static double findTallest(List<Double> peeps) {
    	double tallest = 0;
    	for(int i = 0; i < peeps.size()-1; i++) {
    		if(peeps.get(i)>tallest) {
    			tallest = peeps.get(i);
    		}
    	}
    	return tallest;
    }
    public static String findLongestWord(List<String> words) {
    	String longest = ""; 
    	for(int i = 0; i < words.size()-1; i++) {
    		if(words.get(i).length() > longest.length()) {
    			longest = words.get(i);
    		}
    	}
    	return longest;
    }
    public static Boolean containsSOS(List<String> message) {
    	Boolean hasSOS = false;
    	for(int i = 0; i < message.size() - 10; i++) {
    		if(message.get(i).equals(".") && message.get(i+1).equals(".") && message.get(i+2).equals(".") 
    				&& message.get(i+3).equals("-") && message.get(i+4).equals("-") && message.get(i+5).equals("-")
    				&& message.get(i+6).equals(".") && message.get(i+7).equals(".") && message.get(i+8).equals(".")) {
    			
    			hasSOS = true;
    		}
    	}
    	return hasSOS;
    }
    public static List<Double> sortScores(List<Double> results){
    	
    	
    	Boolean bool = false;
    	double[] array = null;
    	for(int i = 0; i < results.size(); i++) {
    		array[i] = results.get(i);
    	}
    	
    	
    	while(bool == false) {
    		bool = true;
    			for(int i = 0; i < array.length-1; i++) {	
    				if(array[i] > array[i+1]) {
    					bool = false;
    				}
    			}
    		if(!bool) {
    			for(int i = 0; i < array.length-1; i++) {
    				if(array[i]>array[i+1]) {
    					double MEMORIES;
    	    	    	MEMORIES = array[i+1];
    	    	    	array[i+1]=array[i];
    	    	    	array[i] = MEMORIES;
    				}
    			}
    		}
    	}
    	
    	List<Double> newresults = new ArrayList<Double>();
    	for(int i = 0; i < array.length; i++) {
    		newresults.set(i, array[i]);
    	}
    	return newresults;
    	
    }
    /////////////////////////////////////////////////////////////////////////////
    
    
    public static List<String> sortDNA(List<String> unsorted){
    	Boolean bool = false;
    	String[] array = null;
    	for(int i = 0; i < unsorted.size(); i++) {
    		array[i] = unsorted.get(i);
    	}
    	
    	
    	while(bool == false) {
    		bool = true;
    			for(int i = 0; i < array.length-1; i++) {	
    				if(array[i].length() > array[i+1].length()) {
    					bool = false;
    				}
    			}
    		if(!bool) {
    			for(int i = 0; i < array.length-1; i++) {
    				if(array[i].length()>array[i+1].length()) {
    					String MEMORIES;
    	    	    	MEMORIES = array[i+1];
    	    	    	array[i+1]=array[i];
    	    	    	array[i] = MEMORIES;
    				}
    			}
    		}
    	}
    	
    	List<String> sorted = new ArrayList<String>();
    	for(int i = 0; i < array.length; i++) {
    		sorted.set(i, array[i]);
    	}
    	return sorted;
    	
    }
    
        
       
    /////////////////////////////////////////////////////////////////////////////
    
    public static List<String> sortWords(List<String> words){
    	Boolean bool = false;
    	String[] array = null;
    	for(int i = 0; i < words.size(); i++) {
    		array[i] = words.get(i);
    	}
    	
    	
    	while(bool == false) {
    		bool = true;
    			for(int i = 0; i < array.length-1; i++) {	
    				if(array[i].compareTo(array[i+1])>0) {
    					bool = false;
    				}
    			}
    		if(!bool) {
    			for(int i = 0; i < array.length-1; i++) {
    				if(array[i].compareTo(array[i+1])>0) {
    					String MEMORIES;
    	    	    	MEMORIES = array[i+1];
    	    	    	array[i+1]=array[i];
    	    	    	array[i] = MEMORIES;
    				}
    			}
    		}
    	}
    	
    	List<String> sorted = new ArrayList<String>();
    	for(int i = 0; i < array.length; i++) {
    		sorted.set(i, array[i]);
    	}
    	return sorted;
    }
    
    
}
