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
public class PromocaoXporY implements Promocao {
    private Integer leve, pague;
    PromocaoXporY(Integer leve, Integer pague){
        this.leve = leve;
        this.pague = pague;
    }
    public int desconto (Item i){
        Integer desconto, a = i.getQuantidade()/leve;
        desconto = a*(leve-pague) * i.getProduto().getValor();
        return desconto;
    }
}
