/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author luizr
 */
public class EmpresaBean {
    private int cdEmpresa;
    private String nmEmpresa;
    private String cdCnpjEmpresa;
    private String sgEstadoEmpresa;
    private String nmCidadeEmpresa;
    private String nmEnderecoEmpresa;
    private int cdEnderecoEmpresa;

    public EmpresaBean(int cdEmpresa, String nmEmpresa, String cdCnpjEmpresa, String sgEstadoEmpresa, String nmCidadeEmpresa, String nmEnderecoEmpresa, int cdEnderecoEmpresa) {
        this.cdEmpresa = cdEmpresa;
        this.nmEmpresa = nmEmpresa;
        this.cdCnpjEmpresa = cdCnpjEmpresa;
        this.sgEstadoEmpresa = sgEstadoEmpresa;
        this.nmCidadeEmpresa = nmCidadeEmpresa;
        this.nmEnderecoEmpresa = nmEnderecoEmpresa;
        this.cdEnderecoEmpresa = cdEnderecoEmpresa;
    }

    public int getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(int cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public String getCdCnpjEmpresa() {
        return cdCnpjEmpresa;
    }

    public void setCdCnpjEmpresa(String cdCnpjEmpresa) {
        this.cdCnpjEmpresa = cdCnpjEmpresa;
    }

    public String getSgEstadoEmpresa() {
        return sgEstadoEmpresa;
    }

    public void setSgEstadoEmpresa(String sgEstadoEmpresa) {
        this.sgEstadoEmpresa = sgEstadoEmpresa;
    }

    public String getNmCidadeEmpresa() {
        return nmCidadeEmpresa;
    }

    public void setNmCidadeEmpresa(String nmCidadeEmpresa) {
        this.nmCidadeEmpresa = nmCidadeEmpresa;
    }

    public String getNmEnderecoEmpresa() {
        return nmEnderecoEmpresa;
    }

    public void setNmEnderecoEmpresa(String nmEnderecoEmpresa) {
        this.nmEnderecoEmpresa = nmEnderecoEmpresa;
    }

    public int getCdEnderecoEmpresa() {
        return cdEnderecoEmpresa;
    }

    public void setCdEnderecoEmpresa(int cdEnderecoEmpresa) {
        this.cdEnderecoEmpresa = cdEnderecoEmpresa;
    }

}
