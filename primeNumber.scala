import scala.annotation.tailrec
import scala.collection.immutable.SortedSet
import scala.compat.Platform

class myprime
{
 def Sieve(limit: Int) = {
    @tailrec
    def rec(primes: SortedSet[Int], n: Int): Int =
      if (n >= limit) primes.size
      else rec(primes ++ (if (isPrime(primes, n)) Some(n) else None), n + 1)
 
    def isPrime(primes: SortedSet[Int], i: Int): Boolean ={
       println(primes)
       primes.takeWhile(_ <= math.sqrt(i).toInt).forall(i % _ != 0)
      }
    rec(SortedSet(), 2)
}
}
object primeNumber {
  def main(args: Array[String]): Unit = 
  {
    var obj=new myprime()
    
     println("Enter a number uptill which you want to find prime numbers : ")
     var number=readInt();
     obj.Sieve(number)
  }
}