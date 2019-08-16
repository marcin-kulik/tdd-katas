package com.marcinkulik.katas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringCalculator {

	public int add(String string) {
		if(string=="")
			return 0;
		else if(string.contains(",")) {
			return separateNumbersAndSumThem(string);
		}
		else {
			int stringToInt = Integer.parseInt(string);
			return stringToInt;
		}
		
	}
	
	private int separateNumbersAndSumThem(String string) {
		List<String> listOfNumbers = Stream.of(string.split(",", -1)).collect(Collectors.toList());
		List<Integer> intList = listOfNumbers.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
		int sum = intList.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

}
