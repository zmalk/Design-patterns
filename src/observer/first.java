package observer;

public class first {

    public static void main(String[] args) {
        Student ahmed=new Student("ahmed");
        Student Ali=new Student("Ali");

        Course web=new Course("web");
        web.subscripe(ahmed);
        web.subscripe(Ali);
        web.unsubscripe(Ali);
        web.notifyall();
        web.setAvalibility(true);
    }
}
