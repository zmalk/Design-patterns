package Decorting;

public class RedShapeDecoretor extends ShapeDecoretor {
    public RedShapeDecoretor(Shape shape) {
        super(shape);
    }
    public void  draw() {
        shape.draw();
        setBorder(shape);
    }
    public void setBorder(Shape shape){
        System.out.println("borer set");
    }

}
