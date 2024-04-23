package DTO;

import java.math.BigDecimal;

public class LoaiVeMayBay {
    private int id;
    private int idChuyenBay;
    private String hangVe;
    private BigDecimal giaVe;
    private int soLuongVeTong;
    private int soLuongVeCon;
    private byte tinhTrang;

    public LoaiVeMayBay() {
    }

    public LoaiVeMayBay(int id, int idChuyenBay, String hangVe, BigDecimal giaVe, int soLuongVeTong, int soLuongVeCon, byte tinhTrang) {
        this.id = id;
        this.idChuyenBay = idChuyenBay;
        this.hangVe = hangVe;
        this.giaVe = giaVe;
        this.soLuongVeTong = soLuongVeTong;
        this.soLuongVeCon = soLuongVeCon;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdChuyenBay() {
        return idChuyenBay;
    }

    public void setIdChuyenBay(int idChuyenBay) {
        this.idChuyenBay = idChuyenBay;
    }

    public String getHangVe() {
        return hangVe;
    }

    public void setHangVe(String hangVe) {
        this.hangVe = hangVe;
    }

    public BigDecimal getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(BigDecimal giaVe) {
        this.giaVe = giaVe;
    }

    public int getSoLuongVeTong() {
        return soLuongVeTong;
    }

    public void setSoLuongVeTong(int soLuongVeTong) {
        this.soLuongVeTong = soLuongVeTong;
    }

    public int getSoLuongVeCon() {
        return soLuongVeCon;
    }

    public void setSoLuongVeCon(int soLuongVeCon) {
        this.soLuongVeCon = soLuongVeCon;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
