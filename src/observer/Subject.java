package observer;

public interface Subject {
    void subscripe (Observer observer);
    void unsubscripe(Observer observer);
    void notifyall();
}
