"""
Project Euler Problem 5
=======================

2520 is the smallest number that can be divided by each of the numbers
from 1 to 10 without any remainder.

What is the smallest number that is evenly divisible by all of the numbers
from 1 to 20?
"""

import fractions

def run():
    def lcm(a, b):
        return abs(a * b) / fractions.gcd(a, b) if a and b else 0

    n = 2
    for i in range(2, 21):
        n = lcm(i, n)
    return n

print run()