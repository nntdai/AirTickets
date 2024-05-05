/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.HoanVeDTO;
import DTO.VeMayBayDTO;
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
public class HoanVeDAO {
    private VeMayBayDTO veMayBayDTO;
    public List<HoanVeDTO> findAllhoanve()  {
        List<HoanVeDTO> hoanVeDTOList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseDAO.getConnection()
                    .prepareStatement("SELECT id, idVeMayBay, phiHoanVe, lyDoHoan, ngayHoan FROM hoanve");

            ResultSet resultSet = preparedStatement.executeQuery();
            HoanVeDTO hoanVeDTO;
            while (resultSet.next()) {
                hoanVeDTO = new HoanVeDTO();
                hoanVeDTO.setId(resultSet.getInt("id"));
                
                veMayBayDTO= new VeMayBayDTO();
                veMayBayDTO.setId(resultSet.getInt("id"));
                
                hoanVeDTO.setPhiHoanVe(resultSet.getBigDecimal("phiHoanVe"));
                hoanVeDTO.setLyDoHoan(resultSet.getString("lyDoHoan"));
                hoanVeDTO.setNgayHoan(LocalDateTime.parse(resultSet.getString("ngayHoan")));
                hoanVeDTOList.add(hoanVeDTO);
            }
            BaseDAO.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoanVeDTOList;
    }
}
