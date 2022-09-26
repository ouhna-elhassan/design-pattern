import java.util.Vector;
import java.util.concurrent.Semaphore;
public class PClient extends Thread {

    //Semaphore sem = new Semaphore(1);
    public boolean thaat = true;
    private String name;

    //public Semaphore mutex = new Semaphore(1);
    //constructeur
    public PClient(String name){
        this.name = name;
    }

    //getter


    //setter

    public static void main(String[] args) {
        PClient client1 = new PClient("client1");
        PClient client2 = new PClient("client2");

        client1.start();

        while(client1.isAlive()) {
            System.out.println("Waiting for client1...");
        }
        client2.start();
        while(client2.isAlive()) {
            System.out.println("Waiting for client2...");
        }

    }

    public void run() {
        Terre.createEarth(3,4);
    }
}
