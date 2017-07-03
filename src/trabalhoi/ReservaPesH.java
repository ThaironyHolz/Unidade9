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
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservas_pessoas")

public class ReservaPesH implements Serializable {

    /**
     * @return the res_id
     */
    public Integer getRes_id() {
        return res_id;
    }

    /**
     * @param res_id the res_id to set
     */
    public void setRes_id(Integer res_id) {
        this.res_id = res_id;
    }

    /**
     * @return the res_id_pessoa
     */
    public Integer getRes_id_pessoa() {
        return res_id_pessoa;
    }

    /**
     * @param res_id_pessoa the res_id_pessoa to set
     */
    public void setRes_id_pessoa(Integer res_id_pessoa) {
        this.res_id_pessoa = res_id_pessoa;
    }

    @Id
    @Column(name = "res_id")
    private Integer res_id;

    @Column(name = "res_id_pessoa")
    private Integer res_id_pessoa;

}

