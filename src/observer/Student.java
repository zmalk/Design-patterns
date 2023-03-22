package observer;

public class Student implements Observer{
    private  String name;
    public Student(String name){
        this.name=name;
    }
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
