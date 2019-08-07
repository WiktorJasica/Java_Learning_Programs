package pl.codefights.interview_practice.sorting_serching.dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * You have a binary tree t. Your task is to find the largest value in each row of this tree. 
 * In a tree, a row is a set of nodes that have equal depth. For example, a row with depth 0 is a tree root, 
 * a row with depth 1 is composed of the root's children, etc.

Return an array in which the first element is the largest value in the row with depth 0, 
the second element is the largest value in the row with depth 1, the third element is the largest element in the row with depth 2, etc.

Example

For

t = {
    "value": -1,
    "left": {
        "value": 5,
        "left": null,
        "right": null
    },
    "right": {
        "value": 7,
        "left": null,
        "right": {
            "value": 1,
            "left": null,
            "right": null
        }
    }
}
the output should be largestValuesInTreeRows(t) = [-1, 7, 1].

The tree in the example looks like this:

    -1
   / \
  5   7
       \
        1
In the row with depth 0, there is only one vertex - the root with value -1;
In the row with depth 1, there are two vertices with values 5 and 7, so the largest value here is 7;
In the row with depth 2, there is only one vertex with value 1.
Input/Output

[execution time limit] 3 seconds (java)

[input] tree.integer t

A binary tree of integers.

Guaranteed constraints:
0 ≤ tree size ≤ 5 · 104,
-1000 ≤ node value ≤ 1000.

[output] array.integer

An array of the largest values in each row of t.
 */
public class LargestValuesInTreeRows {

	public static void main(String[] args) {

		int tab[] = { 1, 2, 3, 4, 5, 6};

		int[] result = maxNumbers(tab);

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	public static int[] largestValuestInTreeRows(Tree<Integer> t) {
		
		if(t==null){
	        return new int[0];
	    }
	        
	    List<Integer> l = new ArrayList<>();
	    Queue <Tree<Integer>> q = new LinkedList<Tree<Integer>>();
	    q.add(t);
	    
	    //BFS - all values in nodes
	    while(!q.isEmpty()){
	        Tree<Integer> tempNode = q.poll();
	        l.add(tempNode.value);
	        if(tempNode.left != null){
	            q.add(tempNode.left);
	        }
	        if(tempNode.right!=null){
	            q.add(tempNode.right);
	        }
	    }
	    
	    int temp [] = l.stream().mapToInt(Integer::intValue).toArray();
	    
	    //int high = treeHigh(t);
	    

		return temp;
	}
	
	public static int treeHigh(Tree<Integer> t) {
	    
	    if(t==null){
	        return 0;
	    }
	    
	    int left = treeHigh(t.left);
	    int right = treeHigh(t.right);
	    	    
	    return left > right ? 1+left : 1+right;
	}

	private static int [] maxNumbers(int[] tab) {

		int k = 3, s = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(tab[0]);

		for (int i = 1; i <= k; i++) {

			int max = -2000;
			int el = (int) Math.pow(2, i);
			s += el;

			for (int j = el - 1; j <= s; j++) {
				max = Math.max(max, tab[j]);
			}

			list.add(max);
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
