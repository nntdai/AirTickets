package DTO;

import java.time.LocalDateTime;

public class TaiKhoan {
    private String username;
    private String password;
    private LocalDateTime ngayCap;
    private byte tinhTrang;
    private String cmndNhanVien;

    public TaiKhoan() {
    }

    public TaiKhoan(String username, String password, LocalDateTime ngayCap, byte tinhTrang, String cmndNhanVien) {
        this.username = username;
        this.password = password;
        this.ngayCap = ngayCap;
        this.tinhTrang = tinhTrang;
        this.cmndNhanVien = cmndNhanVien;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(LocalDateTime ngayCap) {
        this.ngayCap = ngayCap;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getCmndNhanVien() {
        return cmndNhanVien;
    }

    public void setCmndNhanVien(String cmndNhanVien) {
        this.cmndNhanVien = cmndNhanVien;
    }
}
