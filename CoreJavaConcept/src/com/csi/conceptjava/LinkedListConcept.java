package com.csi.conceptjava;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Mechanical");
		ll.add("Electrical");
		ll.add("Automobile");
		ll.add("Computer");
		ll.add("IT");
		ll.add("Chemical");
		ll.add("Genetic");
		ll.add("Electronics & Telecommunication");
		ll.add("Civil");

		System.out.println("\n Check The Courses:");
		Scanner sc = new Scanner(System.in);
		String brname = sc.next();

		if (ll.contains(brname)) {
			System.out.println("Course is available....");
		} else {
			ll.add(brname);
			System.out.println("Course Added Sucessfully");
			ll.forEach(branchname -> System.out.println(branchname));
		}

		//

	}

}
