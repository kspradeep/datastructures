package com.uttara.generictreeset;


public class GenericBinarySearchTree<T extends Comparable<T>> {
	
	private class GenericBinaryTreeNode {
		
		private T data;
		private GenericBinaryTreeNode left = null;
		private GenericBinaryTreeNode right = null;
		
		
	
		/**
		 * @param data
		 */
		public GenericBinaryTreeNode(T data) {
			super();
			this.data = data;
		}
		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}
		/**
		 * @return the left
		 */
		public GenericBinaryTreeNode getLeft() {
			return left;
		}
		/**
		 * @param left the left to set
		 */
		public void setLeft(GenericBinaryTreeNode left) {
			this.left = left;
		}
		/**
		 * @return the right
		 */
		public GenericBinaryTreeNode getRight() {
			return right;
		}
		/**
		 * @param right the right to set
		 */
		public void setRight(GenericBinaryTreeNode right) {
			this.right = right;
		}


	}
	
	private GenericBinaryTreeNode root = null;
	//private  int count = 0;
	//private int diameter;
	
	//Insert into the Tree
	public void insert(T data) {
		root = insert(root,data);
	}
	
	public GenericBinaryTreeNode getRootNode() {
		return root;
	}
	
	public GenericBinaryTreeNode insert(GenericBinaryTreeNode root,T data) {
		if(null == root) {
			return new  GenericBinaryTreeNode(data);
			
		}
		else {
				int compare = data.compareTo(root.getData());
			if(compare < 0) {
				root.setLeft(insert(root.getLeft(), data));
			}
			else {
				root.setRight(insert(root.getRight(), data));
			}
		}
		return root;
	}
	
	
	
	//PreOrder Traversal
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(GenericBinaryTreeNode root) {
		if(null != root) {
		
			System.out.print(" " +root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
		
	}
	
	//InOrder Traversal
	public void inOrder() {
		inOrder(root);
	}
	
	private  void inOrder(GenericBinaryTreeNode root) {
	if(null == root) {
			return;
		}
		else { 
			inOrder(root.getLeft());
			System.out.print(" "+root.getData());
			inOrder(root.getRight());
		}	
	}
	
	//PostOrder Traversal
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(GenericBinaryTreeNode root) {
		if(null == root) {
			return;
		}
		else {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(" " +root.getData());
		}
		
	}
	
	//Delete a Node from the Tree
	public void  delete(T data) {
		
		root = delete(root, data);
	}
	
	
	public GenericBinaryTreeNode delete(GenericBinaryTreeNode root,T data) {
		GenericBinaryTreeNode temp;
		if(null == root) {
			System.out.println("Element Not Found");
		}
		else if(data.compareTo(root.getData()) < 0) {
			root.setLeft(delete(root.getLeft(), data));
		}
		else if(data.compareTo(root.getData()) > 0) {
			root.setRight(delete(root.getRight(), data));
		}
		else {
			if(root.getLeft() != null && root.getRight() != null) {
				temp = findMax(root.getLeft()); 
				
				root.setData(temp.getData());
				
				root.setLeft(delete(root.getLeft(), root.getData()));
			}
			else {
				temp = root;
				
				 if(root.getLeft() != null) {
					root = root.getLeft();
				}
				 else if(root.getRight() != null) {
					root = root.getRight();
				}
				 else {
					 root = null;
				 }
					 
				temp = null;
			}
		}
		
		return root;	
	}
	
	//Find the Maximum Value in the Tree
	private GenericBinaryTreeNode findMax(GenericBinaryTreeNode root) {
		GenericBinaryTreeNode temp = root;
		while(temp.getRight() != null) {
			temp = temp.getRight();
	}
		return temp;
   }
	
	//Find the Maximum Value in the Tree
		private GenericBinaryTreeNode findMin(GenericBinaryTreeNode root) {
			GenericBinaryTreeNode temp = root;
			while(temp.getLeft() != null) {
				temp = temp.getLeft();
		}
			return temp;
	   }
	
	// Find Max Value using Recursion 
	public GenericBinaryTreeNode findMaxRec(GenericBinaryTreeNode root) {
		if(null == root){
			return root;
		}
		else if(null == root.getRight()) {
			return root;
		}
		else {
			return findMaxRec(root.getRight());
		}
		
	}
	
	
	
}
