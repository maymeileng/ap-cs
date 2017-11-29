public class Sort {
	
	 public static void main(String[] args) {
		 int[] input = {3, 2, 9, 6, 5, 10, 8, 7, 1, 4};
		 printNums(insertionSort(input));
		 printNums(bubbleSort(input));
		 printNums(selectionSort(input));
	 }
	 
	 private static void printNums(int[] input) {
		for (int num: input) {
			 System.out.print(num + " ");
		}
	        System.out.println();
	 }
	 
	 public static int[] insertionSort(int[] array) {
		 int n = array.length;
		 for (int j = 1; j < n; j++) {
			 int key = array[j];
			 int i = j - 1;
			 while ( (i > -1) && (array[i] > key) ) {
				 array [i+1] = array [i];
				 i--;
			 }
			 array[i+1] = key;
			 }
		 return array;
	 }
	 
	 public static int[] bubbleSort(int[] array) {
		 int n = array.length;
		 int temp = 0;
		 for(int i = 0; i < n; i++){
			 for(int j = 1; j < (n - i); j++){
				 if (array[j-1] > array[j]) {
					 temp = array[j-1];
					 array[j-1] = array[j];
					 array[j] = temp;
				 }
			 }
		 }
		 return array;
	 } 
	    
	 public static int[] selectionSort(int[] array){ 
		 int n = array.length;
		 for (int i = 0; i < n - 1; i++) {  
			 int index = i;  
			 for (int j = i + 1; j < n; j++) {  
				 if (array[j] < array[index]) {  
					 index = j; 
				 }  
			 }  
			 int num = array[index];   
			 array[index] = array[i];  
			 array[i] = num;  
		 } 
		 return array;
	 }  
	
}
