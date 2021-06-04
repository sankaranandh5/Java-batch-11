package com.san.test;

import java.util.HashSet;
import java.util.Scanner;

import com.san.entities.Candidate;
import com.san.entities.Company;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		HashSet<Candidate> h = new HashSet<Candidate>();

		System.out.println("Do you want to enter candidates? type y/n:");
		boolean y = scn.hasNextBoolean();
		if (y == true) {
			System.out.println("Enter candidate Id, Name, age, city");
			h.add(new Candidate(scn.nextInt(), scn.next(), scn.nextInt(), scn.next()));
		} else {
			System.out.println("Thanks!");
		}

		Company cn = new Company();

		System.out.println("Following are candidates:");

		for (Candidate c : h) {
			if (c.getAge() <= cn.getAge()) {
				System.out.println(c.getName() + " " + c.getCity());
			}

		}
	}
}
