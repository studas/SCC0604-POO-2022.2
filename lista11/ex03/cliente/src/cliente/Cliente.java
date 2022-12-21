package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {
        
        //Agora quem envia mensagens digitadas é o cliente, e o servidor as repete de volta!
        
        System.out.println("Agora quem envia mensagens digitadas é o cliente, e o servidor as repete de volta!");
        System.out.println("Caso a primeira mensagem não seja a certa, o cliente para de enviar mensagens!");
        System.out.println("Para parar de enviar mensagens, digite 'Cambio'.");
            
        try {
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);

            PrintWriter ENVIA = new PrintWriter(CLIENTE_SOCKET.getOutputStream(), true);
            
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));

            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String userInput = "";
            
            boolean firstInteraction = true;
            
            userInput = LEITOR_ENTRADA_PADRAO.readLine();
            ENVIA.println(userInput);                
            System.out.println(RECEBE.readLine());  
            
            if((firstInteraction == true) && (userInput.compareTo("POO") == 0)){
                
                firstInteraction = false;
                
                while(userInput.compareTo("Cambio") != 0){

                    userInput = LEITOR_ENTRADA_PADRAO.readLine();
                    ENVIA.println(userInput);                
                    System.out.println(RECEBE.readLine());                         
                }
            }

            ENVIA.close();
            RECEBE.close();
            LEITOR_ENTRADA_PADRAO.close();
            CLIENTE_SOCKET.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Agora quem envia mensagens digitadas é o servidor!");
        
        //Agora quem envia mensagens digitadas é o servidor!
        try {
            
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);
            
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
                   
            String userOut = "";
            
            while(userOut.compareTo("Cambio") != 0){
                userOut = RECEBE.readLine();
                System.out.println(userOut);                         
            }
            
            RECEBE.close();
            CLIENTE_SOCKET.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
