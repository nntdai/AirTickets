/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.HoanVeDAO;
import DTO.HoanVeDTO;
import java.util.List;

/**
 *
 * @author DLCH
 */
public class HoanVeBLL {
    private HoanVeDAO HoanVeDAO = new HoanVeDAO();

    public List<HoanVeDTO> findAllhoanve() {
        return HoanVeDAO.findAllhoanve();
    }
}
