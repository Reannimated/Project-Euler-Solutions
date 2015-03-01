"""
Project Euler Problem 20
========================

n! means n * (n - 1) * ... * 3 * 2 * 1

Find the sum of the digits in the number 100!
"""

import math

def run():
	n = math.factorial(100)
	sum = 0
	for i in str(n):
		sum += int(i)
	return sum

print run()