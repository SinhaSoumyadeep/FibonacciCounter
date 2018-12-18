package fib;


/**
 * This interface represents a set of operations which is used to count Fibonacci numbers. The count
 * starts at 1 (the first Fibonacci number is 0, the second is 1, and so on according to the above
 * sequence). It can then be incremented or decremented by 1 (count falling below 1 is invalid).
 */
public interface FibonacciCounter {

  /**
   * This method is used to increment the counter.
   *
   * @return Object of FibonacciCounter
   */
  public FibonacciCounter incrementCounter();

  /**
   * This method is used to decrement the counter.
   *
   * @return Object of FibonacciCounter
   */
  public FibonacciCounter decrementCounter();

  /**
   * This method is used to get the current count of Fibonacci counter.
   *
   * @return the current count of Fibonacci counter.
   */
  public Integer currentCounter();

  /**
   * This method is used to get the Fibonacci number for the corresponding current count.
   *
   * @return the Fibonacci number for the corresponding current count
   */
  public Integer fibonacci();

}
