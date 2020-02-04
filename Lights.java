public class Lights extends TreeDecorator {
  ChristmasTree tree;
  
  //lights constructor, defines the tree for the class
  public Lights(ChristmasTree tree) {
    this.tree = tree;
  }
  
  //returns the correct description with decorations added on
  public String toString() {
    return tree.toString()+" + strings of lights";
  }
  
  //returns the total cost of the tree along with cost of the lights
  public double getCost() {
    return tree.getCost() + 2.0;
  }
}