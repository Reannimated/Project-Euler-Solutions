"""
Project Euler Problem 33
========================

The fraction 49/98 is a curious fraction, as an inexperienced
mathematician in attempting to simplify it may incorrectly believe that
49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less
than one in value, and containing two digits in the numerator and
denominator.

If the product of these four fractions is given in its lowest common
terms, find the value of the denominator.
"""

import fractions

def run():
    denominator, numerator = 1, 1
    for i in range(10):
        for b in range(i):
            for a in range(b):
                if b * (10 * a + i) == a * (10 * i + b):
                    numerator *= a
                    denominator *= b
    return denominator / fractions.gcd(numerator, denominator)

print run()
