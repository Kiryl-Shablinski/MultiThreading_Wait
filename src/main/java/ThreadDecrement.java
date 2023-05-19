public class ThreadDecrement implements Runnable{
    Resource res;

    public ThreadDecrement(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            res.decr();
        }
    }
}
