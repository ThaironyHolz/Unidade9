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
public class Documento {

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
     * @return the Emissao
     */
    public Date getEmissao() {
        return Emissao;
    }

    /**
     * @param Emissao the Emissao to set
     */
    public void setEmissao(Date Emissao) {
        this.Emissao = Emissao;
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
     * @return the Documento
     */
    public String getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
     */
    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    /**
     * @return the Meio
     */
    public String getMeio() {
        return Meio;
    }

    /**
     * @param Meio the Meio to set
     */
    public void setMeio(String Meio) {
        this.Meio = Meio;
    }

    /**
     * @return the Vendedor
     */
    public int getVendedor() {
        return Vendedor;
    }

    /**
     * @param Vendedor the Vendedor to set
     */
    public void setVendedor(int Vendedor) {
        this.Vendedor = Vendedor;
    }

    /**
     * @return the ReservaId
     */
    public int getReservaId() {
        return ReservaId;
    }

    /**
     * @param ReservaId the ReservaId to set
     */
    public void setReservaId(int ReservaId) {
        this.ReservaId = ReservaId;
    }

    private int Id;
    private int PessoaId;
    private Date Emissao;
    private BigDecimal Total;
    private String Documento;
    private String Meio;
    private int Vendedor;
    private int ReservaId;
}
