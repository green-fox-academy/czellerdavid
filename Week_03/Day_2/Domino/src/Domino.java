public class Domino {

  public int front;
  public int end;
  public boolean isReversed;

  //2 number on the dominoes is Front and the End now
  public Domino(int front, int end){

    this.front = front;
    this.end = end;
    isReversed = false;
  }
//check if the next numbers front or the back is matching with the previous number
  public boolean isItAMatch (int number){
    if(front == number){
      return true;
    }
    if (end == number){
      return true;
    }
  return false;
  }
  public String toString (){
    if(isReversed){
      return "["+ end + "|" + front +"]";
    }
    return "["+ front + "|" + end +"]";
  }
}
