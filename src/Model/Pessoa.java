/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Christian
 */
public class Pessoa {

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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Razao
     */
    public String getRazao() {
        return Razao;
    }

    /**
     * @param Razao the Razao to set
     */
    public void setRazao(String Razao) {
        this.Razao = Razao;
    }

    /**
     * @return the Documento1
     */
    public String getDocumento1() {
        return Documento1;
    }

    /**
     * @param Documento1 the Documento1 to set
     */
    public void setDocumento1(String Documento1) {
        this.Documento1 = Documento1;
    }

    /**
     * @return the Documento2
     */
    public String getDocumento2() {
        return Documento2;
    }

    /**
     * @param Documento2 the Documento2 to set
     */
    public void setDocumento2(String Documento2) {
        this.Documento2 = Documento2;
    }

    /**
     * @return the Documento3
     */
    public String getDocumento3() {
        return Documento3;
    }

    /**
     * @param Documento3 the Documento3 to set
     */
    public void setDocumento3(String Documento3) {
        this.Documento3 = Documento3;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the Id_Cidade
     */
    public int getId_Cidade() {
        return Id_Cidade;
    }

    /**
     * @param Id_Cidade the Id_Cidade to set
     */
    public void setId_Cidade(int Id_Cidade) {
        this.Id_Cidade = Id_Cidade;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Fone1
     */
    public String getFone1() {
        return Fone1;
    }

    /**
     * @param Fone1 the Fone1 to set
     */
    public void setFone1(String Fone1) {
        this.Fone1 = Fone1;
    }

    /**
     * @return the Fone2
     */
    public String getFone2() {
        return Fone2;
    }

    /**
     * @param Fone2 the Fone2 to set
     */
    public void setFone2(String Fone2) {
        this.Fone2 = Fone2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the Nascimento
     */
    public Date getNascimento() {
        return Nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    @Override
    public String toString() {
        return getNome();
    }

    private int id;
    private String Nome;
    private String Razao;
    private String Documento1;
    private String Documento2;
    private String Documento3;
    private String Endereco;
    private String Numero;
    private String Complemento;
    private String Bairro;
    private int Id_Cidade;
    private String CEP;
    private String Fone1;
    private String Fone2;
    private String email;
    private Date Nascimento;

}
