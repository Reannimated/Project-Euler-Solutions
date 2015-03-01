"""
Project Euler Problem 23
========================

A perfect number is a number for which the sum of its proper divisors is
exactly equal to the number. For example, the sum of the proper divisors
of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect
number.

A number whose proper divisors are less than the number is called
deficient and a number whose proper divisors exceed the number is called
abundant.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the
smallest number that can be written as the sum of two abundant numbers is
24. By mathematical analysis, it can be shown that all integers greater
than 28123 can be written as the sum of two abundant numbers. However,
this upper limit cannot be reduced any further by analysis even though it
is known that the greatest number that cannot be expressed as the sum of
two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the
sum of two abundant numbers.
"""

import math

def run():
	def is_abundant(n):
		result = 1
		sqrt = int(math.sqrt(n))
		for i in range(2, sqrt + 1):
			if n % i == 0:
				result += i + n / i
		if sqrt ** 2 == n:
			result -= sqrt
		return result > n

	def sum_of(abundant_numbers, n):
		for i in range(n + 1):
			if abundant_numbers[i] and abundant_numbers[n - i]:
				return True

	result = 0
	limit = 20162 # All abundant numbers above 20161 can be expressed as the sum of two abundant numbers
	abundant_numbers = [None] * (limit + 1)
	for i in range(1, limit):
		abundant_numbers[i] = is_abundant(i)
	for i in range(1, limit + 1):
		if not sum_of(abundant_numbers, i):
			result += i
	return result

print run()