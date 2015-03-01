"""
Project Euler Problem 32
========================

We shall say that an n-digit number is pandigital if it makes use of all
the digits 1 to n exactly once; for example, the 5-digit number, 15234,
is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 * 186 = 7254, containing
multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product
identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to
only include it once in your sum.
"""

from euler.library import is_pandigital

def run():
    result = 0
    products = set()
    for a in range(1964):
        for b in range(a):
            num = str(a) + str(b) + str(a * b)
            if len(num) == 9 and is_pandigital(int(num), 9):
                products.add(a * b)
    for i in products:
        result += i
    return result

print run()
