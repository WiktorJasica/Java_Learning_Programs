package pl.codefights.interview_practice.sorting_serching.dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Note: Try to solve this task without using recursion, since this is what you'll be asked to do during an interview.

Given a binary tree of integers t, return its node values in the following format:

The first element should be the value of the tree root;
The next elements should be the values of the nodes at height 1 (i.e. the root children), ordered from the leftmost to the rightmost one;
The elements after that should be the values of the nodes at height 2 (i.e. the children of the nodes at height 1) ordered in the same way;
Etc.
Example

For

t = {
    "value": 1,
    "left": {
        "value": 2,
        "left": null,
        "right": {
            "value": 3,
            "left": null,
            "right": null
        }
    },
    "right": {
        "value": 4,
        "left": {
            "value": 5,
            "left": null,
            "right": null
        },
        "right": null
    }
}
the output should be
traverseTree(t) = [1, 2, 4, 3, 5].

This t looks like this:

     1
   /   \
  2     4
   \   /
    3 5
Input/Output

[execution time limit] 3 seconds (java)

[input] tree.integer t

Guaranteed constraints:
0 ≤ tree size ≤ 104.

[output] array.integer

An array that contains the values at t's nodes, ordered as described above.
 */
public class TraverseTree {
	
	public static void main(String[] args) {
		
	}

	
	public static int [] traverseTree(Tree<Integer> t) {
		
		List<Integer> l = new ArrayList<>();
	    Queue <Tree<Integer>> q = new LinkedList<Tree<Integer>>();
	    q.add(t);
	    
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

	    return l.stream().mapToInt(Integer::intValue).toArray();
	}
}
