package observer;

public interface Subject {
    void agregarListener(Listener listener);
    void quitarListener(Listener listener);
    void notificarListeners(String nuevoColor);
}
