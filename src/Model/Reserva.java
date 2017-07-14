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
public class Reserva {

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
     * @return the ComodoId
     */
    public int getComodoId() {
        return ComodoId;
    }

    /**
     * @param ComodoId the ComodoId to set
     */
    public void setComodoId(int ComodoId) {
        this.ComodoId = ComodoId;
    }

    /**
     * @return the PessoaId
     */
    public int getPessoaId() {
        return PessoaId;
    }

    /**
     * @param PessoaId the PessoaId to set
     */
    public void setPessoaId(int PessoaId) {
        this.PessoaId = PessoaId;
    }

    /**
     * @return the PrevEntrada
     */
    public Date getPrevEntrada() {
        return PrevEntrada;
    }

    /**
     * @param PrevEntrada the PrevEntrada to set
     */
    public void setPrevEntrada(Date PrevEntrada) {
        this.PrevEntrada = PrevEntrada;
    }

    /**
     * @return the PrevSaida
     */
    public Date getPrevSaida() {
        return PrevSaida;
    }

    /**
     * @param PrevSaida the PrevSaida to set
     */
    public void setPrevSaida(Date PrevSaida) {
        this.PrevSaida = PrevSaida;
    }

    /**
     * @return the Entrada
     */
    public Date getEntrada() {
        return Entrada;
    }

    /**
     * @param Entrada the Entrada to set
     */
    public void setEntrada(Date Entrada) {
        this.Entrada = Entrada;
    }

    /**
     * @return the Saida
     */
    public Date getSaida() {
        return Saida;
    }

    /**
     * @param Saida the Saida to set
     */
    public void setSaida(Date Saida) {
        this.Saida = Saida;
    }

    /**
     * @return the Total
     */
    public BigDecimal getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(BigDecimal Total) {
        this.Total = Total;
    }

    /**
     * @return the Confirmado
     */
    public boolean isConfirmado() {
        return Confirmado;
    }

    /**
     * @param Confirmado the Confirmado to set
     */
    public void setConfirmado(boolean Confirmado) {
        this.Confirmado = Confirmado;
    }

    private int Id;
    private int ComodoId;
    private int PessoaId;
    private Date PrevEntrada;
    private Date PrevSaida;
    private Date Entrada;
    private Date Saida;
    private BigDecimal Total;
    private boolean Confirmado;

}
