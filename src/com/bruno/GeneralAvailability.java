package com.bruno;

public class GeneralAvailability {

	final static int howLong = 125;
	final static int beginningHour = 700;

	//0 - first possible moment of classes start
	String[][] state = new String[5][howLong];

	public GeneralAvailability(String who) {

		if(who.equals("kid"))
			for (int k = 0; k < 5; k++)
				for(int i = 0; i < state.length; i++) state[k][i] = "BUSY"; //initialise availability array
		else
			for (int k = 0; k < 5; k++)
				for (int i = 0; i < state.length; i++) state[k][i] = "FREE"; //initialise availability array
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
