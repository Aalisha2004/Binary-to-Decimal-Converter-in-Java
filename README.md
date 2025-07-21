# This repository contains a simple Java program that converts a binary number (entered as an integer) into its decimal equivalent. It demonstrates basic understanding of number systems and manipulation of digits using loops and arithmetic operations in Java.

**📋 Description**
The program accepts a binary number as an integer input from the user and calculates its decimal representation. The conversion logic is implemented manually using math operations (i.e., without using Java's built-in methods like Integer.parseInt(bin, 2)), making it useful for beginners to understand binary-to-decimal conversion.

**🚀 Features**
Accepts user input for a binary number

Manually converts binary to decimal

Outputs the decimal equivalent

Simple and easy to understand Java logic

**🧠 How It Works**
Takes a binary number (as an integer) from the user.

Extracts each digit from right to left using modulo (% 10).

Multiplies each digit with 2^position and adds it to a result.

Prints the final decimal result.

**📥 Sample Input / Output**
Enter:
1011
Decimal of 1011 = 11

**📌 Notes**
Input must be a valid binary number (only digits 0 and 1).

The program reads the binary number as an integer, so leading zeros will be ignored (e.g., inputting 0010 will be treated as 10).
