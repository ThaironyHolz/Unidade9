/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cria uma conexão ao Banco
 * @author Thairony
 */
public class ConexaoSQL
{
    private Connection conn;
    
    // Atributo com nome do Server
    private String server = "localhost";
    // Atributo com nome do Database
    private String database = "hotel";
    // Atributo com a porta de conexão ao MySQl
    private String port = "3306";
    // Atributo com nome do usuario
    private String username = "root";
    // Atributo com a senha do banco de dados
    private String password = "cadtj3f0";
    
    /**
     * Conexão ao SQL
     * Criação do comando de conexão.
     */
    ConexaoSQL()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            
            conn = DriverManager.getConnection("jdbc:mysql://"+server+"/"+database+":"+port, username, password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * Prepara um erro ou mensagem do banco.
     * 
     * @param sql
     * @return
     * @throws SQLException 
     */
    public PreparedStatement prepareStatement(String sql) throws SQLException
    {
        return conn.prepareStatement(sql);
    }
    
    /**
     * Fecha a conexão ao banco de dados ativa por algum comando.
     */
    public void close()
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
    
    /**
     * Executa um comando SQL, sem retorno. 
     * Metodo .ExecuteUpdate
     * 
     * @param comando String com o comando SQL
     * @return
     * @throws SQLException 
     */
    public static int ExecSQL( String comando) throws SQLException 
    {
        int afetados = 0;
        
        ConexaoSQL db = new ConexaoSQL();
        try
        {
            PreparedStatement ps = db.prepareStatement(comando);
	
            afetados = ps.executeUpdate();
            
        }
        finally
        {
            db.close();
        }
        return afetados;
        
    }

    /**
     * Executa um comando SQL, com retorno do comando executado.
     * Metodo ExecuteQuery
     * 
     * @param comando String com comando SQL
     * @return
     * @throws SQLException 
     */
    public static ResultSet RetornoSQL( String comando) throws SQLException 
    {
        ResultSet rs = null;

        ConexaoSQL db = new ConexaoSQL();
        try
        {
            PreparedStatement ps = db.prepareStatement(comando);
            
            rs = ps.executeQuery();
        }
        finally
        {
            db.close();
        }
        return rs;
    }
    
}
