package com.bruno;

import com.collections.Pair;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		MyPlan myPlan = new MyPlan();
/*
		Kid first = new Kid("Jim",  new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16)));
		Kid second = new Kid("Pam",  new ArrayList<>(Arrays.asList(21, 22, 23, 24)));
*/
		List<Kid> kids = new ArrayList<>();

		Pair<Integer, Integer> test = new Pair<>(1, 2);

		Hashtable<Integer, Integer> foo = new Hashtable<>();
		foo.put(1, 6);
		test.put(1, 5);
		/*kids.add(first);
		kids.add(second);*/

		// TODO add external input of kids' availability


		for(Kid pupil : kids) {
			System.out.println(pupil.name);

			test.forEach((date, time) -> {

			});

			pupil.startingMinutesList.forEach(
					(day, minute) -> {
						if(myPlan.checkAvailability(day, minute, pupil.name))
							break;

					});

		}

	}
}
