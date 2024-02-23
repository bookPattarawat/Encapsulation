public class TestReact {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 100;
        rect.height = 50;
        rect.name = "Rect 1";

        System.out.println("W = " + rect.width + " || H = " + rect.height);
        System.out.println("Name : " + rect.name);
        System.out.println("Area = " + rect.computerArea());
    }
}
