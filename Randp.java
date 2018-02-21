package week16;

public class Randp {
	
	public static void main(String[] args) {
		Randp rand = new Randp(6);
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());		
	}
	
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
    		numsLeft = n;
    		nums = new int[n]; 
    		initNums(n);
    }
	
    //creates an array of unique elements
    private void initNums(int n) {    	
    		//creates an initial array of numbers that are not unique
    		for(int i = 0; i < n; i++) {
    			nums[i] = 1 + (int)(Math.random()*n);
    		}
    		
    		//replaces integers that are repeated until all elements are unique
    		while(match() == true) {
    			nums[findMatch()] = 1 + (int)(Math.random()*n);
    		}  		 		
    }
    
    //helper method that returns whether or not there are duplicate elements
    private boolean match() {
    		boolean val = false;
    		for(int i = 0; i < nums.length; i++) {
    			for(int j = 0; j < i; j++) {
    				if(nums[i] == nums[j]) {
    					val = true;
    					break;
    				}
    			}
    		}
    		return val;
    }
    
    //helper method that finds the index of one of the repeated elements
    private int findMatch() {
    		int num = 0;
    		for(int i = 0; i < nums.length; i++) {
    			for(int j = 0; j < i; j++) {
    				if(nums[i] == nums[j]) {
    					num = i;
    				}
    			}
    		}
    		return num;
    }   
    
	//returns integers in the array in the order of last index to first index, then returns zeros
    public int nextInt() {
    		numsLeft-=1;
    		if(numsLeft >= 0) {
    			return nums[numsLeft];
    		} else {
    			return 0;
    		}
    }
}
