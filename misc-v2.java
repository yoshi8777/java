package example;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}


import java.util.Scanner;

public class PatternAndLogicExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pattern Questions
        System.out.println("Pattern 1:");
        printPattern1();
        
        System.out.println("\nPattern 2:");
        printPattern2();
        
        System.out.println("\nPattern 3:");
        printPattern3();
        
        System.out.println("\nPattern 4:");
        printPattern4();
        
        System.out.println("\nPattern 5:");
        printPattern5();

        // Logic Questions
        System.out.println("\nFactorial of a Number:");
        int number = scanner.nextInt();
        int factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        System.out.println("\nCheck Prime Number:");
        int num = scanner.nextInt();
        boolean isPrime = isPrimeNumber(num);
        System.out.println(num + " is prime? " + isPrime);

        System.out.println("\nReverse a String:");
        scanner.nextLine(); // Consume the newline character
        String str = scanner.nextLine();
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);

        System.out.println("\nSum of Digits:");
        int numToSum = scanner.nextInt();
        int digitSum = sumOfDigits(numToSum);
        System.out.println("Sum of digits: " + digitSum);

        System.out.println("\nSwap Variables Without Third Variable:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swapVariables(a, b);

        System.out.println("\nFibonacci Series:");
        int n = scanner.nextInt();
        printFibonacciSeries(n);

        System.out.println("\nFind Largest and Smallest in an Array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        findLargestAndSmallest(array);

        System.out.println("\nCheck Palindrome:");
        scanner.nextLine(); // Consume the newline character
        String strPalindrome = scanner.nextLine();
        boolean isPalindrome = checkPalindrome(strPalindrome);
        System.out.println(strPalindrome + " is a palindrome? " + isPalindrome);

        System.out.println("\nCount Character Occurrences in String:");
        String inputString = scanner.nextLine();
        char targetChar = scanner.nextLine().charAt(0);
        int charCount = countCharacterOccurrences(inputString, targetChar);
        System.out.println("Number of occurrences of '" + targetChar + "' in '" + inputString + "': " + charCount);

        System.out.println("\nPrint Prime Numbers Between Two Numbers:");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        printPrimeNumbersInRange(start, end);

        scanner.close();
    }

    // Pattern 1
    public static void printPattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void printPattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void printPattern3() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void printPattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void printPattern5() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Logic 6: Factorial of a Number
    public static int findFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Logic 7: Check Prime Number
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Logic 8: Reverse a String
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Logic 9: Sum of Digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Logic 10: Swap Variables Without Third Variable
    public static void swapVariables(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Logic 11: Fibonacci Series
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }

    // Logic 12: Find Largest and Smallest in an Array
    public static void findLargestAndSmallest(int[] array) {
        int smallest = array[0];
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }

    // Logic 13: Check Palindrome
    public static boolean checkPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // Logic 14: Count Character Occurrences in String
    public static int countCharacterOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // Logic 15: Print Prime Numbers Between Two Numbers
    public static void printPrimeNumbersInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            if (num <= 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
} 
