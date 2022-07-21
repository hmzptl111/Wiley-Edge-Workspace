package com.main;

import java.util.Scanner;

import com.bst.BinarySearchTree;
import com.bst.BinarySearchTree.Node;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		
		while(true) {
			System.out.println("1. Inorder traversal of binary search tree");
			System.out.println("2. Preorder traversal of binary search tree");
			System.out.println("3. Postorder traversal of binary search tree");
			System.out.println("4. Maximum element from binary search tree");
			System.out.println("5. Minimum element from binary search tree");
			System.out.println("6. Add element to binary search tree");
			System.out.println("7. Remove element from binary search tree");
			System.out.println("8. Number of leaf nodes");
			System.out.println("9. Number of internal nodes");
			System.out.println("10. Height of binary search tree");
			System.out.println("Any other key to exit");
			
			switch(sc.nextInt()) {
				case 1:
					bst.inorderTraversal();
					break;
				case 2:
					bst.preorderTraversal();
					break;
				case 3:
					bst.postorderTraversal();
					break;
				case 4:
					Node max = bst.max();
					System.out.println(max.getKey());
					break;
				case 5:
					Node min = bst.min();
					System.out.println(min.getKey());
					break;
				case 6:
					System.out.println("Element: ");
					bst.insert(sc.nextInt());
					break;
				case 7:
					System.out.println("Element: ");
					bst.remove(sc.nextInt());
					break;
				case 8:
					int leafNodes = bst.countLeaves();
					System.out.println("There are " + leafNodes + " leaf nodes in the binary search tree");
					break;
				case 9:
					int internalNodes = bst.countInternalNodes();
					System.out.println("There are " + internalNodes + " internal nodes in the binary search tree");
					break;
				case 10:
					int height = bst.getHeight();
					System.out.println("Height of the binary search tree is " + height);
					break;
				default:
					System.out.println("xxx BINARY SEARCH TREE xxx");
					System.exit(0);
			}
		}
	}
}