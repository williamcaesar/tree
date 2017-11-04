package tree;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ler {
     Path caminho = Paths.get("foog.txt");
        
     public void ler(){
        try {        
        byte[] texto = Files.readAllBytes(caminho);
        String leitura = new String(texto);
        System.out.println(leitura);
        }catch (Exception erro){
         System.out.println(erro);       
        }
     }
}