package javafoundation.section_3;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide (){
        return super.getLength();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                ", side=" + this.getSide() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
