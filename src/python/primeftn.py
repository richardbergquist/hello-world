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

def calcprimes(start, delta):
    """Calc prime numbers between a start value and up to a delta limit."""
    primes = []
    limit = start + delta

    for n in range(start, limit):
        for x in range(2, n):
            if n % x == 0:
                # print n, 'equals', x, '*', n/x
                break
        else:
            # loop fell through without finding a factor
            # print n,
            primes.append(n)

    return primes

def printprimes(limit):
    """Print prime numbers up to n."""

    for n in range(2, limit):
        for x in range(2, n):
            if n % x == 0:
                # print n, 'equals', x, '*', n/x
                break
        else:
            # loop fell through without finding a factor
            print (n, end=", ", flush=True)

    print("")

def printprimes(start, delta):
    """Print prime numbers between a start value and up to a delta limit."""
    limit = start + delta

    for n in range(start, limit):
        for x in range(2, n):
            if n % x == 0:
                # print n, 'equals', x, '*', n/x
                break
        else:
            # loop fell through without finding a factor
            print (n, end=", ", flush=True)

    print("")

# If module is run from commmand line then call printprimes passing in two comandline args
if __name__ == "__main__":
    import sys
    printprimes(int(sys.argv[1]), int(sys.argv[2]))
