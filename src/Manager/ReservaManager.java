/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Reserva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class ReservaManager {

    private static ReservaManager instance;

    public static ReservaManager getInstance() {
        if (instance == null) {
            instance = new ReservaManager();
        }

        return instance;
    }

    private ReservaManager() {
    }

    public void add(Reserva Res) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("INSERT INTO Reservas (Res_Id_Comodo, Res_Id_Pessoa, Res_PrevisaoEntrada, Res_DataEntrada, Res_DataSaida, Res_PrevisaoSaida, Res_Total, Res_Confirmado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, Res.getComodoId());
            ps.setInt(2, Res.getPessoaId());
            ps.setDate(3, Res.getPrevEntrada());
            ps.setDate(4, Res.getEntrada());
            ps.setDate(5, Res.getSaida());
            ps.setDate(6, Res.getPrevSaida());
            ps.setBigDecimal(7, Res.getTotal());
            ps.setBoolean(8, Res.isConfirmado());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Reserva Res) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("UPDATE Reservas SET Res_Id_Comodo=?, Res_Id_Pessoa=?, Res_PrevisaoEntrada=?, Res_DataEntrada=?, Res_DataSaida=?, Res_PrevisaoSaida=?, Res_Total=?, Res_Confirmado=? WHERE Res_ID=?");
            
            ps.setInt(1, Res.getComodoId());
            ps.setInt(2, Res.getPessoaId());
            ps.setDate(3, Res.getPrevEntrada());
            ps.setDate(4, Res.getEntrada());
            ps.setDate(5, Res.getSaida());
            ps.setDate(6, Res.getPrevSaida());
            ps.setBigDecimal(7, Res.getTotal());
            ps.setBoolean(8, Res.isConfirmado());
            ps.setInt(9, Res.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Reserva Res) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("DELETE FROM Reservas WHERE Res_ID=?");
    
            ps.setInt(1, Res.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Reserva> Selecionar(String condicao) {
        ArrayList<Reserva> Res = new ArrayList<Reserva>();
        
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("SELECT * FROM Reservas where " + condicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Reserva Res1 = new Reserva();
            
                Res1.setId(rs.getInt("Res_ID"));
                Res1.setComodoId(rs.getInt("Res_Nome"));
                Res1.setPessoaId(rs.getInt("Res_Razao"));
                Res1.setPrevEntrada(rs.getDate("Res_Documento1"));
                Res1.setEntrada(rs.getDate("Res_Documento2"));
                Res1.setSaida(rs.getDate("Res_Endereco"));
                Res1.setPrevSaida(rs.getDate("Res_Documento3"));
                Res1.setTotal(rs.getBigDecimal("Res_Numero"));
                //Res1.setConfirmado(rs.getInt("Res_Confirmado"));
                
                Res.add(Res1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Res;
    }

}
