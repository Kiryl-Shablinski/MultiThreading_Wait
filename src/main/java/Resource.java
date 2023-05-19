public class Resource {
    private  int n = 0;

    private static  boolean added = false;

    public synchronized void incr(){
        if (!added) {
            n += 10;
            System.out.println("Число увеличено на 10: " + n);
            added = true;
            notify();
        }
        try {
            wait(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void decr(){
        if (added){
            n -= 5;
            System.out.println("Число уменьшено на 5: " + n);
            added = false;
            notify();
        }
        try {
            wait(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
