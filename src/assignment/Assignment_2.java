package assignment;

import java.util.Scanner;

public class Assignment_2 {

	
	public static void main(String[] args) {
		
		
		
		
		
//		Problem 12
//		String Str = new String("Testing of the replaceAll function??");
//	      System.out.print("Return Value :" );
//	      System.out.println(Str.replaceAll(" ", ""));
//		
	//Problem 11
//	String word;
//	String guess;
//	
//		for (int index = word.indexOf(guess);
//			     index >= 0;
//			     index = word.indexOf(guess, index + 1))
//			{
//			    System.out.println(index);
//			}
//	}
		//Problem 10, this one does not go in a main method
//		Scanner input = new Scanner(System.in);
//		public static int count(String input) {
//		    if (input == null || input.isEmpty()) {
//		      return 0;
//		    }
//
//		    String[] words = input.split(" ");
//		    return words.length;
//		  }
		
		
		
		
//		Problem 9 
//	 int rows = 5;
//
//	 for (int i = 1; i <= rows; ++i) {
//		 for (int j = 1; j <= i; ++j) {
//		      System.out.print("* ");
//		     }
//		      System.out.println();
//		    }
//		Problem 8
		
//		String line = "Who are you and where are my 3 dogs?";
//	    int vowels = 0, consonants = 0, digits = 0, spaces = 0;
//
//	    line = line.toLowerCase();
//	    for (int i = 0; i < line.length(); ++i) {
//	      char ch = line.charAt(i);
//
//	      // check if character is any of a, e, i, o, u
//	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//	        ++vowels;
//	      }
//
//	      // check if character is in between a to z
//	      else if ((ch >= 'a' && ch <= 'z')) {
//	        ++consonants;
//	      }
//	      
//	      // check if character is in between 0 to 9
//	      else if (ch >= '0' && ch <= '9') {
//	        ++digits;
//	      }
//	      
//	      // check if character is a white space
//	      else if (ch == ' ') {
//	        ++spaces;
//	      }
//	    }
//
//	    System.out.println("Vowels is: " + vowels);
//	    System.out.println("Consonants is: " + consonants);
//	    System.out.println("Digits is: " + digits);
//	    System.out.println("White spaces is: " + spaces);
		
		
		
		
		
		
		
		
		//Problem 7
//		 int rows = 2, columns = 3;
//	        int[][] first = { {2, 3, 4}, {5, 2, 3} };
//	        int[][] second = { {-4, 5, 3}, {5, 6, 3} };
//
//	        // Adding Two matrices
//	        int[][] sum = new int[rows][columns];
//	        for(int i = 0; i < rows; i++) {
//	            for (int j = 0; j < columns; j++) {
//	                sum[i][j] = first[i][j] + second[i][j];
//	            }
//	        }
//
//	        // Displaying the result
//	        System.out.println("Sum is: ");
//	        for(int[] row : sum) {
//	            for (int column : row) {
//	                System.out.print(column + "    ");
//	            }
//	            System.out.println();
//	        }
//		
		
		
		
		//Problem 6
		
//		double[] arr = {10, 11, 12, 13, 14};
//        double total = 0;
//
//        for(int i=0; i<arr.length; i++){
//        	total = total + arr[i];
//        }
//
//
//        double avg = total / arr.length;
//        
//       
//        System.out.format("The average is: %.3f", avg);
		
//		Problem 5
//		
//		int base = 2;
//		int expo = 4;
//		
//		long result = 1;
//		
//		for (; expo != 0; --expo) {
//			result *= base;
//		}
//		System.out.println("Answer = " + result);
		
		
		//Problem 4
//		
//		int number = 987654, reverse = 0;  
//		while(number != 0)   
//		{  
//		int remainder = number % 10;  
//		reverse = reverse * 10 + remainder;  
//		number = number/10;  
//		}  
//		System.out.println("The reverse of the given number is: " + reverse);  
//		
//		//Problem 3 
//		char c;
//
//	    for(c = 'a'; c <= 'z'; ++c)
//	      System.out.print(c + " ");
//	    
		
//		//Problem 2
//		int count = 7, num1 = 0, num2 = 1;
//        System.out.print("Fibonacci Series of "+count+" numbers:");
//
//        for (int i = 1; i <= count; ++i)
//        {
//            System.out.print(num1+" ");
//
//            /* On each iteration, we are assigning second number
//             * to the first number and assigning the sum of last two
//             * numbers to the second number
//             */
//            int sumOfPrevTwo = num1 + num2;
//            num1 = num2;
//            num2 = sumOfPrevTwo;
//        }
		
//	//Problem 1
//	int x;
//	
//	for(x = 0; x <= 10; x++) {
//		int i = 2;
//		System.out.println(i * x);
//		}
	}
}

