package main;

import java.util.Iterator;
import java.util.Random;

import core.BinaryTree;

public class Main {

	public static void main(String[] args) {
		BinaryTree<Integer> bt = new BinaryTree();
		Random rand = new Random();
		for (int i = 30000; i >= -30000; i--) {
			bt.add(i);
		}

		for (Iterator iterator = bt.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

	}

}
