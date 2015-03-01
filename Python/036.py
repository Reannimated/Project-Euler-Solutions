"""
Project Euler Problem 36
========================

The decimal number, 585 = 1001001001[2] (binary), is palindromic in both
bases.

Find the sum of all numbers, less than one million, which are palindromic
in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include
leading zeros.)
"""

from euler.library import is_palindrome

def run():
    result = 0
    for i in range(1, 1000000, 2):
        if is_palindrome(i) and is_palindrome(bin(i)[2:]):
            result += i
    return result

print run()