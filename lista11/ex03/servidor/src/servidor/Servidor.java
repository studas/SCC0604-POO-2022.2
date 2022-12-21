package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        
        //recebe do cliente
        
        System.out.println("Agora quem envia mensagens digitadas é o cliente, e o servidor as repete de volta!");
        
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();

            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVIDOR_SOCKET.getInputStream()));
            PrintWriter ENVIA = new PrintWriter( new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream()));
            String str = "";
            
            
            
            boolean firstInteraction = true;
            
            str = RECEBE.readLine();
            ENVIA.println("O servidor repete: \"" + str + "\"");
            ENVIA.flush();
            
            if((firstInteraction == true) && (str.compareTo("POO") == 0)){
                
                firstInteraction = false;
                
                while(str.compareTo("Cambio") != 0){

                    str = RECEBE.readLine();

                    ENVIA.println("O servidor repete: \"" + str + "\"");
                    ENVIA.flush();
                }
            }

            RECEBE.close();
            ENVIA.close();
            SERVIDOR_SOCKET.close();
            OUVIDO.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Agora quem envia mensagens digitadas é o servidor!");
        System.out.println("Para parar de enviar mensagens, digite 'Cambio'.");
        
        //Agora quem envia mensagens digitadas é o servidor!
        try {
            
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();
            
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            
            PrintWriter ENVIA = new PrintWriter( new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream()));
            String str = "";
                       
            while(str.compareTo("Cambio") != 0){
            
                str = LEITOR_ENTRADA_PADRAO.readLine();
                ENVIA.println(str);
                ENVIA.flush();
        
            }

            ENVIA.close();
            SERVIDOR_SOCKET.close();
            OUVIDO.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}
