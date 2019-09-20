package com.bruno;

import java.util.ArrayList;

public class MyPlan extends GeneralAvailability {

	public MyPlan() {

		super("teacher");

	}

	public boolean checkAvailability(int classesStart, String kidName) {

		for (int i = classesStart; i < classesStart + 12; i++) {
			if(!state[classesStart].equals("FREE")) {
				return false;
			}
		}

		addClasses(classesStart, kidName);
		return true;

	}

	public void addClasses(int newClassStart, String name) {

		for (int i = newClassStart; i < newClassStart + 12; i++)
			state[i] = name;

		System.out.print("moj plan: ");
		printAvailability();
	}

}
