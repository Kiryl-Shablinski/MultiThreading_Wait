public class ThreadIncrement implements Runnable{
    Resource res;

    public ThreadIncrement(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            res.incr();
        }
    }
}
