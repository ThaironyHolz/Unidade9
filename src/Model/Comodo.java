/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Christian
 */
public class Comodo {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the maxpessoas
     */
    public int getMaxpessoas() {
        return maxpessoas;
    }

    /**
     * @param maxpessoas the maxpessoas to set
     */
    public void setMaxpessoas(int maxpessoas) {
        this.maxpessoas = maxpessoas;
    }

    /**
     * @return the diaria
     */
    public BigDecimal getDiaria() {
        return diaria;
    }

    /**
     * @param diaria the diaria to set
     */
    public void setDiaria(BigDecimal diaria) {
        this.diaria = diaria;
    }
    
    private int id;
    private String descricao;
    private int maxpessoas;
    private BigDecimal diaria;
    
    /*
    NumberFormatter df = new NumberFormatter("#,##0.00");
    df.parse(value);
    */
}
