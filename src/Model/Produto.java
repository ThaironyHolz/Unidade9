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
public class Produto {

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the Id_Pessoa
     */
    public int getId_Pessoa() {
        return Id_Pessoa;
    }

    /**
     * @param Id_Pessoa the Id_Pessoa to set
     */
    public void setId_Pessoa(int Id_Pessoa) {
        this.Id_Pessoa = Id_Pessoa;
    }

    /**
     * @return the NCM
     */
    public String getNCM() {
        return NCM;
    }

    /**
     * @param NCM the NCM to set
     */
    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    /**
     * @return the Estoque
     */
    public BigDecimal getEstoque() {
        return Estoque;
    }

    /**
     * @param Estoque the Estoque to set
     */
    public void setEstoque(BigDecimal Estoque) {
        this.Estoque = Estoque;
    }

    /**
     * @return the Venda
     */
    public BigDecimal getVenda() {
        return Venda;
    }

    /**
     * @param Venda the Venda to set
     */
    public void setVenda(BigDecimal Venda) {
        this.Venda = Venda;
    }

    /**
     * @return the Custo
     */
    public BigDecimal getCusto() {
        return Custo;
    }

    /**
     * @param Custo the Custo to set
     */
    public void setCusto(BigDecimal Custo) {
        this.Custo = Custo;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    private int ID;
    private String nome;
    private String referencia;
    private String unidade;
    private int Id_Pessoa;
    private String NCM;
    private BigDecimal Estoque;
    private BigDecimal Venda;
    private BigDecimal Custo;

    /*
    NumberFormatter df = new NumberFormatter("#,##0.00");
    df.parse(value);
     */
}
