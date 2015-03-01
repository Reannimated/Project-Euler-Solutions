"""
Project Euler Problem 27
========================

Euler published the remarkable quadratic formula:

                               n^2 + n + 41

It turns out that the formula will produce 40 primes for the consecutive
values n = 0 to 39. However, when n = 40, 40^2 + 40 + 41 = 40(40 + 1) + 41
is divisible by 41, and certainly when n = 41, 41^2 + 41 + 41 is clearly
divisible by 41.

Using computers, the incredible formula  n^2 - 79n + 1601 was discovered,
which produces 80 primes for the consecutive values n = 0 to 79. The
product of the coefficients, 79 and 1601, is 126479.

Considering quadratics of the form:

  n^2 + an + b, where |a| < 1000 and |b| < 1000

                              where |n| is the modulus/absolute value of n
                                               e.g. |11| = 11 and |-4| = 4

Find the product of the coefficients, a and b, for the quadratic
expression that produces the maximum number of primes for consecutive
values of n, starting with n = 0.
"""

from euler.library import is_prime

def run():
    def number_of_primes(a, b):
        i = 0
        while True:
            n = i * i + i * a + b
            if n < 0 or not is_prime(n):
                return i
            i += 1

    result, maxnum, maxa, maxb = 0, 0, 0, 0
    for a in range(-1000, 1001):
        for b in range(-1000, 1001):
            temp = number_of_primes(a, b)
            if temp > maxnum:
                maxnum = temp
                maxa = a
                maxb = b
    return maxa * maxb
print run()