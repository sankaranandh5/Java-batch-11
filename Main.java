package com.san.test;

import java.util.Scanner;

import com.san.entities.Item;
import com.san.entities.Menu;
import com.san.entities.Restaurant;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);

		Item item1 = new Item(1, "Tea", 12f);
		Item item2 = new Item(2, "Coffee", 15f);
		Item item3 = new Item(3, "Dosa", 30f);

		Item[] i = new Item[3];
		i[0] = item1;
		i[1] = item2;
		i[2] = item3;

		Menu menu = new Menu(i);

		Restaurant restaurent = new Restaurant(menu);

		System.out.println("Welcome to our restaurent!");
		System.out.println("Here is our menu: ");
		for (Item j : menu.item) {
			System.out.println(j.toString());
		}

		System.out.println("Select items you would like to order");
		Item[] items = {item1, item3};
		restaurent.order(items);

	}
}
