package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author arturbrennerweber
 */
public class Entrada implements Runnable{
    ServerSocket OUVIDO;
    ArrayList<String> itensEnviar;
    
    Entrada(ServerSocket OUVIDO, ArrayList<String> itensEnviar) {
        this.OUVIDO = OUVIDO;
        this.itensEnviar = itensEnviar;
    }
    
    @Override
    public void run() {
        //Recebe mensagens do teclado
        BufferedReader RECEBE = new BufferedReader(new InputStreamReader(System.in));
        String mensagem = "";
        
        try {
            while (mensagem.compareTo("CAMBIO") != 0) {
                mensagem = RECEBE.readLine();
                itensEnviar.add(mensagem);
            }
            
            System.out.println("Fim do envio");
            Thread.sleep(2000);
            OUVIDO.close();
            System.exit(0);
         //erro   
        } catch(IOException | InterruptedException e) {
            System.exit(1);
        }
    }
}
