"""
Project Euler Problem 1
=======================

If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
"""

def run():
    def SumDivisibleBy(n, target):
        N = target / n
        return n * (N * (N + 1)) / 2

    return SumDivisibleBy(3, 999) + SumDivisibleBy(5, 999) - SumDivisibleBy(15, 999)

print run()


