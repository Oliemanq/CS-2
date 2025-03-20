public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape c = new Circle();
        c = sf.createShape("Circle");

        Shape s = new Square();
        s = sf.createShape("Square");

        c.drawShape();
        s.drawShape();



    }
}

