
import org.junit.Test
class JUnitTest {
  @Test def isPrime()={
    println("Enter value to check whether it is prime or not : ")
   var num=readInt()
  
    for (i <- 2 to num-1) {
      if (num % i == 0)
        {
         println("number is divisible by : ",i)
        false
        }
      else {
        println("number is not divisible by : ",i)
        true
        }
    }
  }
}