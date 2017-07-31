package po;

import java.util.Date;

public class Employee {
    private Long eNo;

    private String eName;

    private String ePsw;

    private String eTel;

    private Date eBdate;

    private Long eDevelopNo;

    private String eSex;

    public Long geteNo() {
        return eNo;
    }

    public void seteNo(Long eNo) {
        this.eNo = eNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String getePsw() {
        return ePsw;
    }

    public void setePsw(String ePsw) {
        this.ePsw = ePsw == null ? null : ePsw.trim();
    }

    public String geteTel() {
        return eTel;
    }

    public void seteTel(String eTel) {
        this.eTel = eTel == null ? null : eTel.trim();
    }

    public Date geteBdate() {
        return eBdate;
    }

    public void seteBdate(Date eBdate) {
        this.eBdate = eBdate;
    }

    public Long geteDevelopNo() {
        return eDevelopNo;
    }

    public void seteDevelopNo(Long eDevelopNo) {
        this.eDevelopNo = eDevelopNo;
    }

    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex == null ? null : eSex.trim();
    }
}