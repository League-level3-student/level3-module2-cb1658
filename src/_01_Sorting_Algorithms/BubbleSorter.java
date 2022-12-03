package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	Boolean bool = false;
    	while(bool == false) {
    		display.updateDisplay();
    		bool = true;
    			for(int i = 0; i < array.length-1; i++) {	
    				if(array[i] > array[i+1]) {
    					bool = false;
    				}
    			}
    		if(!bool) {
    			for(int i = 0; i < array.length-1; i++) {
    				if(array[i]>array[i+1]) {
    					int MEMORIES;
    	    	    	MEMORIES = array[i+1];
    	    	    	array[i+1]=array[i];
    	    	    	array[i] = MEMORIES;
    				}
    			}
    		}
    	}
    }
}
