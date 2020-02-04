public class Tinsel extends TreeDecorator {
  ChristmasTree tree;
  
  //Tinsel constructor that defines the tree used for methods in the class
  public Tinsel(ChristmasTree tree) {
    this.tree = tree;
  }
  
  //adds the aditional tinsel message and returns the new string
  public String toString() {
    return tree.toString()+" + tinsel all around";
  }
  
  //returns total cost of the tree and tinsel
  public double getCost() {
    return tree.getCost() + 2.0;
  }
}