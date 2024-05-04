/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.SanBayDTO;
import DAO.BaseDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author ADMIN
 */
public class SanBayDAO {     
    public Vector<SanBayDTO> DanhSachSanBayKhaDung() throws SQLException
    {
   
        Vector<SanBayDTO> arr = new Vector<SanBayDTO>();
        Connection con=BaseDAO.getConnection();
        if (con!=null) {
        try {
        System.out.println("Kết nối thành công");
        String sql = "Select * from sanbay where status=1";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
        {
        SanBayDTO sanbay = new SanBayDTO();
        sanbay.setMaSanBay(rs.getString("maSanBay"));
        sanbay.setTen(rs.getString("ten"));
        sanbay.setStatus(rs.getBoolean("status"));
        arr.add(sanbay);
        }
        System.out.println(arr);
        } catch (SQLException ex) {
        System.out.println(ex);
        } finally {
        BaseDAO.closeConnection();
        } }
        return arr;
        }
   
    
    
    
}
