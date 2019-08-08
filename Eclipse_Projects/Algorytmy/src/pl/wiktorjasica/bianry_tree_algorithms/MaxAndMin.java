package pl.wiktorjasica.bianry_tree_algorithms;

public class MaxAndMin {

	public static void main(String[] args) {

		TreeImpl bst = new TreeImpl();
        bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
        bst.insert(2);
        System.out.println("-------------------");
        System.out.println("Min value: "+findMin(bst.getRoot()));
        System.out.println("Max value: "+findMax(bst.getRoot()));
	}

	public static int findMax(TreeNode root) {

		if (root == null) {
			throw new IllegalArgumentException();
		}
		
		if(root.getRight()==null) {
			
			return root.getValue();
		}
		return findMax(root.getRight());
	}
	
	public static int findMin(TreeNode root) {

		if (root == null) {
			throw new IllegalArgumentException();
		}
		
		if(root.getLeft()==null) {
			
			return root.getValue();
		}
		return findMin(root.getLeft());
	}
}
