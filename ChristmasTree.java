public abstract class ChristmasTree {
  protected String description;
  
  //Returns the description of the tree
  public String toString() {
    return description;
  }
  
  //abstract method to be used by all classes extending christmas tree
  public abstract double getCost();
}
