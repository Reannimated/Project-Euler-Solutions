"""
Project Euler Problem 10
========================

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
"""

from euler.library import prime_list

def run():
	primes = prime_list(2000000)
	return sum(primes)

print run()
