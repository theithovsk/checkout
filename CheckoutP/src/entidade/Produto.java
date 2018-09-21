/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.math.BigDecimal;

/**
 *
 * @author ZG
 */
public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal valor;
    private Integer tipoPromocao;
    private Promocao promo;

    public Produto(){

    }
    Produto(Integer id, String descricao, BigDecimal valor, Promocao promo){
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
        this.promo = promo;
    }
    
    Produto(Integer id, String descricao, BigDecimal valor, Integer tipoPromocao){
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
        this.tipoPromocao = tipoPromocao;
    }

    Produto(Integer id, String descricao, BigDecimal valor){
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Promocao getPromo() {
        return promo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTipoPromocao() {
        return tipoPromocao;
    }

    public void setTipoPromocao(Integer tipoPromocao) {
        this.tipoPromocao = tipoPromocao;
    }
    
    
}

