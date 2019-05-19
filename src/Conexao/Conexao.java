/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luizr
 */
public class Conexao {
    
    public static String urlDB = "jdbc:mysql://";
    public static String nameServerDB = "localhost:3306/";
    public static String nameDB = "db_porto";
    public static String hostDB = "root";
    public static String passwordDB = "";
    public static Connection conexao = Conexao.conectar();
    public static PreparedStatement query;
    public static ResultSet dados;
    
    public Conexao() {
        
    }
    
    public static Connection conectar(){
        try{
            conexao = DriverManager.getConnection(urlDB + nameServerDB + nameDB, hostDB, passwordDB);
            System.out.println("Conectado!");
        }catch(SQLException e){
            System.out.println("Erro ao se conectar com o banco de dados!" + e);
        }
        return conexao;
    }
    
    public static Connection getConexao() {
        return conexao;
    }

    public static void setConexao(Connection conexao) {
        Conexao.conexao = conexao;
    }
    
    public static ResultSet getDados() {
        return dados;
    }

    public static void setDados(ResultSet dados) {
        Conexao.dados = dados;
    }

    public static PreparedStatement getQuery() {
        return query;
    }

    public static void setQuery(PreparedStatement query) {
        Conexao.query = query;
    }
}
