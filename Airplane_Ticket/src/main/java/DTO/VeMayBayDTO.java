package DTO;

public class VeMayBayDTO {
    private int id;
    private HoaDonVeBanDTO idHoaDonVeBan;
    private KhachHangDTO idKhachHang;
    private LoaiVeMayBayDTO idLoaiVeMayBay;
    private byte tinhTrang;

    public VeMayBayDTO() {
    }

    public VeMayBayDTO(int id, HoaDonVeBanDTO idHoaDonVeBan, KhachHangDTO idKhachHang, LoaiVeMayBayDTO idLoaiVeMayBay, byte tinhTrang) {
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

    public HoaDonVeBanDTO getIdHoaDonVeBan() {
        return idHoaDonVeBan;
    }

    public void setIdHoaDonVeBan(HoaDonVeBanDTO idHoaDonVeBan) {
        this.idHoaDonVeBan = idHoaDonVeBan;
    }

    public KhachHangDTO getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(KhachHangDTO idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public LoaiVeMayBayDTO getIdLoaiVeMayBay() {
        return idLoaiVeMayBay;
    }

    public void setIdLoaiVeMayBay(LoaiVeMayBayDTO idLoaiVeMayBay) {
        this.idLoaiVeMayBay = idLoaiVeMayBay;
    }

    public byte getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(byte tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
