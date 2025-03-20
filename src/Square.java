public class Square implements Shape{
    public String type = "Square";
    public double sideLength = 5.0;
    public int corners = 4;
    public double xPos;
    public double yPos;

    public void drawShape(){
        System.out.println("Draw Square with " + corners + " corners, a side length of " + sideLength + " at " + xPos + "," + yPos);
    }

}
