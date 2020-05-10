package TapTap3;

public class Rectangle extends shape{
    private static shape rectangle;

    protected Rectangle(String brush, String frame, String paper){
        super(brush, paper, frame);
    }
    public static shape createRectangle(){
        if(rectangle == null){
            rectangle = new Rectangle("Brush-u", "Paper-u", "Frame-u");
        }
        return rectangle;
    }

    @Override
    public String draw(){
        return "Draw rectangle: " + getBrush() + " " + getPaper() + " " + getFrame();
    }
}