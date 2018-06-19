package com.basicalgorithms.main;

import java.util.Scanner;

public class AppStringProject {

	public static void main(String[] args) {

		String sentence1 = "The String class represents character strings. "
				+ "All string literals in Java programs, such as \"abc\", "
				+ "are implemented as instances of this class.";
		String sentence2 = "Hi this is a test to copareTo method";
		String sentence3 = "Hello. World. this. is. a. test.  ";
		String sentence4 = "World";
		
		System.out.println("The string size is: "+sentence1.length());
		System.out.println("The fourth character of the sentence is: "+sentence1.charAt(4));
		
		if(sentence1.compareTo(sentence2)==0)
		{
			System.out.println("they're equals");
		}
		else
		{
			System.out.println("They're not equals");
		}
		
		System.out.println(sentence3.concat(sentence4));
		
		if(sentence3.contains("He"))
			System.out.println("Sentence 3 contains the word.");
		else
			System.out.println("Sentence 3 doesn't contain the word");
		
		String[] sentenceTest = new String[50];
		sentenceTest = sentence3.split("\\.");
		System.out.println(sentenceTest.length);
		
		System.out.println("The sentence start with:"+sentence4.startsWith("W"));
		
		System.out.println(sentence4.subSequence(0, 3));
		System.out.println(sentence4.substring(0, 4));
		
		System.out.println("Upper case:"+sentence4.toUpperCase());
		System.out.println("Lower case:"+sentence4.toLowerCase());
		
		String sentence5 = "    	Hi world, I'll be one of the best.";
		System.out.println("Sentence trim: "+sentence5.trim());
		
		String sentence6 = "false";
		String test = "".valueOf(120.2);
		System.out.println(sentence6.valueOf(true));
		System.out.println(test);	
		}

}
