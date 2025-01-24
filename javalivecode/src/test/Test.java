package test;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	
	/*
	Smallest window in a String containing all characters of other String
	Given two strings, string and pattern, the task is to find the smallest substring in string containing all characters of pattern.

	Examples:

	Input: string = “this is a test string”, pattern = “tist”
	Output: “t stri”
	Explanation: “t stri” contains all the characters of pattern.
	Input: string = “geeksforgeeks”, pattern = “ork”
	Output: “ksfor”
	*/
	
	public static void main(String[] args) {
		
		String input = "this is a test string";
		char[] pattern = "tist".toCharArray();
		char[] inputArray = input.toCharArray();
		
		Set<String> output = new HashSet();
		
		for(int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < pattern.length; j++) {
				
				if(inputArray[i] == pattern[j]) {
					output.add(inputArray[i]+"");
				}
				
			}
		}
		
		System.out.println(output.toString());
	}
}
