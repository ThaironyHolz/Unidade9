/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Comodo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class ComodoManager {

    private static ComodoManager instance;

    public static ComodoManager getInstance() {
        if (instance == null) {
            instance = new ComodoManager();
        }

        return instance;
    }

    private ComodoManager() {
    }

    public void add(Comodo Com) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Comodos (Com_Descricao, Com_MaxPessoas, Com_ValorDiaria) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, Com.getDescricao());
            ps.setInt(2, Com.getMaxpessoas());
            ps.setBigDecimal(3, Com.getDiaria());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Comodo Com) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Comodos SET Com_Descricao=?, Com_MaxPessoas=?, Com_ValorDiaria=? WHERE Com_ID=?");
            
            ps.setString(1, Com.getDescricao());
            ps.setInt(2, Com.getMaxpessoas());
            ps.setBigDecimal(3, Com.getDiaria());
            ps.setInt(4, Com.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Comodo Com) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Comodos WHERE Com_ID=?");
    
            ps.setInt(1, Com.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Comodo> selecionar(String condicao) {
        ArrayList<Comodo> Com = new ArrayList<Comodo>();
        
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Comodos where " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comodo com1 = new Comodo();
                com1.setId(rs.getInt("Com_ID"));
                com1.setDescricao(rs.getString("Com_descricao"));
                com1.setMaxpessoas(rs.getInt("Com_MaxPessoas"));
                com1.setDiaria(rs.getBigDecimal("Com_ValorDiaria"));
                
                Com.add(com1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Com;
    }

}
