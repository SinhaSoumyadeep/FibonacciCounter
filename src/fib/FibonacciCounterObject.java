package fib;

/**
 * This Concrete Class is used to counts Fibonacci numbers. The count starts at 1 (the first
 * Fibonacci number is 0, the second is 1, and so on according to the above sequence). It can then
 * be incremented or decremented by 1 (count falling below 1 is invalid).
 */
public class FibonacciCounterObject implements FibonacciCounter {

  private Integer counter;

  /**
   * This Constructor is used to initialize the counter to 1.
   */
  public FibonacciCounterObject() {
    counter = 1;
  }

  /**
   * This method is used to increment the counter.
   *
   * @return Object of FibonacciCounter
   */
  public FibonacciCounter incrementCounter() {

    if (this.counter >= 1 && this.counter < Integer.MAX_VALUE) {
      this.counter = this.counter + 1;
    } else {
      throw new IllegalStateException("the counter cannot be increased!!");
    }

    return this;
  }


  /**
   * This method is used to decrement the counter.
   *
   * @return Object of FibonacciCounter
   */
  public FibonacciCounter decrementCounter() {

    if (this.counter > 1) {
      this.counter = this.counter - 1;
    } else {
      throw new IllegalStateException("the counter cannot be less than 1");
    }

    return this;
  }


  /**
   * This method is used to get the current count of Fibonacci counter.
   *
   * @return the current count of Fibonacci counter.
   */
  public Integer currentCounter() {
    return this.counter;
  }


  /**
   * This method is used to get the Fibonacci number for the corresponding current count.
   *
   * @return the Fibonacci number for the corresponding current count
   */
  public Integer fibonacci() {

    Integer number = this.counter - 1;
    Integer result = fibonacci(number);
    if (result > Integer.MAX_VALUE || result < 0) {
      throw new IllegalStateException("Fibonacci number generated is out of range!!");
    }


    return result;

  }

  /**
   * Actual implementation to generate Fibonacci numbers.
   *
   * @param number for which fibonacci number is calculated.
   * @return the Fibonacci number for the corresponding current count
   */
  private Integer fibonacci(Integer number) {

    if (number <= 1) {
      return number;
    }

    Integer res1 = fibonacci(number - 1);

    if (res1 > Integer.MAX_VALUE || res1 < 0) {
      throw new IllegalStateException("Fibonacci number generated is out of range!!");
    }

    Integer res2 = fibonacci(number - 2);

    if (res2 > Integer.MAX_VALUE || res2 < 0) {
      throw new IllegalStateException("Fibonacci number generated is out of range!!");
    }

    Integer result = res1 + res2;

    return result;

  }


}
