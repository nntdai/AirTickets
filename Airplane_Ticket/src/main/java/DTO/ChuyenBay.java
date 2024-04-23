package DTO;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ChuyenBay {
    private int id;
    private int idMayBay;
    private String maSanBayDi;
    private String maSanBayDen;
    private LocalDateTime ngayDi;
    private LocalDateTime ngayDen;
    private LocalTime thoiGianBay;
    private String ghiChu;
    private byte tinhTrang;

    public ChuyenBay() {
    }

    public ChuyenBay(int id, int idMayBay, String maSanBayDi, String maSanBayDen, LocalDateTime ngayDi, LocalDateTime ngayDen, LocalTime thoiGianBay, String ghiChu, byte tinhTrang) {
        this.id = id;
        this.idMayBay = idMayBay;
        this.maSanBayDi = maSanBayDi;
        this.maSanBayDen = maSanBayDen;
        this.ngayDi = ngayDi;
        this.ngayDen = ngayDen;
        this.thoiGianBay = thoiGianBay;
        this.ghiChu = ghiChu;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMayBay() {
        return idMayBay;
    }

    public void setIdMayBay(int idMayBay) {
        this.idMayBay = idMayBay;
    }

    public String getMaSanBayDi() {
        return maSanBayDi;
    }

    public void setMaSanBayDi(String maSanBayDi) {
        this.maSanBayDi = maSanBayDi;
    }

    public String getMaSanBayDen() {
        return maSanBayDen;
    }

    public void setMaSanBayDen(String maSanBayDen) {
        this.maSanBayDen = maSanBayDen;
    }

    public LocalDateTime getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(LocalDateTime ngayDi) {
        this.ngayDi = ngayDi;
    }

    public LocalDateTime getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(LocalDateTime ngayDen) {
        this.ngayDen = ngayDen;
    }

    public LocalTime getThoiGianBay() {
        return thoiGianBay;
    }

    public void setThoiGianBay(LocalTime thoiGianBay) {
        this.thoiGianBay = thoiGianBay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
