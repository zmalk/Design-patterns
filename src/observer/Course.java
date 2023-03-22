package observer;

import java.util.List;

public class Course implements Subject{
    List<Observer> observerlist;
    String name;
    String avalibility;

    public Course (String name){
        this.name=name;
    }

    @Override
    public void subscripe(Observer observer) {
        observerlist.add(observer);
    }

    @Override
    public void unsubscripe(Observer observer) {
    observerlist.remove(observer);
    }

    @Override
    public void notifyall() {
        for (Observer observer:observerlist){
            observer.update(avalibility);
        }

    }

  void setAvalibility(Boolean avail) {
        avalibility = this.name+(avail?"available":"NotAvailable");
        notifyall();
    }
}
