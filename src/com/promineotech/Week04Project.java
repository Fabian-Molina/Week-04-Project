package com.promineotech;

public class Week04Project {

	public static void main(String[] args) {
		// Prompt 1: Array of ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// This sets our sum value to a default of 0
		int sum = 0;
		
		// Here we iterate through the array up to the final number while adding all of the elements together
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		
		// We set a variable named "sum" that equals the total sum of our array, and now we divide that total by the length to get the average
		double average = sum / ages.length;
		
		System.out.println("Average age: " + average);
		
		// This is a check to ensure the array is at least 2 integers in length
		if (ages.length >= 2) {
			// This stores the value of the first number subtracted from the last number in the array
			int result = ages[ages.length - 1] - ages[0];
			
			
			// This will print the variable of result with the stored value: 93 - 3 = 90
			System.out.println("Ages subtraction: " + result);
		}
		// Our second Array has a total of 9 elements 
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 103};
		
		// We've done the same thing to show that it can be reproduced no matter the length of an array
		int sum2 = 0;
		
		// Again we iterate through the array and add the elements together to store them in a variable
		for (int i = 0; i < ages2.length; i++) {
			sum2 += ages2[i];
		}
		
		// Divide the sum of the elements by the length of the array for our average
		double average2 = sum2 / ages2.length;
		
		System.out.println("Ages2 average: " + average2);
		
		// We repeat the process by checking if the length of the array is at least 2 integers in length
		if (ages2.length >= 2) {
			
			// We subtract the first number in the array from the last number and store it in a new variable
			int result2 = ages2[ages2.length - 1] - ages2[0];
			
			
			// Then we print the result
			System.out.println("Ages2 subtraction: " + result2);
		}
		
		
		System.out.println("------------------------");
		// Prompt 2:
			
		
		// We set a String array containing the given names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// A default total value of 0
		int total = 0;
		
		// This is where we iterate through the array and sum the character total
		for (int i = 0; i < names.length; i++) {
			total += names[i].length();
		}
		
		// After setting the total to a variable, we print the total by the array length to get our average
		System.out.println("The average letters per name: " + total / names.length);
		
		// We set a String variable to use for our concatenation
		String namesCombined = "";
		
		// This loops iterates through the array and then uses our variable to store the names while adding a space between the each one
		for (int i = 0; i < names.length; i++) {
			namesCombined += names[i] + " ";
		}
		
		// This prints our result of each name
		System.out.println("Concatenated names: " + namesCombined);
		
		// This is how we access the first element of an array
		System.out.println("First element: " + names[0]);
		
		
		// We have to take the total length of the array and subtract 1 from it because arrays are counted starting from 0 so we'll get an error if we don't subtract one
		System.out.println("Last element: " + names[names.length - 1]);
		
		
		System.out.println("------------------------");
		
		// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		// Creating a new integer array and setting it's length equal to the length of our names array
		int[] nameLengths = new int[names.length];
		
		// This iterates through the names array and adds the total length of each name to our new array
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		// We create a new total called "nameSum" and set it's value to 0. This will allow us to add the stored values together into a new variable
		int nameSum = 0;
		
		// Our loop iterates through the array and sums the character total then stores it in the variable we set previously
		for (int i = 0; i < nameLengths.length; i++) {
			nameSum += nameLengths[i];
		}
		
		// Now we print the result
		System.out.println("The total sum is: " + nameSum);
		
		System.out.println("------------------------");
		
		// Give our selected word "Hello" and the value it should be repeated "3"
		String printWord = printWord("Hello", 3);
		
		// Then we print our word and it is concatenated that n amount of times when our method is told to return a value
		System.out.println("Repeated Word: " + printWord);
		
		System.out.println("------------------------");
		
		// This is where we give our name values to the method we created and have it print the full name when our method returns a value
		String fullName = fullName("John", "Doe");
		System.out.println("Full Name: " + fullName);
		
		System.out.println("------------------------");
		
		// Our first array that we know is over 100 to show our method works as intended
		int[] numbers = {50, 50, 50};
		
		// Our second array to show that if it our total is not greater than 100 it will return false
		int[] numbers2 = {10, 10, 10};
		
		// This is our total that the array sum must be greater than
		int greaterThan = 100;
		
		// A line of code that calls our method using the first array of integers
		boolean intArrayGreaterThan = intArray(numbers, greaterThan);
		
		// This calls our method with the second array of integers
		boolean intArrayGreaterThan2 = intArray(numbers2, greaterThan);
		
		// We print out a message and the result of our for loop + the return value of our method, in this case it will return true
		System.out.println("Is our sum greater than " + greaterThan + ": " + intArrayGreaterThan);
		
		// We print out a message again but with our second set of integers and this will return false
		System.out.println("Is our sum greater than " + greaterThan + ": " + intArrayGreaterThan2);
		
		System.out.println("------------------------");
		
		// This is our array of double
		double[] decimalNumbers = {2.3, 3.5, 4.7, 5.3};
		
		// Here we call our method and set the values we need such as our array name and the size that we will be dividing by
		double totalDouble = calculateAverage(decimalNumbers, decimalNumbers.length);
		
		// We print a message and the average to the console
		System.out.println("Our average is: " + totalDouble);
		
		
		System.out.println("------------------------");
		
		// Our first array of double where the average equals: 2.825
		double[] doubleArray1 = {1.2, 3.5, 4.4, 2.2};
		
