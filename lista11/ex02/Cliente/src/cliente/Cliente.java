package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author arturbrennerweber
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tenta criar conexao e receber mensagens 
        try {
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
            String mensagem = "";
            
            //Enquanto nao receber uma finalizacao "CAMBIO", aceita input
            while (mensagem.compareTo("CAMBIO") != 0) {
                mensagem = RECEBE.readLine();
                System.out.println("Mensagem recebida do servidor: " + mensagem);
            }

            RECEBE.close(); 
            CLIENTE_SOCKET.close();
        }
        //Se nao conseguir imprime o erro
        catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    
    }
    
}






