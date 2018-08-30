import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrickyAverageTest {



  int[] lofasz = {5, 2, 8, -1};

  @Test
  public void getTrickyAvg() {

    System.out.println(lofasz);
    assertEquals(3.5, TrickyAverage.getTrickyAvg(lofasz), 0);
  }
  @Test
  public void maxAndEven(){

  }

  @Test
  public void minAndOdd(){

  }
}