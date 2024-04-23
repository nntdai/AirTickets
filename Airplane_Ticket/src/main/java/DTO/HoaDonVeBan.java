package DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HoaDonVeBan {
    private int id;
    private String idNhanVien;
    private String idKhachHangLapHoaDon;
    private LocalDateTime ngayLapHoaDon;
    private BigDecimal tongTien;
    private byte tinhTrang;

    public HoaDonVeBan() {
    }

    public HoaDonVeBan(int id, String idNhanVien, String idKhachHangLapHoaDon, LocalDateTime ngayLapHoaDon, BigDecimal tongTien, byte tinhTrang) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.idKhachHangLapHoaDon = idKhachHangLapHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tongTien = tongTien;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdKhachHangLapHoaDon() {
        return idKhachHangLapHoaDon;
    }

    public void setIdKhachHangLapHoaDon(String idKhachHangLapHoaDon) {
        this.idKhachHangLapHoaDon = idKhachHangLapHoaDon;
    }

    public LocalDateTime getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(LocalDateTime ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
