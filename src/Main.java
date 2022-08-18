public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();


        Multi m1 = new Multi(c);
        Multi m2 = new Multi(c);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The count is: " + c.getCount());

//            t.join(); // waits for other thread to die
    }


}
