/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidade.Codigo;
import entidade.Produto;
import entidade.Produto2;
import entidade.PromocaoValor;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.PProduto;

/**
 *
 * @author ZG
 */
public class TProduto {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("Digite o ID: ");
        produto.setId(scn.nextInt());
        
        System.out.println("Digite a descrição: ");
        produto.setDescricao(scn.next());
        
        System.out.println("Digite o valor: ");
        produto.setValor(scn.nextBigDecimal());
        
        System.out.println("Digite a promoção: ");
        produto.setTipoPromocao(scn.nextInt());
        
        PProduto persistencia = new PProduto();

        try {
            persistencia.incluir(produto);
        } catch (SQLException ex) {
            Logger.getLogger(TProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Sucesso!");
        
    }
    
}
