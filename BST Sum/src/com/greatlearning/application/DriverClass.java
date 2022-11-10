package com.greatlearning.application;

import com.greatlearning.modal.BinarySearchTree;
import com.greatlearning.modal.Node;

public class DriverClass {

	public static void main(String[] args) {

		Node root = null;
		BinarySearchTree findSumPair = new BinarySearchTree();
		root = findSumPair.insert(root, 40);
		root = findSumPair.insert(root, 20);
		root = findSumPair.insert(root, 60);
		root = findSumPair.insert(root, 10);
		root = findSumPair.insert(root, 30);
		root = findSumPair.insert(root, 50);
		root = findSumPair.insert(root, 70);
		int sum = 130;
		findSumPair.findPairWithGivenSum(root, sum);
	}

}
