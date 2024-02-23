public class Box extends RectangleCons {
  private double depth;

  public Box() {
    super.name = "This is Box";
    this.depth = 1.0;
  }

  public Box(double width, double height, double depth) {
    super(width, height);
    this.depth = depth;
  }

  public void setDepth(double depth) {
    if (depth == 0)
      this.depth = 1.0;
    else
      this.depth = Math.abs(depth);
  }

  public double getDepth() {
    return this.depth;
  }

  public void setSize(double width, double height, double depth) {
    super.setSize(width, height);
    this.setDepth(depth);
  }

  public double computeVolume() {
    return this.computeArea() * this.depth;
  }

  public void displayDetail() // Overriding Method
  { 
    System.out.println("===== Class Box =====");
    System.out.println("name : " + super.name);
    System.out.println("Width   : " + super.getWidth());
    System.out.println("Height  : " + super.getHeight());
    System.out.println("Depth   : " + this.getDepth());
    System.out.println("Volume : " + this.computeVolume());
  }

}