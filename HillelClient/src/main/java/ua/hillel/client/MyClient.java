package ua.hillel.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient implements AutoCloseable {
    private Socket socket;

    public MyClient(String host, int port) throws IOException {
        socket = new Socket(host, port);

        try (InputStream inputStream = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        ) {


            String response = reader.readLine();
            System.out.println(response);

        }
    }


    @Override
    public void close() throws Exception {

            if (socket.isClosed()) {
                return;
            }
            socket.close();
        }
    }





