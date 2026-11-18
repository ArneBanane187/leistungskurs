package blatt41.aufgabe02;

import java.net.Socket;

public class MainClient {

    public static void main(String[] args) {

        try{
            FirstClient client = new FirstClient("10.8.196.142", 6776);
            Socket socket = client.connect();
            client.communicate(socket);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
