# Explanation of Analysis and optimization report:


## Analysis and optimization report: 
The time complexity of the naive method isPrime is
 O(n2). 
I have used the cProfile module to measure the time taken to check the list of  random numbers between 2 and 5000 . 
Based on the results after running the code; 
The naive method "isPrime" had 27508 calls in 108.008 seconds compared to "isPrimeOptimized" which had 29091 in 0.005 seconds.

This is because the  function "isPrimeOptimized" is memoized, which means that it stores the results of previous calls so that it does not have to recalculate them.It only checks for divisibility by numbers up to the square root of the given number. This is because if a number is divisible by a number greater than its square root, it must also be divisible by a number less than or equal to its square root.

In conclusion, the "isPrimeOptimized" is a very efficient sorting algorithm with a time complexity of
 O(n). 

