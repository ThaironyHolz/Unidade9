/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class ProdutoManager {

    private static ProdutoManager instance;

    public static ProdutoManager getInstance() {
        if (instance == null) {
            instance = new ProdutoManager();
        }

        return instance;
    }

    private ProdutoManager() {
    }

    public void add(Produto Prd) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Produtos (Prd_nome, Prd_referencia, Prd_unidade, Prd_Id_Pessoa, Prd_NCM, Prd_Estoque, Prd_Venda, Prd_Custo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, Prd.getNome());
            ps.setString(2, Prd.getReferencia());
            ps.setString(3, Prd.getUnidade());
            ps.setInt(4, Prd.getId_Pessoa());
            ps.setString(5, Prd.getNCM());
            ps.setBigDecimal(6, Prd.getEstoque());
            ps.setBigDecimal(7, Prd.getVenda());
            ps.setBigDecimal(8, Prd.getCusto());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Produto Prd) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Produtos SET Prd_nome=?, Prd_referencia=?, Prd_unidade=?, Prd_Id_Pessoa=?, Prd_NCM=?, Prd_Estoque=?, Prd_Venda=?, Prd_Custo=? WHERE Prd_ID=?");
            
            ps.setString(1, Prd.getNome());
            ps.setString(2, Prd.getReferencia());
            ps.setString(3, Prd.getUnidade());
            ps.setInt(4, Prd.getId_Pessoa());
            ps.setString(5, Prd.getNCM());
            ps.setBigDecimal(6, Prd.getEstoque());
            ps.setBigDecimal(7, Prd.getVenda());
            ps.setBigDecimal(8, Prd.getCusto());
            ps.setInt(9, Prd.getID());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Produto Prd) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Produtos WHERE Prd_ID=?");
    
            ps.setInt(1, Prd.getID());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Produto> selecionar(String condicao) {
        ArrayList<Produto> Prd = new ArrayList<Produto>();
        
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Produtos where " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produto Prd1 = new Produto();
                
                Prd1.setID(rs.getInt("Prd_ID"));
                Prd1.setNome(rs.getString("Prd_nome"));
                Prd1.setReferencia(rs.getString("Prd_Referencia"));
                Prd1.setUnidade(rs.getString("Prd_Unidade"));
                Prd1.setId_Pessoa(rs.getInt("Prd_id_pessoa"));
                Prd1.setNCM(rs.getString("prd_ncm"));
                Prd1.setEstoque(rs.getBigDecimal("prd_estoque"));
                Prd1.setVenda(rs.getBigDecimal("prd_venda"));
                Prd1.setCusto(rs.getBigDecimal("prd_custo"));
                
                Prd.add(Prd1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Prd;
    }

}
