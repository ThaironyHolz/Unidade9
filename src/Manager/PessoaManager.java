/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class PessoaManager {

    private static PessoaManager instance;

    public static PessoaManager getInstance() {
        if (instance == null) {
            instance = new PessoaManager();
        }

        return instance;
    }

    private PessoaManager() {
    }

    public void add(Pessoa Pes) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Pessoas (Pes_Nome, Pes_Razao, Pes_Documento1, Pes_Documento2, Pes_Documento3, Pes_Endereco, Pes_Numero, Pes_Complemento, Pes_Bairro, Pes_Id_Cidade, Pes_CEP, Pes_Fone1, Pes_Fone2, Pes_email, Pes_Nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, Pes.getNome());
            ps.setString(2, Pes.getRazao());
            ps.setString(3, Pes.getDocumento1());
            ps.setString(4, Pes.getDocumento2());
            ps.setString(5, Pes.getDocumento3());
            ps.setString(6, Pes.getEndereco());
            ps.setString(7, Pes.getNumero());
            ps.setString(8, Pes.getComplemento());
            ps.setString(9, Pes.getBairro());
            ps.setInt(10, Pes.getId_Cidade());
            ps.setString(11, Pes.getCEP());
            ps.setString(12, Pes.getFone1());
            ps.setString(13, Pes.getFone2());
            ps.setString(14, Pes.getEmail());
            ps.setDate(15, Pes.getNascimento());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Pessoa Pes) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Pessoas SET Pes_Nome=?, Pes_Razao=?, Pes_Documento1=?, Pes_Documento2=?, Pes_Documento3=?, Pes_Endereco=?, Pes_Numero=?, Pes_Complemento=?, Pes_Bairro=?, Pes_Id_Cidade=?, Pes_CEP=?, Pes_Fone1=?, Pes_Fone2=?, Pes_email=?, Pes_Nascimento=? WHERE Pes_ID=?");
            
            ps.setString(1, Pes.getNome());
            ps.setString(2, Pes.getRazao());
            ps.setString(3, Pes.getDocumento1());
            ps.setString(4, Pes.getDocumento2());
            ps.setString(5, Pes.getDocumento3());
            ps.setString(6, Pes.getEndereco());
            ps.setString(7, Pes.getNumero());
            ps.setString(8, Pes.getComplemento());
            ps.setString(9, Pes.getBairro());
            ps.setInt(10, Pes.getId_Cidade());
            ps.setString(11, Pes.getCEP());
            ps.setString(12, Pes.getFone1());
            ps.setString(13, Pes.getFone2());
            ps.setString(14, Pes.getEmail());
            ps.setDate(15, Pes.getNascimento());
            ps.setInt(16, Pes.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Pessoa Pes) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Pessoas WHERE Pes_ID=?");
    
            ps.setInt(1, Pes.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Pessoa> selecionar(String condicao) {
        ArrayList<Pessoa> Pes = new ArrayList<Pessoa>();
        
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Pessoas where " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pessoa Pes1 = new Pessoa();
                
                Pes1.setId(rs.getInt("Pes_ID"));
                Pes1.setNome(rs.getString("Pes_Nome"));
                Pes1.setRazao(rs.getString("Pes_Razao"));
                Pes1.setDocumento1(rs.getString("Pes_Documento1"));
                Pes1.setDocumento2(rs.getString("Pes_Documento2"));
                Pes1.setDocumento3(rs.getString("Pes_Documento3"));
                Pes1.setEndereco(rs.getString("Pes_Endereco"));
                Pes1.setNumero(rs.getString("Pes_Numero"));
                Pes1.setComplemento(rs.getString("Pes_Complemento"));
                Pes1.setBairro(rs.getString("Pes_Bairro"));
                Pes1.setId_Cidade(rs.getInt("Pes_id_cidade"));
                Pes1.setCEP(rs.getString("Pes_CEP"));
                Pes1.setFone1(rs.getString("Pes_Fone1"));
                Pes1.setFone2(rs.getString("Pes_Fone2"));
                Pes1.setEmail(rs.getString("Pes_Email"));
                Pes1.setNascimento(rs.getDate("Pes_nascimento"));
                
                Pes.add(Pes1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Pes;
    }

}
