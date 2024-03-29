package com.collections;

import java.util.Hashtable;

public class Pair<A, B> extends Hashtable {
	final private A first;
	final private B second;

	public Pair(A first, B second) {
		super();
		this.first = first;
		this.second = second;
	}

	public String toString()
	{
		return "(" + first + ", " + second + ")";
	}

	public A getFirst() {
		return first;
	}

	public B getSecond() {
		return second;
	}



}
