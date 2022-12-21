package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author coveiro
 */
public class ChatController implements Initializable {
    
    @FXML
    private Label chat;
    
    @FXML
    private Label description;
    
    @FXML
    private TextField text_field;
    
    static private Socket comun_socket;
    
    static private ServerSocket comun_ssocket;
    
    static private PrintWriter print_writer;
    
    static private BufferedReader buffered_reader;
    
    static private BufferedReader buffered_reader_std;
    
    static boolean isServer;
    
    @FXML
    private void sendMessage(ActionEvent event) throws IOException {
        String answer = buffered_reader_std.readLine(); // Le
        String userInput = text_field.getText();
        print_writer.println(userInput);            // Escreve     
        chat.setText("Answer: "+ answer);               // Envia
        // Usuario espera ate enviar de novo
    }
    
    public static void setComunSocket(Socket comun_socket) {
        ChatController.comun_socket = comun_socket;
    }
    
    public static void setComunServerSocket(ServerSocket comun_ssocket) {
        ChatController.comun_ssocket = comun_ssocket;
    }
    
    public static void setPrintWriter(PrintWriter print_writer) {
        ChatController.print_writer = print_writer;
    }
    
    public static void setBufferedReader(BufferedReader buffered_reader) {
        ChatController.buffered_reader = buffered_reader;
    }
    
    public static void setBufferedReaderStd(BufferedReader buffered_reader) {
        ChatController.buffered_reader_std = buffered_reader;
    }
    
    public static void setIsServer(boolean isServer) {
        ChatController.isServer = isServer;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
