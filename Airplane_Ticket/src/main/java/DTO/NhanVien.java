package DTO;

import java.time.LocalDateTime;

public class NhanVien {
    private String cmnd;
    private String soDienThoai;
    private String ho;
    private String ten;
    private LocalDateTime ngaySinh;
    private byte GioiTinh;
    private byte TinhTrang;

    public NhanVien() {
    }

    public NhanVien(String cmnd, String soDienThoai, String ho, String ten, LocalDateTime ngaySinh, byte gioiTinh, byte tinhTrang) {
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        GioiTinh = gioiTinh;
        TinhTrang = tinhTrang;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public byte getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(byte gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public byte getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        TinhTrang = tinhTrang;
    }
}
