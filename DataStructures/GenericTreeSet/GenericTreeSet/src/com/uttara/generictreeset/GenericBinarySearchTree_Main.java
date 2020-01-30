/**
 * 
 */
package com.uttara.generictreeset;

/**
 * @author A
 *
 */
public class GenericBinarySearchTree_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericBinarySearchTree<String> binTree = new GenericBinarySearchTree<String>();
		 binTree.insert("Hammu");
		 binTree.insert("Bommu");
		 binTree.insert("Vimmu");
		 binTree.insert("Surf");
		 binTree.insert("Niru");
		 binTree.insert("Super");
		
		System.out.println("PreOrder Traversal ");
		binTree.preOrder();
		System.out.println();
		
		System.out.println("PostOrder Traversal ");
		binTree.postOrder();
		System.out.println();
		
		System.out.println("InOrder Traversal");
		binTree.inOrder();
		System.out.println();
		
		binTree.delete("Surf");
		System.out.println("InOrder Traversal after Deletion : ");
		binTree.inOrder();
		System.out.println();
		
		
		
		GenericBinarySearchTree<Integer> intgr_Tree = new GenericBinarySearchTree<Integer>();
		intgr_Tree.insert(50);
		intgr_Tree.insert(75);
		intgr_Tree.insert(25);
		intgr_Tree.insert(60);
		intgr_Tree.insert(70);
		intgr_Tree.insert(85);
		intgr_Tree.insert(20);
		
		System.out.println("PreOrder Traversal ");
		intgr_Tree.preOrder();
		System.out.println();
		
		System.out.println("PostOrder Traversal ");
		intgr_Tree.postOrder();
		System.out.println();
		
		System.out.println("InOrder Traversal");
		intgr_Tree.inOrder();
		System.out.println();

		
	}

}
