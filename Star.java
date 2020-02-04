public class Star extends TreeDecorator {
  ChristmasTree tree;
  
  //Constructor for the Star type, defines the tree for this class
  public Star(ChristmasTree tree) {
    this.tree = tree;
  }
  
  //returns the description with the additional star message
  public String toString() {
    return tree.toString()+" + a star on top";
  }
  
  //adds the cost of the star to the tree and returns the value
  public double getCost() {
    return tree.getCost()+6.0;
  }
}