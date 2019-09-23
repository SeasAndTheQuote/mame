package com.bruno;

import java.util.ArrayList;

public class MyPlan extends GeneralAvailability {

	public MyPlan() {

		super("teacher");

	}

	public boolean checkAvailability(int classesStartDay, int classesStartMinute, String kidName) {

		for (int i = classesStartMinute; i < classesStartMinute + 12; i++) {
			if(!state[classesStartDay][classesStartMinute].equals("FREE")) {
				return false;
			}
		}

		addClasses(classesStartMinute, classesStartDay, kidName);
		return true;

	}

	public void addClasses(int newClassStartMinute, int newClassStartDay, String name) {

		for (int i = newClassStartMinute; i < newClassStartMinute + 12; i++)
			state[newClassStartDay][i] = name;

		System.out.print("moj plan: ");
		printAvailability();
	}

}
