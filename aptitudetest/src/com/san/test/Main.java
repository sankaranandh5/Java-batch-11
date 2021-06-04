package com.san.test;

public class Main {
	public static void main(String[] args) {
		String[][] str = { { "how are you?", "where are you from?", "when you born?" }, { "good", "chennai", "1994" },
				{ "notgood", "Bangalore", "2000" } };
		/*
		 * for(String[] s:str) { System.out.println(s.toString()); for(String t:s) {
		 * System.out.println(t+""); } }
		 */
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (i == 0) {
					System.out.println(str[i][j]);
					if(i==j) {
						System.out.println(str[j][i]);
					}
				}
			}
		}
	}
}
