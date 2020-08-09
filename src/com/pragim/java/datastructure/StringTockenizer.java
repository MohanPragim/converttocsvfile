package com.pragim.java.datastructure;

import java.util.StringTokenizer;

public class StringTockenizer {

	public static void main(String[] args) {

		StringTokenizer str = new StringTokenizer("Welcome mohan kumar", "e");

		while (str.hasMoreTokens()) {

			System.out.println(str.nextToken());
		}
	}
}
