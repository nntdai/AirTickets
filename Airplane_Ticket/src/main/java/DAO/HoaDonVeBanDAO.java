/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.HoaDonVeBanDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DLCH
 */
public class HoaDonVeBanDAO {
    private NhanVienDTO NhanVienDTO;
    private KhachHangDTO KhachHangDTO;
    public List<HoaDonVeBanDTO> findAllhoadonveban()  {
        List<HoaDonVeBanDTO> hoaDonVeBanDTOList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseDAO.getConnection()
                    .prepareStatement("SELECT id, idNhanVien, idKhachHangLapHoaDon, ngayLapHoaDon, tongTien, tinhTrang FROM hoanve");

            ResultSet resultSet = preparedStatement.executeQuery();
            HoaDonVeBanDTO hoaDonVeBanDTO;
            while (resultSet.next()) {
                hoaDonVeBanDTO = new HoaDonVeBanDTO();
                hoaDonVeBanDTO.setId(resultSet.getInt("id"));
                
                NhanVienDTO= new NhanVienDTO();
                NhanVienDTO.setCmnd(resultSet.getString("cmnd"));
                
                KhachHangDTO= new KhachHangDTO();
                KhachHangDTO.setCmnd(resultSet.getString("cmnd"));
                
                hoaDonVeBanDTO.setNgayLapHoaDon(LocalDateTime.parse(resultSet.getString("NgayLapHoaDon")));
                hoaDonVeBanDTO.setTongTien(resultSet.getBigDecimal("TongTien"));
                hoaDonVeBanDTO.setTinhTrang(resultSet.getBoolean("TinhTrang"));
                hoaDonVeBanDTOList.add(hoaDonVeBanDTO);
            }
            BaseDAO.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoaDonVeBanDTOList;
    }
}
