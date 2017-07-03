/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class FodaseManager {

    private static FodaseManager instance;

    public static FodaseManager getInstance() {
        if (instance == null) {
            instance = new FodaseManager();
        }

        return instance;
    }

    private FodaseManager() {
    }

    public void add(String objetorFodase) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("insert la no banco esse fodase", PreparedStatement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                int id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String objetorFodase) {
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("insert la no banco esse fodase");
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String objetorFodase) { //tu entendeu
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("insert la no banco esse fodase");
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getobagulho(String objetorFodase) { //tu entendeu
        ArrayList<String> osfodase = new ArrayList<>();
        
        try (ConexaoPostgre db = ConexaoPostgre.getInstance()) {
            PreparedStatement ps = db.prepareStatement("select a porra toda");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                // Osfodase fodase = new Osfodase();
                osfodase.add(rs.getString("colunaladatabela"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return osfodase;
    }

}
