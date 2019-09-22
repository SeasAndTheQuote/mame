package com.bruno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MyPlan myPlan = new MyPlan();
/*
		Kid first = new Kid("Jim",  new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16)));
		Kid second = new Kid("Pam",  new ArrayList<>(Arrays.asList(21, 22, 23, 24)));
*/
		List<Kid> kids = new ArrayList<>();
		/*kids.add(first);
		kids.add(second);*/

		// TODO add external input of kids' availability

		for(Kid pupil : kids) {
			System.out.println(pupil.name);

			for (int i = 0; i < pupil.startingMinutesList.size(); i++){
				pupil.startingMinutesList.key

			}

			pupil.startingMinutesList.forEach(
					(day, minute) -> { 
						if(myPlan.checkAvailability(day, minute, pupil.name))
							break;

					});

		}

	}
}
