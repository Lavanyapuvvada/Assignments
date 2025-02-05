package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;

public class Assignment7 {

	public static void main(String[] args) {
		
		HashMap<String, String> ageMap = new HashMap<>();
		ageMap.put("Transactions", "Amount");
		
		ArrayList<Integer> storage = new ArrayList<Integer>();
		storage.add(50000);
		storage.add(-2000);
		storage.add(3000);
		storage.add(-15000);
		storage.add(-200);
		storage.add(-300);
		storage.add(4000);
		storage.add(-3000);
	System.out.println("total number of credit and debit transactions completed"+ storage.size());

	}

}
