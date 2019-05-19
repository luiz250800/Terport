/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Conexao.Conexao.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Bean.NavioBean;
/**
 *
 * @author luizr
 */
public class NavioDAO {
    //SELECTS
    private static String FIND_BY_PK = "select * from tb_navio where cd_navio=?;";
    private static String LIST_ALL = "select * from tb_navio;";
    //INSERTS
    private static String INSERT_NAVIO = "insert into tb_navio values(?,?,?);";
    
    public ResultSet findByPk(int cdNavio){
        try {
            query = conexao.prepareStatement(FIND_BY_PK);
            query.setInt(1, cdNavio);
            dados = query.executeQuery();
            while(dados.next()){
                return dados;
            }
            } catch (SQLException e) {
                return (ResultSet) e;
            }
            return null;
        }
    public static ArrayList<NavioBean> ListAll() throws SQLException {
            query = conexao.prepareStatement(LIST_ALL);
            dados = query.executeQuery();
            ArrayList<NavioBean> list = new ArrayList<>();
            while(dados.next()){
                NavioBean navioBean = new NavioBean(dados.getInt(1),dados.getString(2), dados.getString(3));
                list.add(navioBean);
            }
            return list;
        }
}
