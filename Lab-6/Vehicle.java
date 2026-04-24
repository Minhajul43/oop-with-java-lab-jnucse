public class Vehicle{
  int x, y;
Vehicle (){
  this.x =0;
  this.y =0;
}
  void moveUp(){
    y=y+1;
  }
  void moveDown(){
    y=y-1;
  }
  void moveLeft(){
    x=x-1;
  }
  void moveRight(){
    x=x+1;
  }
  public String toString(){
    return "("+x+","+y+")";
  }
}
