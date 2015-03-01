"""
Project Euler Problem 26
========================

A unit fraction contains 1 in the numerator. The decimal representation of
the unit fractions with denominators 2 to 10 are given:

   1/2  =  0.5
   1/3  =  0.(3)
   1/4  =  0.25
   1/5  =  0.2
   1/6  =  0.1(6)
   1/7  =  0.(142857)
   1/8  =  0.125
   1/9  =  0.(1)
  1/10  =  0.1

Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can
be seen that ^1/[7] has a 6-digit recurring cycle.

Find the value of d < 1000 for which ^1/[d] contains the longest recurring
cycle in its decimal fraction part.
"""

def run():
    def recurring_cycle_length(n):
        cycle_length = 0
        while n % 2 == 0:
            n /= 2
        while n % 5 == 0:
            n /= 5
        if n > 1:
            a = 10 % n
            cycle_length = 1
            while a != 1:
                a *= 10
                a %= n
                cycle_length += 1
        return cycle_length

    result, cycle = 0, 0
    for i in range(3, 1000):
        cycle = recurring_cycle_length(i)
        if cycle > result:
            result = i
    return result

print run()