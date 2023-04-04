package fortheTest.observe;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObservers(Observer observer);
    public void notifyObservers();
}
