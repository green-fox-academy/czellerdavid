import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci f = new Fibonacci();

  @Test
  public void testPrintMessage() {
    assertEquals(296, f.fib(10));
  }

}