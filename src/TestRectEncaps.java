public class TestRectEncaps {
    public static void main(String[] args) {
        RectangleEncaps rect = new RectangleEncaps();
        rect.setWidth(100);
        rect.setHeigth(50);
        rect.name = "Rect 1";

        System.out.println("Object name : " + rect.name);
        System.out.println("W = " + rect.getWidth() + " || H = " + rect.getHeigth());
        System.out.println("Area = " + rect.computerArea());
    }
}
