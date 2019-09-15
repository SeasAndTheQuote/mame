package com.bruno;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kid {

	final static int howLong = 125;
	final static int beginningHour = 700;
	String name;
	List<Integer> availabilityList;

	//0 - first possible moment of classes start
	Availability[] state = new Availability[howLong];

	public Kid(String name) {

		this.name = name;

		for (int i = 0; i < state.length; i++) {
			state[i] = Availability.FREE;
		}

		System.out.println(Arrays.toString(state));

		for(int i = 0; i < state.length; i++) {
			int temp = beginningHour + ((5*i)%60) + ((5*i)/60)*100; //calculating the actual hour
			System.out.println(temp + " - " + state[i]);
		}

		availabilityList = calculateStartingHours();
	}

	public List<Integer> calculateStartingHours() {

		List<Integer> startingMinute = new ArrayList<>();
		startingMinute.add(6);
		startingMinute.add(7);


		return startingMinute;
	}


}
