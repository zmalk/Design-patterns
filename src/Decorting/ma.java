package Decorting;

public class ma {
    public static void main(String[] args) {
        Shape s1=new Circle();
        RedShapeDecoretor r= new RedShapeDecoretor(s1);
        r.draw();
    }
}
