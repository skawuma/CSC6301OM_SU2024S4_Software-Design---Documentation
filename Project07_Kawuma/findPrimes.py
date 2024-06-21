import random
import cProfile
def guess():
    return random.randint(2, 5000)

def isPrime(x):
    for i in range(x):
        for j in range(x):
            if i * j == x:
                return False
    return True
def isPrimeOptimized(x):
  """Returns True if n is a prime number, False otherwise."""
  if x < 2:
    return False
  if  x % 2 == 0:             
         return False
  for i in range(2, int(x**0.5) + 1):
    if x % i == 0:
      return False
  return True


def findPrimes(num):
    primes = []
    for i in range(num):
        p = guess()
        while not isPrime(p):
            p = guess()
        primes += [p]
    return primes
def findPrimesOptimized(num):
     primes = []
     for i in range(num):
        p = guess()
        while not isPrimeOptimized(p):
            p = guess()
        primes += [p]
     return primes

print("Annalysis of Brute Force method isPrime ")

print ("***************************************************")
cProfile.run('print(findPrimes(500)[:10])')

print("Annalysis of Optimized Method isPrimeOptimized ")

print ("***************************************************")

cProfile.run('print(findPrimesOptimized(500)[:10])')
