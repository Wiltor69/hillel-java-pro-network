package ua.hillel;

import ua.hillel.client.MyClient;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws Exception {

        DatagramSocket localhost = new DatagramSocket(8000, InetAddress.getByName("localhost"));
        try (MyClient myClient = new MyClient("localhost", 8080)) {

            System.out.println();

        }

        System.out.println("Hello world!");
    }
}