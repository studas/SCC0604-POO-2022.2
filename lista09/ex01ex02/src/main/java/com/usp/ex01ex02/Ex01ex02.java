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
        System.out.println("Scanning with no filter:");
        scanFiles("/home/cillor/OneDriv/Documentos/Comprovantes/BoletosAp");
        System.out.println("\n\n");
        System.out.println("Scanning with filter:");
        scanFilesType("/home/cillor/OneDriv/Documentos/Comprovantes/BoletosAp", ".pdf");
    }
    
    public static void scanFiles(String sAFilePath) {
        File fonte = new File(sAFilePath);
        if (fonte.isDirectory()) {
            File[] files = fonte.listFiles();
            if (files != null) {
                for (File file : files) { /* for(int i=0; i<files.length; i++) { */
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
    
    public static void scanFilesType(String sAFilePath, String type) {
        FilenameFilter textFilter = (File dir, String name) -> {
            return name.toLowerCase().endsWith(type);
        };
        
        File fonte = new File(sAFilePath);
        if (fonte.isDirectory()) {
            File[] files = fonte.listFiles(textFilter);
            if (files != null) {
                for (File file : files) { /* for(int i=0; i<files.length; i++) { */
                    try {
                        if (file.isDirectory())
                            scanFilesType(file.getCanonicalPath(), type);
                        else
                            System.out.println(file.getName());
                    } catch (IOException ex) {
                        System.out.println("Erro:" + ex.getMessage());  
                    }
                }
            }
        }
    }
}
