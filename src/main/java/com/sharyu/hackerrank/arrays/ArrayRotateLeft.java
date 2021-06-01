package com.sharyu.hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotateLeft {

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		List<Integer> ordered1 = new ArrayList<Integer>();
		for (int i = 0; i < d; i++) { //
			List<Integer> ordered = new ArrayList<Integer>();
			if (i == 0) {
				ordered1 = rotateLeftbyOne(a); // i=0, 23451
			} else {
				ordered = rotateLeftbyOne(ordered1);
				ordered1 = ordered; // i= 1, 34512
				// i = 2, 45123
				// i =3, 51234
			}

		}
		return ordered1;
	}

	public static List<Integer> rotateLeftbyOne(List<Integer> a) {
		List<Integer> ordered = new ArrayList<Integer>();
		int first;
		first = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			ordered.add(a.get(i));
		}
		ordered.add(first);
		return ordered;
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		List<Integer> result = rotLeft(a, 4);
		System.out.println(result);
	}
}
