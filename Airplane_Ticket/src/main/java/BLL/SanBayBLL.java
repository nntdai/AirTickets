/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.SanBayDAO;
import DTO.SanBayDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SanBayBLL {
    SanBayDAO sanbayDAO=new SanBayDAO();
    Vector<SanBayDTO> dsSanBay = new Vector<SanBayDTO>();

    public SanBayBLL() {
        try {
            dsSanBay=sanbayDAO.DanhSachSanBayKhaDung();
        } catch (SQLException ex) {
            Logger.getLogger(SanBayBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public Vector<SanBayDTO> DanhSachSanBayKhaDung() throws SQLException
     {
         return dsSanBay;
     }
     public Vector<SanBayDTO> SearchSanBay(String str)
     {
         Vector<SanBayDTO> dsSanBaySearch = new Vector<SanBayDTO>();
         for (SanBayDTO a:dsSanBay)
         {
             if ((a.getMaSanBay().toLowerCase().contains(str.toLowerCase()))||a.getTen().toLowerCase().contains(str.toLowerCase()))
                 dsSanBaySearch.add(a);
         }
         return dsSanBaySearch;
     }
    
}
