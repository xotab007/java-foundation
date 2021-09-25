package javafoundation.section_3;

public class TestShape {
    public static void main(String[] args) {
        Circle s1 = new Circle("red", false, 7);
        System.out.println(s1.toString());
        System.out.println(s1.getColor());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());

        Circle c2 = new Circle("Green",false, 5);
        System.out.println(c2.getRadius());

        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);

        point.moveUp();
        point.moveLeft();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1,1,1,1,2);
        circle.moveUp();
        System.out.println(circle);
    }
}
