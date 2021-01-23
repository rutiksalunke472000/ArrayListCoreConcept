package com.csi.conceptjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Satarday");
		al.add("sunday");
		
       
		
		
		// al.add(0, null);
		// al.addAll(al);
		// al.clear();

		ArrayList<String> sl = new ArrayList<>();

		sl = (ArrayList<String>) al.clone(); // how to use?

		System.out.println(sl);

		// System.out.println(al.get(3));

		System.out.println("\n Size of Program : " + al.size());

		al.set(2, "sunday");

		// al.forEach(System.out::println);

		// al.forEach(Days->System.out.println(Days));

		for (String days1 : al) {
			System.out.println(days1);
		}

	}

}
