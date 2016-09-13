def calcprimes(limit):
    """Calc prime numbers up to n."""
    primes = []

    for n in range(2, limit):
        for x in range(2, n):
            if n % x == 0:
                # print n, 'equals', x, '*', n/x
                break
        else:
            # loop fell through without finding a factor
            # print n,
            primes.append(n)

    return primes
