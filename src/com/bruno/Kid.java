package com.bruno;

import com.collections.Pair;

public class Kid  {

	String name;
	Pair<Integer, Integer> startingMinutesList;

	//constructor takes name of the kid and Hashtable of [day in the week][minute of possible start of the classes]
	public Kid(String name, Pair<Integer, Integer> avList) {

		this.name = name;
		this.startingMinutesList = avList;

		System.out.print("dziecko " + name + ": ");
		printAvailabilities();
	}

	private void printAvailabilities() {

	}


}
