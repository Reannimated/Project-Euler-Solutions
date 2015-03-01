"""
Project Euler Problem 34
========================

145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of
their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.
"""

import math

def run():
    def digit_factorial(n):
        digit_fac = sum([math.factorial(int(i)) for i in str(n)])
        return n == digit_fac

    result = 0
    for i in range(3, 100000):
        if digit_factorial(i):
            result += i
    return result

print run()
