public class RectangleEncaps {
    private double width;
    private double height;
    String name;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeigth() {
        return this.height;
    }

    public double computerArea() {
        return this.width * this.height;
    }
}
