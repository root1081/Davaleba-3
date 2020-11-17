package ge.edu.btu.chat.client;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket;
        ClientThread clientThread;
        int message = 0;

        socket = new Socket("localhost", 9010);
        System.out.println("მიმდინარეობს კავშირის დამყარება ...");

        while(true) {
            System.out.println(": " );
            clientThread = new ClientThread(socket);
            clientThread.start();
            clientThread.join();
            message++;
        }
    }
}
