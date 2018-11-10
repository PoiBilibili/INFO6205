package edu.neu.coe.info6205.symbolTable;

import java.util.*;

public class BSTDeletion {
	private int N = 100; //initial number of keys;
	private int M = 200; //range of key values;
	private int X = 10000; //number of insertions/deletions;
	
	private void initialize(BSTSimple<Integer, Integer> bst, int size) {
		Random random = new Random();
		while(bst.size()<size) {
			int key = random.nextInt(M);
			int value = random.nextInt(100);
			bst.put(key, value);
		}
	}
	
	private void putEle(BSTSimple<Integer, Integer> bst) {
		Random random = new Random();
		int key = random.nextInt(M);
		int value = random.nextInt(100);
		bst.put(key, value);
	}
	
	private void delEle(BSTSimple<Integer, Integer> bst) {
		Random random = new Random();
		int key = random.nextInt(M);
		bst.delete(key);
	}
	
	public static void main(String[] args) {
		BSTDeletion exp = new BSTDeletion();
		BSTSimple<Integer, Integer> bst = new BSTSimple<Integer, Integer>();
		exp.initialize(bst, exp.N);
		int x = exp.X;
		while(x>0) {
			exp.putEle(bst);
			exp.delEle(bst);
			x--;
		}
		System.out.println(bst.height());
	}
}
