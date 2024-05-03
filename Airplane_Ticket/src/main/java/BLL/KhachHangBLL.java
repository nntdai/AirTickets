package BLL;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import DTO.KhachHangSearchDTO;
import GUI.Customer_Add_Dialog;
import Util.DateJcalendarUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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

    public KhachHangDTO findByCMND(String cmnd) {
        return khachHangDAO.findByCMND(cmnd);
    }

    public boolean delete(KhachHangDTO khachHangDTO) {
        return khachHangDAO.delete(khachHangDTO);
    }

    public boolean create(KhachHangDTO khachHangDTO) {
        return khachHangDAO.create(khachHangDTO);
    }

    public void validate(StringBuilder errorMessage, Customer_Add_Dialog customer_add_dialog) {
        String cmndStr = customer_add_dialog.getCmnd().getText();
        String nameStr = customer_add_dialog.getTextFieldName();
        String birthDateStr = DateJcalendarUtil.formatDate(customer_add_dialog.getBirthDate().getDate());
        String genderStr = customer_add_dialog.getGender().getSelectedItem().toString();
        String phoneNumberStr = customer_add_dialog.getPhoneNumber().getText();
        String addressStr = customer_add_dialog.getAddress().getText();

        if (cmndStr.isEmpty()) {
            errorMessage.append("Căn cước công dân không được để trống\n");
        } else if (!cmndStr.matches("^[0-9]+$")) {
            errorMessage.append("Căn cước công dân không hợp lệ\n");
        } else if (cmndStr.length() != 12) {
            errorMessage.append("Căn cước công dân bắt buộc phải có 12 số\n");
        }

        if (nameStr.isEmpty()) {
            errorMessage.append("Tên không được để trống\n");
        } else if (!nameStr.matches("^[a-zA-ZÀ-Ỹà-ỹ\\s]+$")) {
            errorMessage.append("Tên không được chứa kí tự đặc biệt và số\n");
        }

        if (birthDateStr == null) {
            errorMessage.append("Bắt buộc phải chọn ngày sinh\n");
        } else {
            LocalDate birthDate = LocalDate.parse(birthDateStr);
            int currentYear = LocalDate.now().getYear(); // lấy ra năm hiện tại
            if (currentYear - birthDate.getYear() <= 14) {
                errorMessage.append("Bắt buộc phải từ 14 tuổi\n");
            }
        }

        if (genderStr.equalsIgnoreCase("Tất cả")) {
            errorMessage.append("Bắt buộc phải chọn giới tính\n");
        }

        if (phoneNumberStr.isEmpty()) {
            errorMessage.append("Số điện thoại không được để trống\n");
        } else if (!phoneNumberStr.matches("^0[0-9]+$")) {
            errorMessage.append("Số điện thoại không hợp lệ, số hợp lệ là [0xxx] với xxx là 0-9\n");
        } else if (phoneNumberStr.length() > 11) {
            errorMessage.append("Số điện thoại tối đa 11 số\n");
        } else if (phoneNumberStr.length() < 10){
            errorMessage.append("Số điện thoại tối thiểu 10 số\n");
        }

        if (addressStr.isEmpty()) {
            errorMessage.append("Địa chỉ không được để trống\n");
        }
    }

    public void validateCmndExists(StringBuilder errorMessage, Customer_Add_Dialog customer_add_dialog) {
        String cmndStr = customer_add_dialog.getCmnd().getText();

        if (khachHangDAO.findByCMND(cmndStr) != null) {
            errorMessage.append("Căn cước công dân đã tồn tại trong hệ thống\n");
        }
    }

    public void validatePhoneNumberExists(StringBuilder errorMessage, Customer_Add_Dialog customer_add_dialog) {
        String phoneNumberStr = customer_add_dialog.getPhoneNumber().getText();

        if (khachHangDAO.findByPhoneNumber(phoneNumberStr) != null) {
            errorMessage.append("Số điện thoại đã tồn tại trong hệ thống\n");
        }
    }
}
