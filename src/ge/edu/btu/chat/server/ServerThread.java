package ge.edu.btu.chat.server;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket client;
    private boolean running = true;

    public ServerThread(Socket client){
        this.client = client;
    }

    @Override
    public void run(){
        try {
            //client = serverSocket.accept();
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
            String str = (String) objectInputStream.readObject();
            System.out.println(": "+str);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("მოხდა შეცდომა " +e);
        }
    }
}
