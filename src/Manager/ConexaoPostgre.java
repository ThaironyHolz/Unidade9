/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Manage the database connection
 * @author Cristian
 */
public class ConexaoPostgre implements AutoCloseable
{
    private static ConexaoPostgre instance;
    private static int calls;
    
    /**
     * Get the current instance of the Database Class
     * @return 
     */
    public static ConexaoPostgre getInstance()
    {
        if (instance == null)
        {
            instance = new ConexaoPostgre();
        }
        
        calls++;
        instance.prepareConnection();
        return instance;
    }

    private Connection conn;
    
    private ConexaoPostgre()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void prepareConnection()
    {
        try
        {
            if (conn == null || conn.isClosed())
            {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hotelaria", "postgres", "postgres");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * Get a new PreparedStatement class for this connection
     * @param sql
     * @return
     * @throws SQLException 
     */
    public PreparedStatement prepareStatement(String sql) throws SQLException
    {
        return conn.prepareStatement(sql);
    }
    
    /**
     * Get a new PreparedStatement class for this connection
     * @param sql
     * @param autoGeneratedKeys
     * @return
     * @throws SQLException 
     */
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException
    {
        return conn.prepareStatement(sql, autoGeneratedKeys);
    }
    
    @Override
    /**
     * Close the connection
     */
    public void close()
    {
        calls--;
        
        if (calls == 0)
        {
            try
            {
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
