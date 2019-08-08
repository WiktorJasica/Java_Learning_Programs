package pl.wiktorjasica.bianry_tree_algorithms;

public class TreeNode {

	private TreeNode left;
	private TreeNode right;
	private Integer value;
	

	// Constructor
	public TreeNode(Integer value) {

		this.value = value;
	}

	// Gettets and setters
	public TreeNode  getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
