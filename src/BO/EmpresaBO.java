/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import Bean.EmpresaBean;
import Dao.EmpresaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luizr
 */
public class EmpresaBO {
        private EmpresaDAO EmpresaDAO;
        
        public EmpresaBO() {
            this.EmpresaDAO = new EmpresaDAO();
        }

        public ResultSet findByPk(int cdNavio){
            ResultSet dados = this.EmpresaDAO.findByPk(cdNavio);
            return dados;
        }
        public ArrayList<EmpresaBean> listAll() throws SQLException{
            ArrayList<EmpresaBean> dados = this.EmpresaDAO.ListAll();
            return dados;
        }
        public String insertEmpresa(String nmEmpresa, String cdCnpjEmpresa, String sgEstadoEmpresa, String nmCidadeEmpresa, String nmEnderecoEmpresa, int cdEnderecoEmpresa){
            String insert = this.EmpresaDAO.InsertEmpresa(nmEmpresa, cdCnpjEmpresa, sgEstadoEmpresa, nmCidadeEmpresa, nmEnderecoEmpresa, cdEnderecoEmpresa);
            return insert;
        }
        public String updateEmpresa(int cdEmpresa, String nmEmpresa, String cdCnpjEmpresa, String sgEstadoEmpresa, String nmCidadeEmpresa, String nmEnderecoEmpresa, int cdEnderecoEmpresa){
            String update = this.EmpresaDAO.UpdateEmpresa(cdEmpresa, nmEmpresa, cdCnpjEmpresa, sgEstadoEmpresa, nmCidadeEmpresa, nmEnderecoEmpresa, cdEnderecoEmpresa);
            return update;
        }
}
