package com.bruno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Kid extends GeneralAvailability {

	String name;

	Hashtable<Integer, Integer> startingMinutesList;
	//constructor takes name of the kid and Hashtable of [day in the week][minute of possible start of the classes]
	public Kid(String name, Hashtable<Integer, Integer> avList) {

		super("kid");
		this.name = name;
		startingMinutesList = avList;

		System.out.print("dziecko " + name + ": ");
		printAvailability();
	}


}
