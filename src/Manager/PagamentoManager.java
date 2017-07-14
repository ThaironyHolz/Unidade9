/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Pagamento;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class PagamentoManager {

    private static PagamentoManager instance;

    public static PagamentoManager getInstance() {
        if (instance == null) {
            instance = new PagamentoManager();
        }

        return instance;
    }

    private PagamentoManager() {
    }

    public void add(Pagamento Pag) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Pagamentos (Pgv_data, Pgv_id_Documento, Pgv_id_Vencimento, Pgv_valor) VALUES (?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Pag.getDataPag());
            ps.setInt(2, Pag.getDocId());
            ps.setInt(3, Pag.getVncId());
            ps.setBigDecimal(4, Pag.getValor());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Pagamento Pag) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Pagamentos SET Pgv_data=?, Pgv_valor=? WHERE Pgv_ID=?");
            
            ps.setDate(1, Pag.getDataPag());
            ps.setBigDecimal(2, Pag.getValor());
            ps.setInt(3, Pag.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Pagamento Pag) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Pagamentos WHERE Pag_ID=?");
    
            ps.setInt(1, Pag.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Pagamento> Selecionar(String condicao) {
        ArrayList<Pagamento> Pag = new ArrayList<Pagamento>();
        
        if (!condicao.isEmpty()) {
            condicao = " where " + condicao;
        }
                
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Pagamentos where " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pagamento Pag1 = new Pagamento();
                Pag1.setId(rs.getInt("Pag_ID"));
                Pag1.setDocId(rs.getInt("Pag_Id_documento"));
                Pag1.setVncId(rs.getInt("Pag_Id_Vencimento"));
                Pag1.setDataPag(rs.getDate("Pag_data"));
                Pag1.setValor(rs.getBigDecimal("Pag_valor"));
                
                Pag.add(Pag1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Pag;
    }

}
