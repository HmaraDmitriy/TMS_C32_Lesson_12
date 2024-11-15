# TMS_C32_Lesson_12
Several tasks to check the line, description inside

Task 1
Write a program that the passed string is a hex code for a color description.
For example, when entering the value #8b2323 into the program, the program should return - Yes.

Task 2
Write a program that will check that the entered link is valid.
For example, when analyzing a link like this https://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is valid.
and when entering tcp://teachmeskills.by/kursy/programmirovaniya-online - the program should return that the link is not valid (the link starts with neither http nor https)

Problem 3 The user enters a three-digit number.
The program must add up the digits that make up this number.
For example, if 349 was entered, the program must display the number 16, since
3 + 4 + 9 = 16.

Complication of Problem 3.
A number of any length (from zero to infinity) is entered. It is necessary to find the sum of its
digits.

Task 4 Euclidean Algorithm
The Euclidean Algorithm is an algorithm for finding the greatest common divisor (GCD)
of a pair of integers.
The greatest common divisor (GCD) is a number that divides two numbers without remainder
and is divisible by any other divisor of these two numbers. Simply put, this is the largest number by which two numbers,
for which the GCD is sought, can be divided without remainder.
Algorithm for finding the GCD by subtraction:
1. Subtract the smaller number from the larger one.
2. If the result is 0, then the numbers are equal to each other and are GCD
(you should exit the loop).
3. If the result of subtraction is not 0, then replace the larger number with
the result of subtraction.
4. Go to point 1.

Task 5 Bank deposit.
The user makes a deposit of a rubles for a period of years at 10% per annum
(each year the size of his deposit increases by 10%. This money is added to
the deposit amount, and there will also be interest on it next year).
Write a program bank that takes the arguments a and years and returns
the amount that will be in the user's account.

Task 6 Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] rotates to [5,6,7,1,2,3,4].

Task 7 Given two words (start and end) and a dictionary, find the length of the shortest
sequence of transformations from start to end, in which only one letter can be changed at a time.
And each intermediate word must exist in the dictionary.
For example, given:
start = "hit"
end = "cog"
dict = ["hot", "dot", "dog", "lot", "log"]
One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
the program should return a length of 5.

Task 8 Given an array of integers, find two numbers that add up to the given number.
The twoSum function should return the indices of two numbers so that they add up to
the target number.
For example:
Input: numbers={2, 7, 11, 15}, target=9.
Output: index1=0, index2=1.
