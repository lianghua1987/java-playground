package com.hua.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static com.hua.socket.TestServer.FUCK_OFF;

public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9000);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        while(true){
            String sent = new Scanner(System.in).nextLine();
            dataOutputStream.writeUTF(sent);
            dataOutputStream.flush();
            if (sent.equals(FUCK_OFF)) {
                break;
            }
            String received = dataInputStream.readUTF();
            if(received.equals(FUCK_OFF)){
                break;
            }

            System.out.println("Server: " + received);
        }
        dataOutputStream.close();
        dataInputStream.close();
        socket.close();
    }
}
