package com.san.entities;

public class Restaurant {
	public Menu menu;

	public Restaurant(Menu menu) {
		super();
		this.menu = menu;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void order(Item[] i) {
		Item[] j = i;
		System.out.println("Thanks for ordering!\n");
		System.out.println("Order details");
		System.out.println("---------------------");
		for (Item k : j) {
			System.out.println(k.toString());
		}
	}
}
