package ua.hillel.chat;

public interface ChatConnectionListener {

    void onConnect(ChatConnection connection);
    void onMessage(ChatConnection connection, String message);
    void onDisconnect(ChatConnection connection);
}
