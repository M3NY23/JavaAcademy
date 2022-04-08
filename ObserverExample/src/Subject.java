public interface Subject {
    void register(Observer observer);
    void ungister(Observer observer);
    void notifyObserver();
}
