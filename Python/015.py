"""
Project Euler Problem 15
========================

Starting in the top left corner of a 2 * 2 grid, there are 6 routes
(without backtracking) to the bottom right corner.

How many routes are there through a 20 * 20 grid?
"""
import operator as op

def run():
	def ncr(n, r):
	    r = min(r, n-r)
	    if r == 0: return 1
	    numer = reduce(op.mul, xrange(n, n-r, -1))
	    denom = reduce(op.mul, xrange(1, r+1))
	    return numer//denom
	
	n = 20
	return ncr(n * 2, n)

print run()

