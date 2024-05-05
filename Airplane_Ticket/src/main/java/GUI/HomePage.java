/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.TaiKhoanDTO;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * @author User
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
   private JPanel cardPanel;
    private CardLayout cardLayout;
    TimChuyenBay_panel timchuyenbay = new TimChuyenBay_panel(this);
     Ticket_Book_panel ticket_book ;
    /**
     * Creates new form Customer
     */
    public HomePage(TaiKhoanDTO taikhoan ) {
        initComponents();
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.add(timchuyenbay, "panel1");
        cardLayout.show(cardPanel, "panel1");
        jTabbedPane1.addTab("Đặt vé",cardPanel);
        jLabel2.setText("Xin chào "+ taikhoan.getCmndNhanVien().getHo()+" " + taikhoan.getCmndNhanVien().getTen());
        
    }
    public void chonVeMayBay()
    {
       
        arline_Ticket_Panel1= new Arline_Ticket_Panel(this);
        cardPanel.add(arline_Ticket_Panel1, "panel2");
        cardLayout.show(cardPanel, "panel2");
    }
    public void lapHoaDon()
    {
        
        Ticket_Book_panel ticket_book = new Ticket_Book_panel(this);
        cardPanel.add(ticket_book, "panel3");
        
        cardLayout.show(cardPanel, "panel3");
        
    }
    public void chonChuyenBay()
    {
        cardLayout.show(cardPanel, "panel1");
    }

    public TimChuyenBay_panel getTimchuyenbay() {
        return timchuyenbay;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        thongKe1 = new GUI.ThongKe();
        arline_Ticket_Panel1 = new GUI.Arline_Ticket_Panel();
        ticket_Type_Panel1 = new GUI.Ticket_Type_Panel();
        ticket_Type_Panel3 = new GUI.Ticket_Type_Panel();
        customer1 = new GUI.Customer();
        staff1 = new GUI.Staff();
        bill_Panel1 = new GUI.Bill_Panel();
        bill_Panel2 = new GUI.Bill_Panel();
        mayBay_Panel1 = new GUI.MayBay_Panel();
        sanBay_Panel1 = new GUI.SanBay_Panel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(975, 465));
        jTabbedPane1.addTab("Thống kê", thongKe1);
        jTabbedPane1.addTab("Đặt vé", arline_Ticket_Panel1);

        javax.swing.GroupLayout ticket_Type_Panel1Layout = new javax.swing.GroupLayout(ticket_Type_Panel1);
        ticket_Type_Panel1.setLayout(ticket_Type_Panel1Layout);
        ticket_Type_Panel1Layout.setHorizontalGroup(ticket_Type_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ticket_Type_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE));
        ticket_Type_Panel1Layout.setVerticalGroup(ticket_Type_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ticket_Type_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jTabbedPane1.addTab("Loại vé", ticket_Type_Panel1);
        jTabbedPane1.addTab("Khách hàng", customer1);
        jTabbedPane1.addTab("Nhân viên", staff1);

        javax.swing.GroupLayout bill_Panel1Layout = new javax.swing.GroupLayout(bill_Panel1);
        bill_Panel1.setLayout(bill_Panel1Layout);
        bill_Panel1Layout.setHorizontalGroup(bill_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bill_Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE));
        bill_Panel1Layout.setVerticalGroup(bill_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bill_Panel1Layout.createSequentialGroup().addComponent(bill_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));

        jTabbedPane1.addTab("Hóa đơn", bill_Panel1);
        jTabbedPane1.addTab("Máy bay", mayBay_Panel1);
        jTabbedPane1.addTab("Sân bay", sanBay_Panel1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        jTabbedPane1.getAccessibleContext().setAccessibleParent(jTabbedPane1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Airplane Ticker Store");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mon, 23/12/2023, 11:30");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText(" Xin chào Xuân Trúc !");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE).addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)));

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Arline_Ticket_Panel arline_Ticket_Panel1;
    private GUI.Bill_Panel bill_Panel1;
    private GUI.Bill_Panel bill_Panel2;
    private GUI.Customer customer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private GUI.MayBay_Panel mayBay_Panel1;
    private GUI.SanBay_Panel sanBay_Panel1;
    private GUI.Staff staff1;
    private GUI.ThongKe thongKe1;
    private GUI.Ticket_Type_Panel ticket_Type_Panel1;
    private GUI.Ticket_Type_Panel ticket_Type_Panel3;
    // End of variables declaration//GEN-END:variables
}
