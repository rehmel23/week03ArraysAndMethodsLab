package week03Arrays;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("Question 1");
		int[] nums = {1, 5, 2, 8, 13, 6};
		System.out.println("Initialize array nums");
		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2");
		System.out.println(nums[0]);
		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3");
		System.out.println(nums[nums.length - 1]);
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4");
		//System.out.println(nums[6]);
		System.out.println("It throws an exception.");
		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("\nQuestion 5");
		//System.out.println(nums[-1]);
		System.out.println("This also throws an exception.");
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7");
		for (int num : nums) {
			System.out.println(num);
		}
		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum
		System.out.println("\nQuestion 8");
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);
		// 9. Create a new variable called average and assign the average value of the
		// array to it
		System.out.println("\nQuestion 9");
		int average = sum / nums.length;
		System.out.println(average);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		System.out.println("\nQuestion 10");
		for (int num : nums) {
			if(num % 2 == 1) {
				System.out.println(num);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		String[] people = {"Sam", "Sally", "Thomas", "Robert"};

		// 12. Calculate the sum of all the letters in the new array
		System.out.println("Question 12");
		int nameSum = 0;
		for (String name : people) {
			nameSum += name.length();
		}
		System.out.println(nameSum);
		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.
		System.out.println("\nQuestion 13");
		greeting("Clay");
		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.
		System.out.println("\nQuestion 14");
		System.out.println(returnGreeting("Casandra"));
		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?
		
		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int
		System.out.println("\nQuestion 15");
		boolean check = stringLongerThanInt("Amia", 3);
		System.out.println(check);
		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		System.out.println("\nQuestion 16");
		String name = "Clay";
		boolean contains = stringInArray(people, name);
		System.out.println(contains);
		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array
		System.out.println("\nQuestion 17");
		int smallest = smallestNumber(nums);
		System.out.println(smallest);
		// 18. Write and test a method that takes an array of double and
		// returns the average
		System.out.println("\nQuestion 18");
		double[] doubleArray = {1.2, 1.45, 2.0, 3.3};
		double averageDouble = findAverage(doubleArray);
		System.out.println(averageDouble);
		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position
		System.out.println("\nQuestion 19");
		int[] nameLengths = stringLengths(people);
		for (int lengths : nameLengths) {
			System.out.println(lengths);
		}
		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.
		System.out.println("\nQuestion 20");
		System.out.println(isEvenStringsGreater(people));
		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome
		System.out.println("\nQuestion 21");
		System.out.println(isWordPalindrome("racecar"));
	}

	// Method 13:
	public static void greeting(String name) {
		System.out.println("Hello, " + name + "!");
	}
	// Method 14:
	public static String returnGreeting(String name) {
		String greeting = "Hello, " + name + "!";
		return greeting;
	}
	// Method 15:
	public static boolean stringLongerThanInt(String word, int num) {
		if(word.length() > num) {
			return true;
		} else {
			return false;
		}
	}
	// Method 16:
	public static boolean stringInArray(String[] strings, String word) {
		boolean check = false;
		for (String string : strings) {
			if(string.equals(word)) {
				check = true;
			}
		}
		return check;
	}
	// Method 17:
	public static int smallestNumber(int[] nums) {
		int smallest = nums[0];
		for (int num : nums) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}
	// Method 18:
	public static double findAverage(double[] nums) {
		double sum = 0;
		for (double num : nums) {
			sum += num;
		}
		return sum / nums.length;
	}
	// Method 19:
	public static int[] stringLengths(String[] strings) {
		int[] lengths = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			lengths[i] = strings[i].length();
		}
		return lengths;
	}
	// Method 20:
	public static boolean isEvenStringsGreater(String[] strings) {
		int evenSum = 0;
		int oddSum = 0;
		for (String string : strings) {
			if(string.length() % 2 == 0) {
				evenSum += string.length();
			} else {
				oddSum += string.length();
			}
		}
		return evenSum > oddSum;
	}
	// Method 21:
	public static boolean isWordPalindrome(String word) {
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)){
				return false;
			}
		}
		return true;
	}
}
