package DAO;

import DTO.HangThanThietDTO;
import DTO.KhachHangDTO;
import DTO.KhachHangSearchDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {

    public List<KhachHangDTO> search(KhachHangSearchDTO khachHangSearchDTO) {
        List<KhachHangDTO> khachHangDTOList = new ArrayList<>();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT k.cmnd, k.hoTen, k.soDienThoai, k.diaChi, " +
                    "k.ngaySinh, k.diemTichLuy, k.idHangThanThiet, k.tinhTrang, " +
                    "h.id, h.tenHang, h.diemTichLuy, h.khuyenMai\n" +
                    "FROM khachhang k LEFT JOIN hangthanthiet h \n" +
                    "ON k.idHangThanThiet = h.id ");

            // Tìm kiếm theo tên
            stringBuilder.append("WHERE k.hoTen LIKE CONCAT('%', ?, '%') ");  // 1

            // Tìm kiếm theo số điện thoại
            stringBuilder.append("AND k.soDienThoai LIKE CONCAT('%', ?, '%') ");  // 2

            // Tìm kiếm theo địa chỉ
            stringBuilder.append("AND k.diaChi LIKE CONCAT('%', ?, '%') ");  // 3

            // Tìm kiếm theo ngày sinh
            if (!khachHangSearchDTO.getNgaySinhTu().isEmpty()
                    || !khachHangSearchDTO.getNgaySinhDen().isEmpty()) {  // có sự hiện diện của tìm kiếm ngày sinh
                if (khachHangSearchDTO.getNgaySinhTu().isEmpty()) {  // Lấy tất cả những ngày <= toBirthDate
                    stringBuilder.append("AND k.ngaySinh <= ? ");
                } else if (khachHangSearchDTO.getNgaySinhDen().isEmpty()) {
                    stringBuilder.append("AND k.ngaySinh >= ? ");
                } else {
                    stringBuilder.append("AND k.ngaySinh BETWEEN ? AND ? ");
                }
            }

            // Tìm kiếm theo điểm tích lũy
            if ("lt100".equals(khachHangSearchDTO.getDiemTichLuy())) {
                stringBuilder.append("AND k.diemTichLuy < 100 ");
            } else if ("100-200".equals(khachHangSearchDTO.getDiemTichLuy())) {
                stringBuilder.append("AND k.diemTichLuy BETWEEN 100 AND 200 ");
            } else if ("200-300".equals(khachHangSearchDTO.getDiemTichLuy())) {
                stringBuilder.append("AND k.diemTichLuy BETWEEN 200 AND 300 ");
            } else if ("300-500".equals(khachHangSearchDTO.getDiemTichLuy())) {
                stringBuilder.append("AND k.diemTichLuy BETWEEN 300 AND 500 ");
            } else if ("gt500".equals(khachHangSearchDTO.getDiemTichLuy())) {
                stringBuilder.append("AND k.diemTichLuy > 500 ");
            }

            // Tìm kiếm theo hãng thân thiết
            if (!khachHangSearchDTO.getIdHangThanThiet().isEmpty()) {
                stringBuilder.append("AND k.idHangThanThiet = ? ");
            }

            // Tìm kiếm theo tình trạng
            if (!khachHangSearchDTO.getTinhTrang().isEmpty()) {
                stringBuilder.append("AND k.tinhTrang = ? ");
            }

            PreparedStatement preparedStatement = BaseDAO.getConnection()
                    .prepareStatement(stringBuilder.toString());

            byte preparedStatementIndex = 1;
            preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getHoTen());
            preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getSoDienThoai());
            preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getDiaChi());

            if (!khachHangSearchDTO.getNgaySinhTu().isEmpty()
                    || !khachHangSearchDTO.getNgaySinhDen().isEmpty()) {
                if (khachHangSearchDTO.getNgaySinhTu().isEmpty()) {
                    preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getNgaySinhDen());
                } else if (khachHangSearchDTO.getNgaySinhDen().isEmpty()) {
                    preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getNgaySinhTu());
                } else {
                    preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getNgaySinhDen());
                    preparedStatement.setString(preparedStatementIndex++, khachHangSearchDTO.getNgaySinhTu());
                }
            }

            if (!khachHangSearchDTO.getIdHangThanThiet().isEmpty()) {
                preparedStatement.setInt(preparedStatementIndex++, Integer.parseInt(khachHangSearchDTO.getIdHangThanThiet()));
            }

            if (!khachHangSearchDTO.getTinhTrang().isEmpty()) {
                preparedStatement.setBoolean(preparedStatementIndex, Boolean.parseBoolean(khachHangSearchDTO.getTinhTrang()));
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            KhachHangDTO khachHangDTO;
            HangThanThietDTO hangThanThietDTO;
            while (resultSet.next()) {
                khachHangDTO = new KhachHangDTO();
                khachHangDTO.setCmnd(resultSet.getString("cmnd"));
                khachHangDTO.setHoTen(resultSet.getString("hoTen"));
                khachHangDTO.setSoDienThoai(resultSet.getString("soDienThoai"));
                khachHangDTO.setDiaChi(resultSet.getString("diaChi"));
                khachHangDTO.setNgaySinh(LocalDateTime.parse(resultSet.getString("ngaySinh")));
                khachHangDTO.setDiemTichLuy(resultSet.getInt("diemTichLuy"));

                hangThanThietDTO = new HangThanThietDTO();
                hangThanThietDTO.setId(resultSet.getInt("id"));
                hangThanThietDTO.setTenHang(resultSet.getString("tenHang"));
                hangThanThietDTO.setDiemTichLuy(resultSet.getInt("diemTichLuy"));
                hangThanThietDTO.setKhuyenMai(resultSet.getInt("khuyenMai"));

                khachHangDTO.setIdHangThanThiet(hangThanThietDTO);
                khachHangDTO.setTinhTrang(resultSet.getBoolean("tinhTrang"));
                khachHangDTOList.add(khachHangDTO);
            }

            BaseDAO.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return khachHangDTOList;
    }
}
