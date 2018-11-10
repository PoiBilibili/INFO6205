package edu.neu.coe.info6205.symbolTable;

import java.util.*;

public class BSTDeletion {
	private int N; //initial number of keys;
	private int M; //range of key values;
	private int X; //number of insertions/deletions;
	
	public BSTDeletion(int n, int m, int x) {
		this.N = n;
		this.M = m;
		this.X = x;
	}
	private void initialize(BSTSimple<Integer, Integer> bst, int size) {
		Random random = new Random();
		while(bst.size()<size) {
			int key = random.nextInt(M);
			bst.put(key, 1);
		}
	}
	
	public String runExp() {
		StringBuilder ret = new StringBuilder();
		BSTSimple<Integer, Integer> bst = new BSTSimple<Integer, Integer>();
		initialize(bst, N);
		ret.append(bst.averageHeight());
		int x = X;
		Random r = new Random();
		while(x>0) {
			Random random = new Random();
			boolean f = r.nextBoolean();
			if(f) bst.put(random.nextInt(M), 1);
			else bst.delete(random.nextInt(M));;
			x--;
		}
		ret.append(" " + bst.averageHeight());
		return ret.toString();
		
	}
}
