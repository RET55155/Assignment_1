# Assignment 1
Student: Zhanserik Yerketay
Group: SE-2513
//
The task was to solve 10 problems with constraints
//

Task 1. Print Digits of a Number
<img width="1836" height="831" alt="image" src="https://github.com/user-attachments/assets/a6b83914-01fc-4a55-90a4-c90d8ce51bd9" />
Base case is when n is under 10. The function calls itself with n/10 and then prints the remainder to keep the numbers in order.

Task 2. Average of Elements
<img width="1792" height="890" alt="image" src="https://github.com/user-attachments/assets/aac3e882-0fb1-4416-95d9-17373a3ec09d" />
It recursively adds all numbers in the array by moving an index pointer. In main I just divide that total sum by the array length.

Task 3: Is Prime
<img width="1916" height="801" alt="image" src="https://github.com/user-attachments/assets/84335b02-ae40-4cda-8b28-5156706fca2f" />
I check if n divides by any number starting from 2. If the divisor squared is bigger than n and no match is found, it’s prime.

Task 4. Factorial
<img width="1917" height="882" alt="image" src="https://github.com/user-attachments/assets/acda03a4-cb4b-4082-b224-c0ba96452cca" />
Standard recursion where n multiplies by the result of n-1. It stops and returns 1 when n hits 0 or 1.

Task 5. Fibonacci Number
<img width="1892" height="821" alt="image" src="https://github.com/user-attachments/assets/fc6a101a-8ef1-4e0b-a8c2-045b727e6dec" />
Each call sums up the two previous numbers in the sequence. The base cases are 0 and 1 which return themselves.

Task 6: Power
<img width="1916" height="899" alt="image" src="https://github.com/user-attachments/assets/493c9414-a494-46d1-b55d-94913c25eea0" />
It multiplies the base number by itself n times using recursion. When the exponent hits 0 it returns 1 to stop the chain.

Task 7: Reverse Sequence
<img width="1526" height="891" alt="image" src="https://github.com/user-attachments/assets/46855a07-6191-4ded-94a3-628171653f21" />
The program reads numbers and only prints them after the recursive call returns. This uses the system stack to flip the order without any arrays.

Task 8: All Digits
<img width="1578" height="825" alt="image" src="https://github.com/user-attachments/assets/4e6dce57-1e7f-4554-b45b-29c1265cfe75" />
It checks if the first character is a digit and then calls itself with the rest of the string. If it finds a non-digit or hits the end it stops.

Task 9: Count Characters
<img width="1919" height="841" alt="image" src="https://github.com/user-attachments/assets/0bb892f0-b11d-4123-a993-f38598602706" />
The logic is adding 1 for the current character plus the count of the remaining string. Once the string is empty it returns 0.

Task 10: GCD
<img width="1907" height="856" alt="image" src="https://github.com/user-attachments/assets/c15d5e43-8bbb-4462-af77-efd685c39f67" />
I used the Euclidean algorithm where GCD of a and b is the same as GCD of b and a mod b. It finishes when the second number becomes 0.

Conclusion 
Each task was verified for edge cases. The project demonstrates a solid understanding of recursive depth, base cases, and how to replace iterative logic with recursive calls.
