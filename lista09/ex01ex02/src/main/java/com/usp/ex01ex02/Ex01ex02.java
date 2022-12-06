package com.usp.ex01ex02;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 *
 * @author cillor
 */
public class Ex01ex02 {

    public static void main(String[] args) {
        String path = "/home/cillor/OneDriv/Documentos/Comprovantes/BoletosAp";
        String filter = ".pdf";
        
        System.out.println("Scanning with no filter:");
        scanFiles(path);
        
        System.out.println("\n\nScanning with filter:");
        scanFiles(path, filter);
    }
    
    static void scanFiles(String sAFilePath) {
        File fonte = new File(sAFilePath);
        if (fonte.isDirectory()) {
            File[] files = fonte.listFiles();
            if (files != null) {
                for (File file : files) {
                    try {
                        if (file.isDirectory())
                            scanFiles(file.getCanonicalPath());
                        else
                            System.out.println(file.getName());
                    } catch (IOException ex) {
                        System.out.println("Erro:" + ex.getMessage());  
                    }
                }
            }
        }
    }
    
    static void scanFiles(String sAFilePath, String type) {
        
        File fonte = new File(sAFilePath);
        if (fonte.isDirectory()) {
            
            FilenameFilter textFilter = (File dir, String name) -> {
                
                String path = dir.getAbsolutePath() + "/" + name;
                File file = new File(path);
                if (file.isDirectory()) {
                    return true; //filtra dentro os diretorios, permitindo a recursão por todo mundo
                }

                return name.toLowerCase().endsWith(type); //filtra fora os diretorios
            };
                        
            File[] files = fonte.listFiles(textFilter);
            
            for (File file : files) {
                try {
                    if (file.isDirectory())
                        scanFiles(file.getCanonicalPath(), type);
                    else
                        System.out.println(file.getName());
                } catch (IOException ex) {
                    System.out.println("Erro:" + ex.getMessage());  
                }
            }
        }
    }
}
