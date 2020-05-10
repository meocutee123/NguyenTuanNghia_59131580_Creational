package TapTap3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        shape u = sf.createShape(ShapeType.Rectangle);
        shape o = sf.createShape(ShapeType.Circle);
        shape A = sf.createShape(ShapeType.Triangle);

        System.out.println(u.draw());
        System.out.println(o.draw());
        System.out.println(A.draw());

        shape u2 = sf.createShape(ShapeType.Rectangle);
        
        System.out.println(u2.draw());
    }
}