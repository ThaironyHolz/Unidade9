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
public class Pagamento {

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
     * @return the DocId
     */
    public int getDocId() {
        return DocId;
    }

    /**
     * @param DocId the DocId to set
     */
    public void setDocId(int DocId) {
        this.DocId = DocId;
    }

    /**
     * @return the VncId
     */
    public int getVncId() {
        return VncId;
    }

    /**
     * @param VncId the VncId to set
     */
    public void setVncId(int VncId) {
        this.VncId = VncId;
    }

    /**
     * @return the DataPag
     */
    public Date getDataPag() {
        return DataPag;
    }

    /**
     * @param DataPag the DataPag to set
     */
    public void setDataPag(Date DataPag) {
        this.DataPag = DataPag;
    }

    /**
     * @return the Valor
     */
    public BigDecimal getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(BigDecimal Valor) {
        this.Valor = Valor;
    }

    private int Id;
    private int DocId;
    private int VncId;
    private Date DataPag;
    private BigDecimal Valor;
}
