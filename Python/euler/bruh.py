# def run():
    # def circular_prime(n, primes):
    #     if not primes[n]:
    #         return False
    #     elif n < 10 and primes[n]:
    #         return True
    #     number = map(int, str(n))
    #     rotator = deque(number)
    #     for i in range(len(number)):
    #         num = int(''.join(map(str, rotator)))
    #         if num % 2 == 0:
    #             return False
    #         elif not primes[num]:
    #             return False
    #         rotator.rotate()
    #     return True

    # result = 0
    # primes = sieve(int(1e6))

    # for i in range(3, int(1e6), 2):
    #     if circular_prime(i, primes):
    #         result += 1

    # primeList = prime_list(int(1e6))
    # for i in primeList:
    #     if circular_prime(i, primes):
    #         result += 1

    # return result
# print run()