package edu.neu.coe.info6205.symbolTable;

import java.util.*;

public class BSTDeletion {
	public static void main(String[] args) {
		int n = 10;
		BSTSimple<Integer, Integer> bst = generateBST(n);
		System.out.println(bst);
	}
	
	private static BSTSimple<Integer, Integer> generateBST(int n){
		BSTSimple<Integer, Integer> bst = new BSTSimple<>();
		Random random = new Random();
		while(bst.size()<n) {
			int key = random.nextInt(1000);
			int val = random.nextInt(1000)+1000;
			bst.put(key, val);
			System.out.println(" "+key+"-"+val+" " + "size:"+bst.size());
		}
		return bst;
	}
}
