package lab8;

public class Triangle extends GraphicObject {

    private  double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void findArea() {
        double area=05.*width*height;
        System.out.println("The area of triangle with width"+width+"and height+"+area);

    }
    //getter and setter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
