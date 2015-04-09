"""
Project Euler Problem 4
=======================

A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
"""

from euler.library import is_palindrome

def run():
    n = 0
    for a in range(900, 1000):
        for b in range(900, 1000):
            if is_palindrome(a * b):
                if a * b >= n:
                    n = a * b
    return n

print run()
