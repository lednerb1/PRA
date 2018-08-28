package main;


import java.security.SecureRandom;
import java.util.Iterator;
//import java.util.TreeSet;

import core.BinaryTree;

public class Main2 {

	public static void main(String[] args) {
		BinaryTree<Integer> bt = new BinaryTree<Integer>();
	    int max=90000;
	    int min=1;
		SecureRandom random = new SecureRandom();
		for (int i = 0; i <= 30000; i++) {
		    Integer value = Integer.valueOf(random.nextInt(max-min+1)+min);
			bt.add(value);
		}
        
		for (Iterator<Integer> iterator = bt.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println("Numero de elementos gerados <" + bt.size() + ">");

	}

}
