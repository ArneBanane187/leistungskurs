package blatt41.aufgabe02;

import blatt41.aufgabe01.Nachricht;

import java.io.*;
import java.net.*;

public class FirstClient {

    public Nachricht nachricht = new Nachricht();
    private String host;
    private int port;

    public FirstClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }


    public Socket connect() throws IOException {
        return new Socket(host, port);
    }


    public void sendMessage(Socket socket, Nachricht nachricht)
            throws IOException {
        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
        out.println(nachricht.prepareMessage());
    }


    public Nachricht receiveMessage(Socket socket)
            throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        String text = in.readLine();
        if (text == null) {
            return null;
        }
        Nachricht nachricht = new Nachricht();
        if (Nachricht.isValid(text)) {
            nachricht.setMessage(text);
            return nachricht;
        }
        return null;
    }


    public void communicate(Socket socket) throws IOException {

        sendMessage(socket,
                new Nachricht("GREI", " Hallo"));

        Nachricht nachricht = receiveMessage(socket);
        System.out.println("Server: "
                + nachricht.getProtokoll()
                + nachricht.getNachricht());

        BufferedReader console =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Eingabe: ");
        String eingabe = console.readLine();
        sendMessage(socket,
                new Nachricht("ANSI ", eingabe));

        nachricht = receiveMessage(socket);
        System.out.println("Server: "
                + nachricht.getProtokoll()
                + nachricht.getNachricht());
        socket.close();
    }
}
