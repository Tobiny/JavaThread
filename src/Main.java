public class Main {
    public static void main(String[] args) {
        Thread pairNumbersThread = new Thread(new Pairs());
        Thread oddNumbersThread = new Thread(new Odds());
        oddNumbersThread.start();
        pairNumbersThread.start();
    }
}
