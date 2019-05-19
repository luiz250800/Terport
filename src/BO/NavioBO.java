/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;
import Bean.NavioBean;
import Dao.NavioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author luizr
 */
public class NavioBO {
        
        private NavioDAO NavioDAO;
        
        public NavioBO() {
            this.NavioDAO = new NavioDAO();
        }

        public ResultSet findByPk(int cdNavio){
            ResultSet dados = this.NavioDAO.findByPk(cdNavio);
            return dados;
        }
        public ArrayList<NavioBean> listAll() throws SQLException{
            ArrayList<NavioBean> dados = this.NavioDAO.ListAll();
            return dados;
        }
}
