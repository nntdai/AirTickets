package DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HoanVe {
    private int id;
    private int idVeMayBay;
    private BigDecimal phiHoanVe;
    private String lyDoHoan;
    private LocalDateTime ngayHoan;

    public HoanVe() {
    }

    public HoanVe(int id, int idVeMayBay, BigDecimal phiHoanVe, String lyDoHoan, LocalDateTime ngayHoan) {
        this.id = id;
        this.idVeMayBay = idVeMayBay;
        this.phiHoanVe = phiHoanVe;
        this.lyDoHoan = lyDoHoan;
        this.ngayHoan = ngayHoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVeMayBay() {
        return idVeMayBay;
    }

    public void setIdVeMayBay(int idVeMayBay) {
        this.idVeMayBay = idVeMayBay;
    }

    public BigDecimal getPhiHoanVe() {
        return phiHoanVe;
    }

    public void setPhiHoanVe(BigDecimal phiHoanVe) {
        this.phiHoanVe = phiHoanVe;
    }

    public String getLyDoHoan() {
        return lyDoHoan;
    }

    public void setLyDoHoan(String lyDoHoan) {
        this.lyDoHoan = lyDoHoan;
    }

    public LocalDateTime getNgayHoan() {
        return ngayHoan;
    }

    public void setNgayHoan(LocalDateTime ngayHoan) {
        this.ngayHoan = ngayHoan;
    }

}
