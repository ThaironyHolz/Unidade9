/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Documento;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class DocumentoManager {

    private static DocumentoManager instance;

    public static DocumentoManager getInstance() {
        if (instance == null) {
            instance = new DocumentoManager();
        }

        return instance;
    }

    private DocumentoManager() {
    }

    public void add(Documento Doc) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Documentos (Doc_id_Pessoa, Doc_data_emissao, Doc_total, Doc_Documento, Doc_meio_pagamento) VALUES (?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, Doc.getPessoaId());
            ps.setDate(2, Doc.getEmissao());
            ps.setBigDecimal(3, Doc.getTotal());
            ps.setString(4, Doc.getDocumento());
            ps.setString(5, Doc.getMeio());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Documento Doc) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Documentos SET Doc_id_Pessoa=?, Doc_data_emissao=?, Doc_total=?, Doc_Documento=?, Doc_meio_pagamento=? WHERE Doc_ID=?");
            
            ps.setInt(1, Doc.getPessoaId());
            ps.setDate(2, Doc.getEmissao());
            ps.setBigDecimal(3, Doc.getTotal());
            ps.setString(4, Doc.getDocumento());
            ps.setString(5, Doc.getMeio());
            ps.setInt(6, Doc.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Documento Doc) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Documentos WHERE Doc_ID=?");

            ps.setInt(1, Doc.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Documento> Selecionar(String condicao) {
        ArrayList<Documento> Doc = new ArrayList<Documento>();
        
        if (!condicao.isEmpty()) {
            condicao = "where " + condicao;
        }
                
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Documentos " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Documento Doc1 = new Documento();
                Doc1.setId(rs.getInt("Doc_ID"));
                Doc1.setDocumento(rs.getString("Doc_documento"));
                Doc1.setMeio(rs.getString("Doc_meio_pagamento"));
                Doc1.setEmissao(rs.getDate("Doc_emissao"));
                Doc1.setTotal(rs.getBigDecimal("Doc_total"));
                Doc1.setPessoaId(rs.getInt("Doc_id_pessoa"));
                
                Doc.add(Doc1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Doc;
    }

}
