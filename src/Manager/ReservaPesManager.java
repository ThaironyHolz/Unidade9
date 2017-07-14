/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.ReservaPes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class ReservaPesManager {

    private static ReservaPesManager instance;

    public static ReservaPesManager getInstance() {
        if (instance == null) {
            instance = new ReservaPesManager();
        }

        return instance;
    }

    private ReservaPesManager() {
    }

    public void add(ReservaPes Rep) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Reservas_Pessoas (Rep_ID, Rep_ID_Pessoa, Rep_id_acomp1, Rep_id_acomp2, Rep_id_acomp3) VALUES (?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, Rep.getId());
            ps.setInt(2, Rep.getPrincipalId());
            ps.setInt(3, Rep.getAcomp1Id());
            ps.setInt(4, Rep.getAcomp2Id());
            ps.setInt(5, Rep.getAcomp3Id());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(ReservaPes Rep) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Reservas_Pessoas SET Rep_ID_Pessoa=?, Rep_id_acomp1=?, Rep_id_acomp2=?, Rep_id_acomp3=? WHERE Rep_ID=?");
            
            ps.setInt(1, Rep.getPrincipalId());
            ps.setInt(2, Rep.getAcomp1Id());
            ps.setInt(3, Rep.getAcomp2Id());
            ps.setInt(4, Rep.getAcomp3Id());
            ps.setInt(5, Rep.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(ReservaPes Rep) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Reserva_Pessoas WHERE Rep_ID=?");
    
            ps.setInt(1, Rep.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ReservaPes> Selecionar(String condicao) {
        ArrayList<ReservaPes> Rep = new ArrayList<ReservaPes>();
        
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Reserva_Pessoas where " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ReservaPes Rep1 = new ReservaPes();
                
                Rep1.setId(rs.getInt("Rep_ID"));
                Rep1.setPrincipalId(rs.getInt("Rep_Id_Pessoa"));
                Rep1.setAcomp1Id(rs.getInt("rep_id_acomp1"));
                Rep1.setAcomp3Id(rs.getInt("rep_id_acomp2"));
                Rep1.setAcomp3Id(rs.getInt("rep_id_acomp3"));
                
                Rep.add(Rep1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Rep;
    }

}
