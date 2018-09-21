/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Conexao;

/**
 *
 * @author ZG
 */
public class PPromocao {
    
    private static final String INSERT_SQL = "INSERT INTO promocao (codigo, valor, tipo_promocao) VALUES (?,?,?)";
    
    public Produto obter(Produto produto){
        try (Connection conexao = Conexao.getConexao(); PreparedStatement consulta = conexao.prepareStatement(INSERT_SQL)) {
                        
            consulta.setInt(1, produto.getCodigo().ordinal());
            consulta.setInt(2, produto.getValor());
            //consulta.setObject(3, produto.getPromo());
            
            consulta.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return produto;
    }
    
}
