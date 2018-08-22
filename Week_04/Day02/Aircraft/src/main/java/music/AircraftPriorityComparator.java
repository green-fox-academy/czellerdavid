package main.java.music;

import java.util.Comparator;

public class AircraftPriorityComparator implements Comparator<Aircraft> {

  @Override
  public int compare(Aircraft o1, Aircraft o2) {
   if(o1.isPriority && o2.isPriority){
     return 0;
    }
    if(o1.isPriority == false && o2.isPriority == true){
      return -1;
    }
    return 1;
  }
}
