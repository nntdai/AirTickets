package BLL;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import DTO.KhachHangSearchDTO;

import java.util.List;

public class KhachHangBLL {
    private KhachHangDAO khachHangDAO = new KhachHangDAO();

    public List<KhachHangDTO> search(KhachHangSearchDTO khachHangSearchDTO) {
        if (khachHangSearchDTO.getNgaySinhTu() == null) {
            khachHangSearchDTO.setNgaySinhTu("");
        }

        if (khachHangSearchDTO.getNgaySinhDen() == null) {
            khachHangSearchDTO.setNgaySinhDen("");
        }

        if (khachHangSearchDTO.getDiemTichLuy() == null) {
            khachHangSearchDTO.setDiemTichLuy("");
        }

        if (khachHangSearchDTO.getIdHangThanThiet() == null) {
            khachHangSearchDTO.setIdHangThanThiet("");
        }

        if (khachHangSearchDTO.getTinhTrang() == null) {
            khachHangSearchDTO.setTinhTrang("");
        }

        if (khachHangSearchDTO.getGioiTinh() == null) {
            khachHangSearchDTO.setGioiTinh("");
        }

        return khachHangDAO.search(khachHangSearchDTO);
    }
}
