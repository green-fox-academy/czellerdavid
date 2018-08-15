public class Domino {

  public int front;
  public int end;
  public boolean isReversed;

  public Domino(int front, int end){

    this.front = front;
    this.end = end;
    isReversed = false;
  }

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
