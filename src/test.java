import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Thread receiver = new Thread() {
            public void run() {
                System.out.print("receiver ");
            }
        };
        Thread transmission = new Thread() {
            public void run() {
                System.out.print("transmission ");
            }
        };
        receiver.start();
        receiver.sleep(5000);
        transmission.start();
        transmission.sleep(5000);
        System.out.println("main ");
    }
}
