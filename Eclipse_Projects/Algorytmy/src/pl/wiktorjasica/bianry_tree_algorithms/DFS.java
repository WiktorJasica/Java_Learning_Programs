package pl.wiktorjasica.bianry_tree_algorithms;

public class DFS {
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
		System.out.println("--------------------");
		preOrder(bst.getRoot());
		System.out.println();
		inOrder(bst.getRoot());
		System.out.println();
		postOrder(bst.getRoot());

	}

	public static void preOrder(TreeNode root) {

		if (root == null) {
			return;
		}

		System.out.print(root.getValue() + " ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public static void inOrder(TreeNode root) {

		if (root == null) {
			return;
		}

		inOrder(root.getLeft());
		System.out.print(root.getValue() + " ");
		inOrder(root.getRight());
		
	}
	
	public static void postOrder(TreeNode root) {

		if (root == null) {
			return;
		}

		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue()+" ");
		
	}
}
