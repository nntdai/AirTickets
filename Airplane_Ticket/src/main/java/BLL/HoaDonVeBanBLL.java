/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.HoaDonVeBanDAO;
import DTO.HoaDonVeBanDTO;
import java.util.List;

/**
 *
 * @author DLCH
 */
public class HoaDonVeBanBLL {
    private HoaDonVeBanDAO HoaDonVeBanDAO = new HoaDonVeBanDAO();

    public List<HoaDonVeBanDTO> findAllhoadonveban() {
        return HoaDonVeBanDAO.findAllhoadonveban();
    }
}
