package pl.wiktorjasica.binary_tree;

public class TreeImpl {

	private TreeNode root;

	public boolean isEmpty() {
		return root == null;
	}

	public TreeNode insert(int value) {

		if (root == null) {
			this.root = new TreeNode(value);
			return root;
		}
		return insertTreeNode(root, value);
	}

	private TreeNode insertTreeNode(TreeNode root, int value) {

		TreeNode tempNode = null;

		if (value < root.getValue()) {
			if (root.getLeft() == null) {
				root.setLeft(new TreeNode(value));
				return root.getLeft();
			} else {
				tempNode = root.getLeft();
			}
		} else {
			if (root.getRight() == null) {
				root.setRight(new TreeNode(value));
				return root.getRight();
			} else {
				tempNode = root.getRight();
			}
		}

		return insertTreeNode(tempNode, value);
	}

	public TreeNode getRoot() {
		return root;
	}

}
