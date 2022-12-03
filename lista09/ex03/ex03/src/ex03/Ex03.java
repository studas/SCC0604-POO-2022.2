package ex03;
import java.io.*;

public class Ex03 {

    public static void main(String[] args) {
        try{
            try{
                
                FileReader reader = new FileReader("PATH/FILE");
                LineNumberReader lineNumberReader = new LineNumberReader(reader);

                String data = lineNumberReader.readLine();
                int lineNumber = 0;

                while(data != null && lineNumber != 10){

                    data = lineNumberReader.readLine();
                    lineNumber = lineNumberReader.getLineNumber();
                    if(data == null){
                        System.out.println("Esse arquivo não possui 10 linhas!");
                    }else if(lineNumber == 10){
                        System.out.println("A linha 10 foi lida agora!");
                    }
                }

                lineNumberReader.close();
            
            }catch(FileNotFoundException ex){
                System.out.println("Arquivo inexistente!");
            }
        }catch(Exception ex){
            System.out.println("ERRO!");
        }
    }
}
