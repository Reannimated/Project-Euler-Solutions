"""
Project Euler Problem 14
========================

The following iterative sequence is defined for the set of positive
integers:

n->n/2 (n is even)
n->3n+1 (n is odd)

Using the rule above and starting with 13, we generate the following
sequence:
                  13->40->20->10->5->16->8->4->2->1

It can be seen that this sequence (starting at 13 and finishing at 1)
contains 10 terms. Although it has not been proved yet (Collatz Problem),
it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
"""


def run():
	target = 1000000
	cache = [-1] * (target + 1)
	max_length = -1
	max_n = -1
	cache[1] = 0
	cache[2] = 1
	for i in range(1, target + 1):
		n = i
		length = 0
		sequence_nums = []
		while n != 1 and n >= i:
			length += 1
			sequence_nums.append(n)
			if n % 2 == 0:
				n /= 2
			else:
				n = n * 3 + 1
		for j in sequence_nums:
			if j <= target:		
				cache[j] = length + cache[n]

		if cache[i] > max_length:
			max_length = cache[i]
			max_n = i

	return max_n

print run()


#come back to this question