		// Our second array of double where the average equals: 3.625
		double[] doubleArray2 = {2.5, 5.5, 2.1, 4.4};
		
		// Our method call that sets our first array and second array as the values that are used
		boolean isAverageGreater = isAverageGreaterThan(doubleArray1, doubleArray2);
		
		// Prints our method result to the console, in this case it prints false as our second array average is greater than our first
		System.out.println("Is the average of array 1 greater than array 2: " + isAverageGreater);
		
		// Our third set of double where the average equals: 5.425
		double[] doubleArray3 = {6.5, 7.3, 2.4, 5.5};
		
		// Our fourth set of double where the average equals: 2.1
		double[] doubleArray4 = {1.4, 2.3, 1.5, 3.2};
		
		// Calling our method again only this time we use the other 2 arrays to show a true result
		boolean isAverageGreater2 = isAverageGreaterThan(doubleArray3, doubleArray4);
		
		// Prints our method result which is true in this use case
		System.out.println("Is the average of array 3 greater than array 4: " + isAverageGreater2);
		
		System.out.println("------------------------");
		
		// Our first value on whether it is hot or not
		boolean isHot = true;
		
		// The value of how much money we have in our pocket
		double moneyInPocket = 10.50;
		
		// Our method call
		boolean buyDrink = willBuyDrink(isHot, moneyInPocket);
		
		// Prints the result of our method
		System.out.println("Should we buy a drink: " + buyDrink);
		
		// Our second value on whether it is hot
		boolean isHot2 = false;
		
		// Our value of money in pocket to show that both must be true to get a true result
		double moneyInPocket2 = 10.50;
		
		// Our method call which ends up being false
		boolean buyDrink2 = willBuyDrink(isHot2, moneyInPocket2);
		
		// Printing our result which is false in this case as our values are not both true
		System.out.println("Should we buy a drink: " + buyDrink2);
		
		System.out.println("------------------------");
		
		
		// Our original word
		String word = "Computer";
		
		// Our method call using the string stored in our variable of word
		String reverse = reverseString(word);
		
		// Prints both the original word and the reversed version in the console
		System.out.println("Original word: " + word + " - Reversed word: " + reverse);
		
		
	}
	
	// This is our method named printWord that takes in a String value of word and an integer value of n
	public static String printWord(String word, int n) {
		
		// This is a variable set to an empty string so that we have a variable to store our concatenated string
		String result = "";
		
		// A for loop that adds our word to our variable and it will repeat until it has done so up to n number of times
		for (int i = 0; i < n; i++) {
			result += word;			
		}
		// We return our variable result since that is where our concatenated word is stored
		return result;
	}
	
	// This is our method for a fullName that accepts 2 names and concatenates them into a full name
	public static String fullName(String firstName, String lastName) {
		
		// This will concatenate the first and last names with a space in the middle
		return firstName + " " + lastName;
	}
	
	public static boolean intArray(int[] intArray, int greaterThan) {		
		// Set our sum to 0 so it is able to add our elements together and store their total in a variable
		int sum = 0;
		
		// An enhanced for loop that sums together our array
		for (int num : intArray) {
			sum += num;			
		}
		
		// Our return function that returns true if sum is greater than our given number and false if it is not
		return sum > greaterThan;
	}
	
	// The method to calculate the average of our double array
	public static double calculateAverage(double[] doubleArray, int size) {
		// Set our sum to 0 and make sure it's a value of double and not integer, otherwise the program won't be able to give us the correct value
		double sum = 0;
		
		// A for loop to sum the total of our array and store the value in the variable "sum"
		for (int i = 0; i < size; i++) {
			sum += doubleArray[i];
		}
		// We create another variable that takes our sum and divides it by the length of our array
		double average = sum / size;
		
		// Here we return the value of average
		return average;
	}
	
	// Our method that returns true if our first array average is greater than our second
	public static boolean isAverageGreaterThan(double[] doubleArray1, double[] doubleArray2) {
		// The sum of our first array in the method set to 0 for use in our for loop
		double sum1 = 0;
		
		// The sum of our second array in the method set to 0 for use in our for loop
		double sum2 = 0;
		
		// Our for loop that sums each array and uses a logical AND operator to ensure the comparison is not effected by differing array lengths
		for (int i = 0; i < doubleArray1.length && i < doubleArray2.length; i++) {
			sum1 += doubleArray1[i];
			sum2 += doubleArray2[i];
		}
		
		// Our first average from the first array 
		double average = sum1 / doubleArray1.length;
		
		// Our second average from the second array
		double average2 = sum2 / doubleArray2.length;
		
		
		// If our first sum is greater than the second
		return average > average2;		
	}
	
	// This is the method that checks our values and returns true or false 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		// Returns true if both of our values are equal to true and false if neither or only one is equal to true
		return isHotOutside && moneyInPocket >= 10.50;
			
	}
	
	// This is a method for reversing a string which I thought would be easier than it ended up being, but I learned some new things out of it
	public static String reverseString(String word) {
		
		// We set a simple variable for a character, and we set a string variable with an empty value
		char ch;
		String reverseWord = "";
		
		// Our for loop iterates through our given word and takes each character at the index of i, which then takes that character and extracts it from the original string
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			// After extracting each character we add them to our reverseWord string
			reverseWord = ch + reverseWord; 
		}
		// When we return the value it should now be our original word in reverse
		return reverseWord;
	}
	
}
