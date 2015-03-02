"""
Project Euler Problem 37
========================

The number 3797 has an interesting property. Being prime itself, it is
possible to continuously remove digits from left to right, and remain
prime at each stage: 3797, 797, 97, and 7. Similarly we can work from
right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left
to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
"""

from euler.library import sieve, prime_list

def run():
    def truncatable(n, psieve):
        if n < 23:
            return False
        left = str(n)
        right = str(n)
        while left != '':
            if not psieve[int(left)]:
                return False
            left = left[1:]
        while right != '':
            if not psieve[int(right)]:
                return False
            right = right[:-1]
        return True

    primes = prime_list(999983)
    psieve = sieve(999983)
    result = 0
    count = 0
    n = 23
    for n in primes:
        if truncatable(n, psieve):
            count += 1
            result += n
            if count == 11:
                break
    return result
    
print run()