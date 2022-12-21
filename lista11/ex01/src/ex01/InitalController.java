package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author coveiro
 */
public class InitalController implements Initializable {
    private Stage stage;
    
    @FXML
    private Label ip;
    
    @FXML
    private Label choose;
    
    @FXML
    private TextField textfield;
    
    @FXML
    private Button connect;
    
    @FXML
    private Button setClieht;
    
     @FXML
    private Button setServer;
     
    private boolean isServer;
    
    private String adr;
    
    @FXML
    private void setAsServer(ActionEvent event) {
        this.isServer = true;
        System.out.println("yes yes yes");
    }
    
    @FXML
    private void setAsClient(ActionEvent event) {
        this.isServer = false;
        System.out.println("nono");
    }
    
    @FXML
    private void setIp(ActionEvent event) {
        this.adr = new String(this.textfield.getText());
    }
    
    @FXML
    private void connect(ActionEvent event) throws IOException {
        if(this.isServer) {
            System.out.println("teste");
            ServerSocket ssocket = new ServerSocket(8007);
            Socket socket =  ssocket.accept();
            System.out.println("fdfdasg");
            ChatController.setComunServerSocket(ssocket);
            ChatController.setComunSocket(socket);
            ChatController.setBufferedReader(new BufferedReader(
                        new InputStreamReader(
                                   socket.getInputStream())));
            ChatController.setPrintWriter( new PrintWriter(
                    new OutputStreamWriter(
                                   socket.getOutputStream())));
        } else {
            
            Socket socket = new Socket(this.adr, 8007);
            ChatController.setComunSocket(socket);
            ChatController.setBufferedReader(new BufferedReader(
                    new InputStreamReader(
                             socket.getInputStream())));

            ChatController.setBufferedReaderStd( new BufferedReader(
	                                                  new InputStreamReader(System.in)));
            ChatController.setPrintWriter(new PrintWriter(
                    new OutputStreamWriter(
                                   socket.getOutputStream())));
        }
        Parent root = FXMLLoader.load(getClass().getResource("Chat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
