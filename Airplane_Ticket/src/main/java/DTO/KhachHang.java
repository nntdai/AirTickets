package DTO;

import java.time.LocalDateTime;

public class KhachHang {
    private String cmnd;
    private String hoTen;
    private String soDienThoai;
    private String diaChi;
    private LocalDateTime ngaySinh;
    private int diemTichLuy;
    private int idHangThanThiet;
    private byte tinhTrang;

    public KhachHang() {
    }

    public KhachHang(String cmnd, String hoTen, String soDienThoai, String diaChi, LocalDateTime ngaySinh, int diemTichLuy, int idHangThanThiet, byte tinhTrang) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.diemTichLuy = diemTichLuy;
        this.idHangThanThiet = idHangThanThiet;
        this.tinhTrang = tinhTrang;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public int getIdHangThanThiet() {
        return idHangThanThiet;
    }

    public void setIdHangThanThiet(int idHangThanThiet) {
        this.idHangThanThiet = idHangThanThiet;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
