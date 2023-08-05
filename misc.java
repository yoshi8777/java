class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Linking the nodes
        head.next = second;
        second.next = third;

        // Traversing and printing the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

---------------------------------------------
    public class TwoDArrayExample {
    public static void main(String[] args) {
        // Creating a 2D array
        int[][] matrix = new int[3][4];

        // Initializing values
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        // Accessing and printing elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
----------------------------------------------------------
public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello, ";
        String name = "John";

        // Concatenation using the + operator
        String message = greeting + name;
        System.out.println(message); // Output: Hello, John

        // String length
        int length = message.length();
        System.out.println("Length of message: " + length); // Output: Length of message: 12

        // String comparison
        String anotherName = "Jane";
        boolean isEqual = name.equals(anotherName);
        System.out.println("Names are equal: " + isEqual); // Output: Names are equal: false

        // Substring
        String sub = message.substring(7); // Starting from index 7 (inclusive) to the end
        System.out.println("Substring: " + sub); // Output: Substring: John

        // Uppercase and lowercase
        String uppercaseMessage = message.toUpperCase();
        System.out.println("Uppercase message: " + uppercaseMessage); // Output: Uppercase message: HELLO, JOHN

        String lowercaseMessage = message.toLowerCase();
        System.out.println("Lowercase message: " + lowercaseMessage); // Output: Lowercase message: hello, john

        // Searching within a string
        boolean containsHello = message.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello); // Output: Contains 'Hello': true

        // Index of a character or substring
        int index = message.indexOf("John");
        System.out.println("Index of 'John': " + index); // Output: Index of 'John': 7
    }
}
---------------------------------------------------------------
    class Car {
    String make;
    String model;
    int year;

    // Default constructor
    Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Using the default constructor
        Car defaultCar = new Car();
        System.out.println("Default Car:");
        defaultCar.displayInfo();
        
        // Using the parameterized constructor
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println("\nMy Car:");
        myCar.displayInfo();
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}


Pattern Questions:

Question 1:

java
Copy code
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
Question 2:

java
Copy code
for (int i = 1; i <= 5; i++) {
    for (int j = 5; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}
Question 3:

java
Copy code
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
Question 4:

java
Copy code
for (int i = 1; i <= 5; i++) {
    for (int j = 5; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print(k);
    }
    System.out.println();
}
Question 5:

java
Copy code
for (int i = 5; i >= 1; i--) {
    for (int j = 5; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print(i);
    }
    System.out.println();
}
Logic Questions:

Question 6: Factorial of a Number

java
Copy code
int number = 5;
int factorial = 1;

for (int i = 1; i <= number; i++) {
    factorial *= i;
}

System.out.println("Factorial of " + number + " is: " + factorial);
Question 7: Check Prime Number

java
Copy code
int number = 17;
boolean isPrime = true;

if (number <= 1) {
    isPrime = false;
} else {
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }
}

System.out.println(number + " is prime? " + isPrime);
Question 8: Reverse a String

java
Copy code
String original = "Hello, World!";
String reversed = "";

for (int i = original.length() - 1; i >= 0; i--) {
    reversed += original.charAt(i);
}

System.out.println("Original: " + original);
System.out.println("Reversed: " + reversed);
Question 9: Sum of Digits

java
Copy code
int number = 12345;
int sum = 0;

while (number > 0) {
    sum += number % 10;
    number /= 10;
}

System.out.println("Sum of digits: " + sum);
Question 10: Swap Variables Without Third Variable

java
Copy code
int a = 5, b = 10;
a = a + b;
b = a - b;
a = a - b;

System.out.println("After swapping: a = " + a + ", b = " + b);
Question 11: Fibonacci Series

java
Copy code
int n = 10;
int first = 0, second = 1;

System.out.print("Fibonacci Series: " + first + ", " + second);

for (int i = 2; i < n; i++) {
    int next = first + second;
    System.out.print(", " + next);
    first = second;
    second = next;
}
Question 12: Find Largest and Smallest in an Array

java
Copy code
int[] array = { 10, 5, 7, 21, 8, 15 };
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
Question 13: Check Palindrome

java
Copy code
String str = "madam";
boolean isPalindrome = true;

for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
    if (str.charAt(i) != str.charAt(j)) {
        isPalindrome = false;
        break;
    }
}

System.out.println(str + " is a palindrome? " + isPalindrome);
Question 14: Count Character Occurrences in String

java
Copy code
String str = "hello";
char target = 'l';
int count = 0;

for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == target) {
        count++;
    }
}

System.out.println("Number of occurrences of '" + target + "' in '" + str + "': " + count);
Question 15: Print Prime Numbers Between Two Numbers

java
Copy code
int start = 10, end = 50;

for (int i = start; i <= end; i++) {
    boolean isPrime = true;
    if (i <= 1) {
        continue;
    }
    for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        System.out.print(i + " ");
    }
}
