/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import javax.swing.JTextField;

/**
 *
 * @author luizr
 */
public class ValidaTudo{

    public ValidaTudo() {
    }
    public String ValidaEmpresa(String[] parametros){
        String result = "Favor inserir os dados: ";
        if(parametros[0].equals("")){
            result += "Nome da empresa. ";
        }
        if(parametros[1].equals("")){
            result += "CNPJ da empresa. ";
        }
        if(parametros[2].equals("")){
            result += "Sigla do Estado da empresa. ";
        }
        if(parametros[3].equals("")){
            result += "Cidade da empresa. ";
        }
        if(parametros[4].equals("")){
            result += "Endereço da empresa. ";
        }
        if(parametros[5].equals("")){
            result += "Numero do endereço da empresa. ";
        }else if(parametros[5].equals("0")){
            result += "Numero do endereço da empresa válido. ";
        }
        if(result.equals("Favor inserir os dados: ")){
            result = "";
        }        
        return result;
    }
}
