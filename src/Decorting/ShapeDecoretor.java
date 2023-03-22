package Decorting;

public abstract class ShapeDecoretor implements Shape{
    Shape shape;
    public ShapeDecoretor(Shape shape){
        this.shape=shape;
    }
    @Override
    public void  draw() {
        shape.draw();
    }
}
