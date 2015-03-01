"""
Project Euler Problem 3
=======================

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?
"""

def run():
    n = 600851475143
    i = 2
    while i < n:
        if n % i == 0:
            n /= i
        i += 1
    return i

print run()
