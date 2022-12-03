package usp.ex04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Matheus Cirillo (matheuscirillo@usp.br) - 12547750
 * @version 1.0
 */
public class Ex04 {

    public static void main(String[] args) throws IOException {
        String nome = "Matheus Cirillo";
        byte[] byteArray = nome.getBytes();
        
        File tmpFolder = new File(System.getProperty("java.io.tmpdir")); 
        File outputFile = new File(tmpFolder, "out.bin");
        outputFile.createNewFile(); //esse arquivo será criado no diretorio "/tmp" no computador do usuário
        
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            outputStream.write(byteArray);
        }
        //out.bin foi adicionado junto com a saída do exercicio para mostrar que funciona
    }
}
