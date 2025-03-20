public class ShapeFactory {
    public Shape createShape(String shapeType) {
        switch (shapeType) {
            case ("Circle"):
                return new Circle();
            case ("Square"):
                return new Square();
            default:
                return null;
        }
    }
}
