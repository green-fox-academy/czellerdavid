import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {

  @Test
  public void returnMinusOne(){
    List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList());
    Assert.assertEquals(-1,GetIndex.getIndex(1,listOfNumbers));
  }

  @Test
  public void returnOne(){
    List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,7777));
    Assert.assertEquals(5,GetIndex.getIndex(7777,listOfNumbers));
  }

}