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
import Bean.EmpresaBean;
/**
 *
 * @author luizr
 */
public class EmpresaDAO {
    
    //SELECTS
    private static String FIND_BY_PK = "select * from tb_empresa where cd_empresa=?;";
    private static String LIST_ALL = "select * from tb_empresa;";
    //INSERTS
    private static String INSERT_EMPRESA = "insert into tb_empresa(nm_empresa,cd_cnpj_empresa,sg_estado_empresa,nm_cidade_empresa,nm_endereco_empresa,cd_endereco_empresa) values(?,?,?,?,?,?);";
    //UPDATES
    private static String UPDATE_EMPRESA = "update tb_empresa set nm_empresa=?, cd_cnpj_empresa=?, sg_estado_empresa=?, nm_cidade_empresa=?, nm_endereco_empresa=?, cd_endereco_empresa=? where cd_empresa=?;";
    
    public ResultSet findByPk(int cdEmpresa){
        try {
            query = conexao.prepareStatement(FIND_BY_PK);
            query.setInt(1, cdEmpresa);
            dados = query.executeQuery();
            while(dados.next()){
                return dados;
            }
            } catch (SQLException e) {
                return (ResultSet) e;
            }
            return null;
        }
    public static ArrayList<EmpresaBean> ListAll() throws SQLException {
            query = conexao.prepareStatement(LIST_ALL);
            dados = query.executeQuery();
            ArrayList<EmpresaBean> list = new ArrayList<>();
            while(dados.next()){
                EmpresaBean empresaBean = new EmpresaBean(dados.getInt(1),dados.getString(2), dados.getString(3), dados.getString(4), dados.getString(5), dados.getString(6), dados.getInt(7));
                list.add(empresaBean);
            }
            return list;
        }
    public String InsertEmpresa(String nmEmpresa, String cdCnpjEmpresa, String sgEstadoEmpresa, String nmCidadeEmpresa, String nmEnderecoEmpresa, int cdEnderecoEmpresa){
        try{
            query = conexao.prepareStatement(INSERT_EMPRESA);
            query.setString(1, nmEmpresa);
            query.setString(2, cdCnpjEmpresa);
            query.setString(3, sgEstadoEmpresa);
            query.setString(4, nmCidadeEmpresa);
            query.setString(5, nmEnderecoEmpresa);
            query.setInt(6, cdEnderecoEmpresa);
            query.execute();
            return "S";
        }catch (SQLException e){
            return "Erro: " + e;
        }
    }
    public String UpdateEmpresa(int cdEmpresa, String nmEmpresa, String cdCnpjEmpresa, String sgEstadoEmpresa, String nmCidadeEmpresa, String nmEnderecoEmpresa, int cdEnderecoEmpresa){
        try{
            query = conexao.prepareStatement(UPDATE_EMPRESA);
            query.setString(1, nmEmpresa);
            query.setString(2, cdCnpjEmpresa);
            query.setString(3, sgEstadoEmpresa);
            query.setString(4, nmCidadeEmpresa);
            query.setString(5, nmEnderecoEmpresa);
            query.setInt(6, cdEnderecoEmpresa);
            query.setInt(7, cdEmpresa);
            query.execute();
            return "S";
        }catch(SQLException e){
            return "Erro: " + e;
        }
    }
}
