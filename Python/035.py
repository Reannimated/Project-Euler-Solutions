"""
Project Euler Problem 35
========================

The number, 197, is called a circular prime because all rotations of the
digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37,
71, 73, 79, and 97.

How many circular primes are there below one million?
"""

from collections import deque
from euler.library import prime_list, sieve

def run():
    def circular_prime(n, psieve):
        if n < 10:
            return True
        num = str(n)
        if '2' in num or '4' in num or '6' in num or '8' in num or '0' in num:
            return False
        for i in range(len(num)):
            num = num[1:] + num[:1]
            if not psieve[int(num)]:
                return False
        return True


    result = 0
    primes = prime_list(1000000)
    psieve = sieve(1000000)
    for i in primes:
        if circular_prime(i, psieve):
            result += 1

    return result

print run()
