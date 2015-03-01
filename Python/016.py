"""
Project Euler Problem 16
========================

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
"""

def run():
	sum = 0
	n = 2 ** 1000
	for i in str(n):
		sum += int(i)
	return sum

print run()
