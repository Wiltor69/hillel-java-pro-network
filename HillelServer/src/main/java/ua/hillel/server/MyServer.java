package ua.hillel.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class MyServer implements AutoCloseable {
    private ServerSocket serverSocket;

    public MyServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        while (true) {
            try (Socket socket = serverSocket.accept()) {
                try (OutputStream outputStream = socket.getOutputStream();
                     PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream));
                ) {
                    writer.println("Echo response " + LocalDateTime.now());
                    writer.flush();
                }
                System.out.println();
            }
        }

    }

    @Override
    public void close() throws Exception {
        if (serverSocket.isClosed()) {
            return;
        }
        serverSocket.close();
    }
}
