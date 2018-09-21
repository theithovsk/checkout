/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ZG
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String regex = "\\d";
        String text = "";

        String arquivo = "C:\\Users\\ZG\\Documents\\NetBeansProjects\\Regex\\src\\arquivo\\Arquivo_dados_checkout.txt";
        ArrayList<String> Linhas = new ArrayList<>();
        
        try {
            String linha = "";
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            
            while((linha = br.readLine()) != null){
                String[] dados = linha;
                Linhas.add(linha);
                             
            }
            
            
        } catch (Exception erro) {
            System.out.println("Arquivo não encontrado.");
        }
        
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher();

    }

}
