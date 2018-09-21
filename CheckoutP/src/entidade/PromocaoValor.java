/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import interfaces.Promocao;

/**
 *
 * @author ZG
 */
public class PromocaoValor implements Promocao {
    Integer quantidade,valorDesconto;
    PromocaoValor(Integer quantidade, Integer valorDesconto){
        this.quantidade =quantidade;
        this.valorDesconto = valorDesconto;
    }
    
    @Override
    public int desconto (Item i){
        Integer desconto, a = i.getQuantidade()/this.quantidade;

        desconto = a* ((i.getProduto().getValor()*quantidade)-valorDesconto);
        return desconto;
    }
}
