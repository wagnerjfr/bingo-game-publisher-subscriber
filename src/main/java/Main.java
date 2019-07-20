public class Main {

    public static void main(String args[]) {
        Caller caller = new Caller();

        new Thread(new Player("Mary", caller)).start();
        new Thread(new Player("John", caller)).start();
        new Thread(new Player("Mark", caller)).start();
        new Thread(new Player("Ana", caller)).start();
        new Thread(new Player("Paul", caller)).start();

        new Thread(caller).start();
    }
}
