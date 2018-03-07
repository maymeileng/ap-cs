import java.util.ArrayList;
import java.util.Arrays;

public class SetStuff {
	
	ArrayList<Integer> ret17() {
		  ArrayList<Integer> retval = new ArrayList<Integer>();
		  retval.add(17);
		  return retval;
	}
	
	Integer zerothElement(ArrayList<Integer> al){
		  return al.get(0);
	}
	
	boolean contains(int a, int[] ar){
		  boolean val = false;
		  for(int num: ar) {
		    if (num == a) {
		      val = true;
		    }
		  }
		  return val;
	}
	
	boolean anyContains(int[] a, int[] b){
		  boolean retval = false;
		  int i = 0;
		  while(i < a.length) {
		    if (contains(a[i], b) == true) {
		      retval = true;
		      break;
		    } else {
		      i++;
		    }
		  }
		  return retval;
	}
	
	int[] union(int[] a, int[] b){
		  int[] retval = new int[a.length + b.length];
		  for(int i = 0; i < a.length; i++) {
		    retval[i] = a[i];
		  }
		  for(int i = a.length; i < retval.length; i++) {
		    retval[i] = b[i-a.length];
		  }
		  return retval;
	}
	
	int[] intersect(int[] a, int[] b){
		  Arrays.sort(a);
		  Arrays.sort(b);
		  ArrayList<Integer> result = new ArrayList<Integer>();
		  int i = 0;
		  int j = 0;
		  while(i < a.length && j < b.length){
			  if (a[i] > b[j]){
			    j++;
			  } else if (a[i] < b[j]) {
			    i++;
			  } else {
			    result.add(a[i]);
			    i++;
			    j++;
			  }
		  }
			int[] array = new int[result.size()];
			for(int k = 0; k < array.length; k++) {
		    array[k] = result.get(k);
		  }
		  return array;
	}
	
	String nearesUnvisitedNode(boolean[] visited, int[] distance, String[] nodeName){
		  int[] nums = new int[findLength(visited)];
		  String retval = "";
		  if(nums.length == 0) {
		  } else {
		  int index = 0;
		  for(int i = 0; i < visited.length; i++) {
		    if(visited[i] == false) {
		      nums[index] = i;
		      index++;
		    }
		  }
		  int num = 100;
		  int fin = 100;
		  for(int i = 0; i < nums.length; i++) {
		    if(distance[nums[i]] < num) {
		      num = distance[nums[i]];
		      fin = nums[i];
		    }
		  }
		  retval = nodeName[fin];
		  }
		  return retval;
		}

		private int findLength(boolean[] visited) {
		  int count = 0;
		  for(int i = 0; i < visited.length; i++) {
		    if (visited[i] == false) {
		      count++;
		    }
		  }
		  return count;
	}
	
	ArrayList<Object> listify(int a, int b, int c){
			  ArrayList<Object> nums = new ArrayList<Object>(
			    Arrays.asList(a, b, c));
			  return nums;
	}
	
	ArrayList<ArrayList<Object>> addEdge(ArrayList<ArrayList<Object>> graph, int a, int b, int c){
		  ArrayList<Object> nums = listify(a, b, c);
		  graph.add(nums);
		  return graph;
	}
	
	ArrayList<Integer> setInfinity(int n, int start){
		  ArrayList<Integer> retval = new ArrayList<Integer>();
		  for(int i = 0; i < n; i++) {
		    retval.add(2147483647);
		  }
		  retval.set(start, 0);
		  return retval;
	}
	
}
