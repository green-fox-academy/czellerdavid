import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  Apple a = new Apple();

  @Test
  public void testPrintMessage() {
    assertEquals("Apple", a.getApple());
  }
}