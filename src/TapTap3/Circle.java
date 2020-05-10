package TapTap3;

public class Circle extends shape{
    private static shape circle;

    protected Circle(String brush, String frame, String paper){
        super(brush, paper, frame);
    }
    public static shape createCircle(){
        if(circle == null){
            circle = new Circle("Brush-O", "Paper-O", "Frame-O");
        }
        return circle;
    }

    @Override
    public String draw(){
        return "Draw circle: " + getBrush()+ " " + getPaper()+ " " + getFrame();
    }
}