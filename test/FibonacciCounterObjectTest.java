import org.junit.Before;
import org.junit.Test;

import fib.FibonacciCounterObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FibonacciCounterObjectTest {

  FibonacciCounterObject fbo;

  /**
   * This method is used to create a new object of Fibonacci Counter.
   */
  @Before
  public void setUp() {
    fbo = new FibonacciCounterObject();
  }

  /**
   * This Test method is used to check the upper bound of the counter.
   */
  @Test
  public void incrementTest() {


    try {

      for (int i = 0; i < Integer.MAX_VALUE; i++) {
        fbo.incrementCounter();
      }

      fail();

    } catch (Exception e) {
      assertEquals(e.getMessage(), "the counter cannot be increased!!");
    }


  }

  /**
   * This method tests the lower bound of counter.
   */
  @Test
  public void counterLessThanInitializedValueTest() {

    try {
      for (int i = 0; i < 45; i++) {

        fbo.incrementCounter();


      }

      for (int i = 0; i < 47; i++) {

        fbo.decrementCounter();


      }


      fail();
    } catch (Exception e) {
      assertEquals(e.getMessage(), "the counter cannot be less than 1");
    }

  }

  /**
   * This method tests the normal execution of the program.
   */
  @Test
  public void NormalTest() {

    for (int i = 0; i < 12; i++) {
      fbo.incrementCounter();
    }

    assertEquals(new Integer(144), fbo.fibonacci());


  }

  /**
   * This method tests the upper bound of the Fibonacci number generated.
   */
  @Test
  public void fibonacciGeneratedIsOutOfRangeTest() {


    for (int i = 0; i < 145; i++) {

      fbo.incrementCounter();


    }

    try {

      fbo.fibonacci();
      fail();
    } catch (Exception e) {
      assertEquals(e.getMessage(), "Fibonacci number generated is out of range!!");
    }


  }


  /**
   * This method tests the normal execution of program while the counter is decreasing.
   */
  @Test
  public void DecrementCounterValueTest() {


    for (int i = 0; i < 45; i++) {

      fbo.incrementCounter();


    }

    fbo.decrementCounter();
    fbo.decrementCounter();
    fbo.decrementCounter();
    fbo.decrementCounter();
    fbo.decrementCounter();

    assertEquals(new Integer(102334155), fbo.fibonacci());

  }

  /**
   * This method tests the value of counter.
   */
  @Test
  public void counterValueTest() {


    assertEquals(new Integer(1), fbo.currentCounter());

    for (int i = 0; i < 9; i++) {
      fbo.incrementCounter();
    }
    assertEquals(new Integer(10), fbo.currentCounter());

    for (int i = 0; i < 9; i++) {
      fbo.decrementCounter();
    }
    assertEquals(new Integer(1), fbo.currentCounter());

    for (int i = 0; i < Integer.MAX_VALUE - 1; i++) {
      fbo.incrementCounter();
    }
    assertEquals(new Integer(Integer.MAX_VALUE), fbo.currentCounter());


  }


}