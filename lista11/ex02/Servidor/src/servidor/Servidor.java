package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
/**
 *
 * @author arturbrennerweber
 */
public class Servidor {

    public static void main(String[] args) {
        ArrayList<String> itensEnviar = new ArrayList();
        itensEnviar.add("");
        
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            
            //Cria uma thread para cada cliente
            Thread entrada = new Thread(new Entrada(OUVIDO, itensEnviar));
            entrada.start();
            
            while(true) {
                //Inicializa conexao com os clientes
                Socket Clientes = OUVIDO.accept();
                Thread Cliente = new Thread(new Envio(Clientes, itensEnviar));
                Cliente.start();
            }
        //Caso dê errado, imprime erro
        } catch(IOException e) {
            System.exit(1);
        }
    }
    
}
