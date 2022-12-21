package servidor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
/**
 *
 * @author arturbrennerweber
 */
public class Envio implements Runnable{
    Socket Cliente;
    ArrayList<String> itensEnviar;
    String enviado = "";
    String envia = "";
    
    Envio(Socket Cliente, ArrayList<String> itensEnviar) {
        this.Cliente = Cliente;
        this.itensEnviar = itensEnviar;
    }
    
    @Override
    public void run() {
        try {
            PrintWriter enviar = new PrintWriter(new OutputStreamWriter(Cliente.getOutputStream()));
            while (enviado.compareTo("CAMBIO") != 0) {
                envia = itensEnviar.get(itensEnviar.size() - 1);
                if (!(envia.equals("") || envia.equals(enviado))) {
                    enviar.println(envia);
                    enviar.flush();
                    enviado = envia;
                }
                
                Thread.sleep(2000);
            }
            enviar.close();
            
        } catch(IOException | InterruptedException e) {
            System.exit(1);
        }
    }
}
