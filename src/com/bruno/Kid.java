package com.bruno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kid extends GeneralAvailability {

	String name;

	public Kid(String name, ArrayList<Integer> avList) {

		super("kid");
		this.name = name;

		setAvailability(avList);

		System.out.print("dziecko " + name + ": ");
		printAvailability();
	}

	private void setAvailability(ArrayList<Integer> avalsList) {

		for(int minute : avalsList) {
			state[minute] = "FREE";
		}
	}



}
