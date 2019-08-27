package com.marcinkulik.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

	private char delimiter = ' ';
	private List<Integer> listOfNegativesIntegers;	

	public int add(String string) {
		if (string == "")
			return 0;
		if (string.startsWith("//")) {
				delimiter = string.charAt(2);
				string = string.substring(4);
		}
		if (string.contains(",") || string.contains("\n") || delimiter != ' ') {
			return separateNumbersAndSumThem(string);
		} else {
			int stringToInt = Integer.parseInt(string);
			return stringToInt;
		}
	}
	
	private int separateNumbersAndSumThem(String string) {
		List<String> listOfNumbers;

		if (delimiter == ' ')
			listOfNumbers = Stream.of(string.split("(,|\n)", -1)).collect(Collectors.toList());
		else {
			listOfNumbers = Stream.of(string.split(String.format("(,|\n|\\%s)", delimiter), -1))
					.collect(Collectors.toList());
		}
		List<Integer> intList = listOfNumbers.stream().map(Integer::valueOf).collect(Collectors.toList());
		
		if(returnsTrueIfNoNegativeNumbersProvided(intList)==false) {
			String negativeNumbersString = listOfNegativesIntegers.stream().map(Object::toString).collect(Collectors.joining(","));
			throw new IllegalArgumentException("negatives not allowed : " + negativeNumbersString);
		}
			
		int sum = intList.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}
	
	private boolean returnsTrueIfNoNegativeNumbersProvided(List<Integer> list) {
		addNegativeNumbersIntoList(list);
		return listOfNegativesIntegers.isEmpty();
	}
	
	private void addNegativeNumbersIntoList(List<Integer> list) {
		listOfNegativesIntegers = new ArrayList<>();
		for (int number : list)
			if(number < 0) {
				listOfNegativesIntegers.add(number);
			}
	}
}
