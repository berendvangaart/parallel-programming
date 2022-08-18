public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
