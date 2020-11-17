package ge.edu.btu.chat.server;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket;
        Socket socket;
        int clientId = 0;

        ServerThread serverThread;

        serverSocket = new ServerSocket(9010);
        System.out.println("სერვერი ჩაირთო! ");
        socket = serverSocket.accept();
        try {
            while (true) {
                serverThread = new ServerThread(socket);
                serverThread.start();
                serverThread.join();
                child++;
            }
        }
        catch (Exception e){
            System.out.println("დაფიქსირდა შეცდომა " + e);
        }
    }
}
