/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Cidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class CidadeManager {

    private static CidadeManager instance;

    public static CidadeManager getInstance() {
        if (instance == null) {
            instance = new CidadeManager();
        }

        return instance;
    }

    private CidadeManager() {
    }

    public void add(Cidade Cid) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO cidades (Cid_Nome, Cid_cd_estado, Cid_cd_pais, Cid_Cep) VALUES (?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, Cid.getNome());
            ps.setString(2, Cid.getUf());
            ps.setString(3, Cid.getPais());
            ps.setString(4, Cid.getCep());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Cidade Cid) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Cidades SET Cid_Nome=?, Cid_cd_estado=?, Cid_cd_pais=?, Cid_Cep=? WHERE Cid_ID=?");
            
            ps.setString(1, Cid.getNome());
            ps.setString(2, Cid.getUf());
            ps.setString(3, Cid.getPais());
            ps.setString(4, Cid.getCep());
            ps.setInt(5, Cid.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Cidade Cid) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Cidades WHERE Cid_ID=?");
    
            ps.setInt(1, Cid.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cidade> selecionar(String condicao) {
        ArrayList<Cidade> Cid = new ArrayList<Cidade>();
        
        if (!condicao.isEmpty()) {
            condicao = "where " + condicao;
        }
                
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Cidades " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cidade cid1 = new Cidade();
                cid1.setId(rs.getInt("Cid_ID"));
                cid1.setNome(rs.getString("Cid_nome"));
                cid1.setUf(rs.getString("Cid_cd_estado"));
                cid1.setPais(rs.getString("Cid_cd_pais"));
                cid1.setCep(rs.getString("Cid_cep"));
                
                Cid.add(cid1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Cid;
    }

}
