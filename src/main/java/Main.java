
public class Main {
    public static void main(String[] args) {
         Resource res = new Resource();
         ThreadIncrement inc = new ThreadIncrement(res);
         ThreadDecrement dec = new ThreadDecrement(res);
         new Thread(inc).start();
         new Thread(dec).start();
    }
}
