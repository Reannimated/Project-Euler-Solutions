"""
Project Euler Problem 24
========================

A permutation is an ordered arrangement of objects. For example, 3124 is
one possible permutation of the digits 1, 2, 3 and 4. If all of the
permutations are listed numerically or alphabetically, we call it
lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

                    012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3,
4, 5, 6, 7, 8 and 9?
"""

def run():
	#http://www.nayuki.io/res/next-lexicographical-permutation-algorithm/nextperm.py
	def next_permutation(arr):
	    # Find non-increasing suffix
	    i = len(arr) - 1
	    while i > 0 and arr[i - 1] >= arr[i]:
	        i -= 1
	    if i <= 0:
	        return False
	    
	    # Find successor to pivot
	    j = len(arr) - 1
	    while arr[j] <= arr[i - 1]:
	        j -= 1
	    arr[i - 1], arr[j] = arr[j], arr[i - 1]
	    
	    # Reverse suffix
	    arr[i : ] = arr[len(arr) - 1 : i - 1 : -1]
	    return True

	digits = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	for i in range(999999):
		next_permutation(digits)
	return 	''.join(map(str, digits))
print run()