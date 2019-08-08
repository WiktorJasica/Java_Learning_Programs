package pl.wiktorjasica.bianry_tree_algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {

		TreeImpl bst = new TreeImpl();
		bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
		System.out.println("-------------------");
		BreadthFirstSearch(bst.getRoot());
	}

	public static void BreadthFirstSearch( TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();

		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}

		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			if(temp.getLeft()!=null) queue.add(temp.getLeft());
			if(temp.getRight()!=null) queue.add(temp.getRight());
			System.out.print(temp.getValue()+" ");
		}
		
		
		
	}
}
