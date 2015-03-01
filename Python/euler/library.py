import math

# Returns true if n is a palindrome
def is_palindrome(n):
    if isinstance(n, str):
        return n == n[::-1]
    else:
        return is_palindrome(str(n))

# return true if n is prime
def is_prime(n):
    if n <= 1:
        return False
    elif n == 2:
        return True
    elif n % 2 == 0:
        return False
    else:
        d = 3
        while d * d <= n:
            if n % d == 0:
                return False
            d += 2
        return True

# returns a list of primes from 2 to n
def prime_list(n):
    if n <= 2:
        return []
    sieve = range(3, n, 2)
    top = len(sieve)
    for si in sieve:
        if si:
            bottom = (si*si - 3) // 2
            if bottom >= top:
                break
            sieve[bottom::si] = [0] * -((bottom - top) // si)
    return [2] + [el for el in sieve if el]

# returns a boolean list from 0 to n + 1 where if a value is true its index is prime
def sieve(limit):
    primes = [False] * 2 + [True] * (limit - 1) 
    for n in range(int(math.sqrt(limit))):
        if primes[n]:
            for i in range(n * n, limit+1, n):
                primes[i] = False
    return primes

# returns the number of divisors of n using prime factorization and the primelist, primes.
def number_of_divisors(n, primes):
	nod, exponent, remain = 1, 1, n
	for i in range(len(primes)):
		if primes[i] ** 2 > n:
			return nod * 2
		exponent = 1
		while remain % primes[i] == 0:
			exponent += 1
			remain /= primes[i]
		nod *= exponent
		if remain == 1:
			return nod
	return nod

# returns true if a number, nr contains the digits 1 to n at least once
def is_pandigital(nr, n):
    nr = str(nr)
    beg=nr[0:n]
    end=nr[-n:]
    for i in map(str, range(1, n + 1)):
        if i not in beg or i not in end:
            return False
    return True