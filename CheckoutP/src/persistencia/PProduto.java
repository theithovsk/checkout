/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import entidade.Produto;
import entidade.Produto2;
import static java.lang.Math.log;
import java.math.BigDecimal;
import util.Conexao;

/**
 *
 * @author ZG
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ZG
 */
public class PProduto {
    
    
    public void incluir(Produto produto) throws SQLException {
        
        String sql = "INSERT INTO produto (id, descricao, valor, tipo_promocao) VALUES (?,?,?,?)";

        Connection cnn = util.Conexao.getConexao();

        // cria o procedimento para a execução "contra" o banco de dados
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, produto.getId());
        prd.setString(2, produto.getDescricao());
        prd.setBigDecimal(3, produto.getValor());
        prd.setInt(4, produto.getTipoPromocao());
        
        prd.execute();
        cnn.close();
        
    }
    
    public void excluir(int codigo) throws SQLException {
        
        String sql = "DELETE FROM associado WHERE codigo = ?";
       
        Connection cnn = util.Conexao.getConexao();
       // cria o procedimento para a execução "contra" o banco de dados
        PreparedStatement prd = cnn.prepareStatement(sql);

        // trocando os valores das ? por valores recebido no método
        prd.setInt(1, codigo);

        //executa todo o comando e grava no banco de dados
        prd.execute();
        cnn.close();

    }
}

