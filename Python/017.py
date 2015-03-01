"""
Project Euler Problem 17
========================

If the numbers 1 to 5 are written out in words: one, two, three, four,
five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written
out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
20 letters. The use of "and" when writing out numbers is in compliance
with British usage.
"""

def run():
	one_to_nine = 36
	ten_to_nineteen = 70
	twenty_to_ninety_nine = one_to_nine * 8 + 460
	one_to_one_hundred = one_to_nine + ten_to_nineteen + twenty_to_ninety_nine
	hundred = 7 * 9
	hundred_and = 10 * 99 * 9
	thousand = 11
	return one_to_one_hundred + (one_to_nine * 100) + (one_to_one_hundred * 9) + hundred + hundred_and + thousand


print run()
