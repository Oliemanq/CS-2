public class Circle implements Shape {
    public String type = "Circle";
    public double radius = 5.0;
    public double xPos;
    public double yPos;

    public void drawShape(){
        System.out.println("Draw circle with radius " + radius + " at " + xPos + "," + yPos);
    }
}
