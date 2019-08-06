package pl.codefights.interview_practice.data_structures.trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree t, 
 * determine whether it is symmetric around its center, i.e. each side mirrors the other.

Example

For

t = {
    "value": 1,
    "left": {
        "value": 2,
        "left": {
            "value": 3,
            "left": null,
            "right": null
        },
        "right": {
            "value": 4,
            "left": null,
            "right": null
        }
    },
    "right": {
        "value": 2,
        "left": {
            "value": 4,
            "left": null,
            "right": null
        },
        "right": {
            "value": 3,
            "left": null,
            "right": null
        }
    }
}
the output should be isTreeSymmetric(t) = true.

Here's what the tree in this example looks like:

    1
   / \
  2   2
 / \ / \
3  4 4  3
As you can see, it is symmetric.

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
        "value": 2,
        "left": null,
        "right": {
            "value": 3,
            "left": null,
            "right": null
        }
    }
}
the output should be isTreeSymmetric(t) = false.

Here's what the tree in this example looks like:

    1
   / \
  2   2
   \   \
   3    3
As you can see, it is not symmetric.

Input/Output

[execution time limit] 3 seconds (java)

[input] tree.integer t

A binary tree of integers.

Guaranteed constraints:
0 ≤ tree size < 5 · 104,
-1000 ≤ node value ≤ 1000.

[output] boolean

Return true if t is symmetric and false otherwise.
 */
public class IsTreeSymmetric {

	public static void main(String[] args) {
		
		Tree<Integer> root = new Tree<>(99);
		Tree<Integer> lvl1_l = new Tree<Integer>(100);
		Tree<Integer> lvl1_r = new Tree<Integer>(99);
		lvl1_l.left=null;
		lvl1_l.right=null;
		lvl1_r.left=null;
		lvl1_r.right=null;
		
		root.left=lvl1_l;
		root.right=lvl1_r;
		
		System.out.println(isTreeSymmetric(root));
		
	}
	
	public static boolean isTreeSymmetric(Tree<Integer> t) {
		List<Integer>values = new ArrayList<>();
	       
	    if(t==null){
	        return true;
	    }
	    
	    isTreeSymmetric(t.left);
	    
	    
	    if(t.value!=null){
	    	values.add(t.value);
	    System.out.print(t.value+" ");
	    }
	    
	    isTreeSymmetric(t.right);
	    
	    int n = values.size()-1;
	   	 
	    for(int i=0; i<values.size(); i++){
	    	System.out.print(values.get(i)+" "+ values.get(n-i));
        	System.out.println();
	    	
	        if(!values.get(i).equals(values.get(n-i))){
	        	
	            return false;
	        }
	    }
	    
	    return true;
	}
	
	
	
	
	
}
