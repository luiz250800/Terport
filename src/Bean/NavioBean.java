/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Argus08
 */
public class NavioBean {
    private int cdNavio;
    private String nmNavio;
    private String dsNavio;

    public NavioBean(int cdNavio, String nmNavio, String dsNavio) {
        this.cdNavio = cdNavio;
        this.nmNavio = nmNavio;
        this.dsNavio = dsNavio;
    }

    public int getCdNavio() {
        return cdNavio;
    }

    public void setCdNavio(int cdNavio) {
        this.cdNavio = cdNavio;
    }

    public String getNmNavio() {
        return nmNavio;
    }

    public void setNmNavio(String nmNavio) {
        this.nmNavio = nmNavio;
    }

    public String getDsNavio() {
        return dsNavio;
    }

    public void setDsNavio(String dsNavio) {
        this.dsNavio = dsNavio;
    }
}
