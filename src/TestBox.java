public class TestBox {
  public static void main(String[] args) {
    System.out.println("\n >>>Formatting 1<<< \n");
    RectangleCons a = new RectangleCons();
    a.displayDetail();

    a = new Box(5, 10, 15);
    a.name = "My Box";
    a.displayDetail();

    System.out.println("\n >>>Formatting 2<<< \n");

    Box b = new Box();
    b.setSize(2, 4, 6);
    b.displayDetail();

    System.out.println("\n >>>Formatting 3<<< \n");

    Box c = new Box(10, 20, 2.5);
    c.name = "Box Box";
    c.displayDetail();

  }
}