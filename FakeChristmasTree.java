public class FakeChristmasTree extends ChristmasTree {
  
  //Fake christmas tree constructor that sets the correct description
  public FakeChristmasTree() {
    this.description = "Artificial Christmas Tree";
  }
  
  //Returns the cost of the fake christmas tree
  public double getCost() {
    return 50.0;
  }
}