package com.hua.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServer {
    static final String FUCK_OFF = "fuck off";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("Server waiting client connection");
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        while (true) {

            String received = dataInputStream.readUTF();
            if (received.equals(FUCK_OFF)) {
                break;
            }
            System.out.println("Client: " + received);
            String sent = new Scanner(System.in).nextLine();
            if (sent.equals(FUCK_OFF)) {
                break;
            }
            dataOutputStream.writeUTF(sent);
            dataOutputStream.flush();

        }
        dataInputStream.close();
        dataOutputStream.close();

        socket.close();
        serverSocket.close();
    }
}
