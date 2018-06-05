package nio.demo1;


public class TestReactor {

    public static void main(String[] args) {
        Thread server = new Thread(new Reactor());
        server.start();

        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}