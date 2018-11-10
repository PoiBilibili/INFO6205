package edu.neu.coe.info6205.symbolTable;

public class Driver {
	public static void main(String[] args) {
		for(int n = 100; n<1000; n+=10) {
			BSTDeletion exp = new BSTDeletion(n,1000,1000000);
			System.out.println(n+"  " +exp.runExp() + " " + Math.log((double)n)/Math.log((double)2) + " " + Math.sqrt(n));
		}
	}

}
