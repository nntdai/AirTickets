package DTO;

public class VeMayBay {
    private int id;
    private int idHoaDonVeBan;
    private String idKhachHang;
    private int idLoaiVeMayBay;
    private byte tinhTrang;

    public VeMayBay() {
    }

    public VeMayBay(int id, int idHoaDonVeBan, String idKhachHang, int idLoaiVeMayBay, byte tinhTrang) {
        this.id = id;
        this.idHoaDonVeBan = idHoaDonVeBan;
        this.idKhachHang = idKhachHang;
        this.idLoaiVeMayBay = idLoaiVeMayBay;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHoaDonVeBan() {
        return idHoaDonVeBan;
    }

    public void setIdHoaDonVeBan(int idHoaDonVeBan) {
        this.idHoaDonVeBan = idHoaDonVeBan;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdLoaiVeMayBay() {
        return idLoaiVeMayBay;
    }

    public void setIdLoaiVeMayBay(int idLoaiVeMayBay) {
        this.idLoaiVeMayBay = idLoaiVeMayBay;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
