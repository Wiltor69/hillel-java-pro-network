package ua.hillel;

import ua.hillel.server.MyServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
try(MyServer myServer = new MyServer(8080)){

} catch (IOException e) {
    throw new RuntimeException(e);
} catch (Exception e) {
    throw new RuntimeException(e);
}
        System.out.println("Hello Server!");
    }
}
