/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Christian
 */
public class DocumentoVencimento {

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Sequencia
     */
    public int getSequencia() {
        return Sequencia;
    }

    /**
     * @param Sequencia the Sequencia to set
     */
    public void setSequencia(int Sequencia) {
        this.Sequencia = Sequencia;
    }

    /**
     * @return the Vencimento
     */
    public Date getVencimento() {
        return Vencimento;
    }

    /**
     * @param Vencimento the Vencimento to set
     */
    public void setVencimento(Date Vencimento) {
        this.Vencimento = Vencimento;
    }

    /**
     * @return the Saldo
     */
    public BigDecimal getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(BigDecimal Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the VlrOriginal
     */
    public BigDecimal getVlrOriginal() {
        return VlrOriginal;
    }

    /**
     * @param VlrOriginal the VlrOriginal to set
     */
    public void setVlrOriginal(BigDecimal VlrOriginal) {
        this.VlrOriginal = VlrOriginal;
    }

    private int Id;
    private int Sequencia;
    private Date Vencimento;
    private BigDecimal Saldo;
    private BigDecimal VlrOriginal;
}
