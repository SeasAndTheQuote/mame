package com.bruno;

public class GeneralAvailability {

	final static int howLong = 125;
	final static int beginningHour = 700;

	//0 - first possible moment of classes start
	String[] state = new String[howLong];

	public GeneralAvailability(String who) {

		if(who.equals("kid"))
			for (int i = 0; i < state.length; i++) state[i] = "BUSY"; //initialise availability array
		else
			for (int i = 0; i < state.length; i++) state[i] = "FREE"; //initialise availability array
	}

	protected void printAvailability() {

		for(int i = 0; i < state.length; i++) {
			int temp = beginningHour + ((5*i)%60) + ((5*i)/60)*100; //calculating the actual hour
			System.out.print(temp + " - " + state[i] + ", ");
		}
		System.out.println();
	}
}
