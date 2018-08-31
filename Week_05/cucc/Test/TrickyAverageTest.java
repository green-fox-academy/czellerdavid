import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrickyAverageTest {


  int[] number = {5, 2, 8, -1};

  @Test
  public void getTrickyAvg() {

    System.out.println(TrickyAverage.getTrickyAvg(number));
    assertEquals(3.5, TrickyAverage.getTrickyAvg(number), 0);
  }

  @Test
  public void maxAndEven() {

    System.out.println(TrickyAverage.maxAndEven(number));
    assertEquals(8, TrickyAverage.maxAndEven(number), 0);
  }

  @Test
  public void minAndOdd() {

    System.out.println(TrickyAverage.minAndOdd(number));
    assertEquals(-1, TrickyAverage.minAndOdd(number), 0);

  }
}