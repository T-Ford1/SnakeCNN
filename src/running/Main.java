
package running;

public class Main {

    public static void main(String[] args) {
        Runner r = new Runner();
        r.start();
        while(r.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println(Runner.MAP.score());
        System.exit(0);
    }
}