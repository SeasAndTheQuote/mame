package com.bruno;

public class MyPlan {

	final static int howLong = 125;
	final static int beginningHour = 700;

	String[][] state = new String[5][howLong];

	public MyPlan() {

		for (int k = 0; k < 5; k++)
			for (int i = 0; i < state.length; i++) state[k][i] = "FREE"; //initialise availability array

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
	protected void printAvailability() {

		for (int k = 0; k < 5; k++){
			for (int i = 0; i < state.length; i++) {
				int temp = beginningHour + ((5*i)%60) + ((5*i)/60)*100; //calculating the actual hour
				System.out.print(temp + " - " + state[k][i] + ", ");
			}
		}
		System.out.println();
	}


}
