interface Publisher {

    void subscribe(Listener listener);
    void unsubscribe(Listener listener);
    void inform(Listener listener);
}
