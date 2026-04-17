public interface Listener {

    void onEvent(Integer number);
    String getListenerName();
    void stop();
}
