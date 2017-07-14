package trabalhoi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christian
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")

public class ReservaH implements Serializable {

    /**
     * @return the res_id
     */
    public int getRes_id() {
        return res_id;
    }

    /**
     * @param res_id the res_id to set
     */
    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    /**
     * @return the res_id_pessoa
     */
    public int getRes_id_pessoa() {
        return res_id_pessoa;
    }

    /**
     * @param res_id_pessoa the res_id_pessoa to set
     */
    public void setRes_id_pessoa(int res_id_pessoa) {
        this.res_id_pessoa = res_id_pessoa;
    }

    /**
     * @return the res_id_comodo
     */
    public int getRes_id_comodo() {
        return res_id_comodo;
    }

    /**
     * @param res_id_comodo the res_id_comodo to set
     */
    public void setRes_id_comodo(int res_id_comodo) {
        this.res_id_comodo = res_id_comodo;
    }

    /**
     * @return the res_total
     */
    public Double getRes_total() {
        return res_total;
    }

    /**
     * @param res_total the res_total to set
     */
    public void setRes_total(Double res_total) {
        this.res_total = res_total;
    }

    /**
     * @return the res_confirmado
     */
    public String getRes_confirmado() {
        return res_confirmado;
    }

    /**
     * @param res_confirmado the res_confirmado to set
     */
    public void setRes_confirmado(String res_confirmado) {
        this.res_confirmado = res_confirmado;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "res_id")
    private int res_id;

    @Column(name = "res_id_pessoa")
    private int res_id_pessoa;

    @Column(name = "res_id_comodo")
    private int res_id_comodo;

    @Column(name = "res_total")
    private Double res_total;

    @Column(name = "res_confirmado")
    private String res_confirmado;

}

