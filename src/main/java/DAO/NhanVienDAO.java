/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.HangThanThietDTO;
import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class NhanVienDAO {

    List<NhanVienDTO> nhanvienList = new ArrayList<>();

    public List<NhanVienDTO> getAll() {
        try {
            PreparedStatement preparedStatement = BaseDAO.getConnection()
                    .prepareStatement("SELECT cmnd, ho, ten, soDienThoai FROM nhanvien");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                NhanVienDTO nhanvien = new NhanVienDTO();
                nhanvien.setCmnd(resultSet.getString("cmnd"));
                nhanvien.setHo(resultSet.getString("ho"));
                nhanvien.setTen(resultSet.getString("ten"));
                nhanvien.setSoDienThoai(resultSet.getString("soDienThoai"));
                nhanvienList.add(nhanvien);
            }
            BaseDAO.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanvienList;
    }

    public void insertone(NhanVienDTO nhanvien) {
        try {
            // Tạo câu lệnh SQL insert dữ liệu vào bảng nhanvien
            String sql = "INSERT INTO nhanvien (cmnd, soDienThoai, ho, ten, ngaySinh, gioiTinh, tinhTrang) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Lấy kết nối tới cơ sở dữ liệu
            Connection connection = BaseDAO.getConnection();

            // Tạo PreparedStatement với câu lệnh SQL insert
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Thiết lập giá trị cho các tham số trong câu lệnh SQL insert từ đối tượng NhanVienDTO
            preparedStatement.setString(1, nhanvien.getCmnd());
            preparedStatement.setString(2, nhanvien.getSoDienThoai());
            preparedStatement.setString(3, nhanvien.getHo());
            preparedStatement.setString(4, nhanvien.getTen());
            preparedStatement.setDate(5, nhanvien.getNgaySinh());
            preparedStatement.setBoolean(6, nhanvien.isGioiTinh());
            preparedStatement.setBoolean(7, true);

            // Thực thi câu lệnh insert
            int rowsInserted = preparedStatement.executeUpdate();

            // Đóng kết nối
            BaseDAO.closeConnection();

            if (rowsInserted > 0) {
                System.out.println("Dữ liệu đã được chèn thành công vào bảng nhanvien!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<NhanVienDTO> getAllDB() {
        try {
            PreparedStatement preparedStatement = BaseDAO.getConnection()
                    .prepareStatement("SELECT * FROM nhanvien");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                NhanVienDTO nhanvien = new NhanVienDTO();
                nhanvien.setCmnd(resultSet.getString("cmnd"));
                nhanvien.setHo(resultSet.getString("ho"));
                nhanvien.setTen(resultSet.getString("ten"));
                nhanvien.setSoDienThoai(resultSet.getString("soDienThoai"));
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.sql.Date sqlDate = resultSet.getDate("ngaySinh");
                java.util.Date parsedDate = new java.util.Date(sqlDate.getTime());
                nhanvien.setNgaySinh(new Date(parsedDate.getTime()));
                nhanvienList.add(nhanvien);
            }
            BaseDAO.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanvienList;
    }

    public void updateTT(String cmnd) throws SQLException {
        PreparedStatement preparedStatement = BaseDAO.getConnection()
                .prepareStatement("UPDATE nhanvien SET tinhTrang = ? WHERE cmnd = ?");
        preparedStatement.setByte(1, (byte) 0);
        preparedStatement.setString(2, cmnd);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.print("da cap nhat");
        }

    }

    public void update(NhanVienDTO nhanvien, String manv) throws SQLException {
        // Tạo PreparedStatement với câu lệnh SQL insert
        String sql = "UPDATE nhanvien SET cmnd= ?,soDienThoai=?,ho=?,ten=?,ngaySinh=?,gioiTinh=? WHERE cmnd = ?";
        Connection connection = BaseDAO.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // Thiết lập giá trị cho các tham số trong câu lệnh SQL insert từ đối tượng NhanVienDTO
        preparedStatement.setString(1, nhanvien.getCmnd());
        preparedStatement.setString(2, nhanvien.getSoDienThoai());
        preparedStatement.setString(3, nhanvien.getHo());
        preparedStatement.setString(4, nhanvien.getTen());
        preparedStatement.setDate(5, nhanvien.getNgaySinh());
        preparedStatement.setBoolean(6, nhanvien.isGioiTinh());
        preparedStatement.setString(7, manv);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.print("da cap nhat");
        }

        // Đóng kết nối
        BaseDAO.closeConnection();

    }

    public List<NhanVienDTO> Search(String keyword, String searchType) {
        List<NhanVienDTO> nhanVienList = new ArrayList<>();
        try {
            Connection connection = BaseDAO.getConnection();
            PreparedStatement preparedStatement = null;

            String sql = "SELECT cmnd, ho, ten, soDienThoai FROM nhanvien WHERE ";

            if (searchType.equals("name")) {
                sql += "CONCAT(ho, ' ', ten) LIKE ?";
            } else if (searchType.equals("phone")) {
                sql += "soDienThoai = ?";
            } else if (searchType.equals("id")) {
                sql += "cmnd = ?";
            } else if (searchType.equals("all")) {
                sql += "CONCAT(ho, ' ', ten) LIKE ? OR soDienThoai = ? OR cmnd = ?";
            }

            preparedStatement = connection.prepareStatement(sql);

            if (searchType.equals("all")) {
                preparedStatement.setString(1, "%" + keyword + "%");
                preparedStatement.setString(2, keyword);
                preparedStatement.setString(3, keyword);
            } else {
                preparedStatement.setString(1, "%" + keyword + "%");
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            // Duyệt qua kết quả và thêm vào danh sách nhanVienList
            while (resultSet.next()) {
                NhanVienDTO nhanvien = new NhanVienDTO();
                nhanvien.setCmnd(resultSet.getString("cmnd"));
                nhanvien.setHo(resultSet.getString("ho"));
                nhanvien.setTen(resultSet.getString("ten"));
                nhanvien.setSoDienThoai(resultSet.getString("soDienThoai"));
                nhanVienList.add(nhanvien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanVienList;
    }

}
