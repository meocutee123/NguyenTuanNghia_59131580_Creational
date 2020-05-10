package TapTap3;

public class Triangle extends shape{
    private static shape triangle;

    protected Triangle(String brush, String frame, String paper){
        super(brush, paper, frame);
    }
    public static shape createTriangle(){
        if(triangle == null){
            triangle = new Triangle("Brush-A", "Paper-A", "Frame-A");
        }
        return triangle;
    }

    @Override
    public String draw(){
        return "Draw triangle: " + getBrush()+ " " + getPaper()+ " " + getFrame();
    }
}