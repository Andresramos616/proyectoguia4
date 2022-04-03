/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORMULARIOS;

import CONEXION.CONECTAR;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class FACTURA extends javax.swing.JFrame {

     CONECTAR enlace = new CONECTAR();
        Connection conect = enlace.conectar();
       
    public FACTURA() {
        initComponents();
        
         
    }

     //este metodo nos permite cojer el dato ingresado y poder compararlo con el dato que fue previamente ingresado o ya estaba ingresado
    // en la base de datos y con la comparacion nos permite traer otros datos de la tabla que se busca usar
    
    public void bus_pro(){
        String[] registros=new String[2];
        String sql="";
        String pro;
        pro=COD1.getText();
        
        sql="SELECT producto,precio FROM producto where id_produc='"+pro+"'";
        
        Statement st;
        try{ 
            st=conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
               PROD_COD.setText(rs.getString("producto"));
               PRE.setText(rs.getString("precio"));
           } 
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        bloquear();
    }
    
     //este metodo nos permite cojer el dato ingresado y poder compararlo con el dato que fue previamente ingresado o ya estaba ingresado
    // en la base de datos y con la comparacion nos permite traer otros datos de la tabla que se busca usar
    
     public void bus_cliente(){
        String[] registros=new String[2];
        String sql="";
        String clie;
        clie=ID_CLIEN.getText();
        
        sql="SELECT nombre FROM clientes where id_clientes='"+clie+"'";
        
        Statement st;
        try{ 
            st=conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
               NOMBRE_CLIEN.setText(rs.getString("nombre"));
               
           } 
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        bloquear();
    }
     
     //este nos permite que como son espacios de texto que se van a rellenar gracias al metodo buscar 
     //estos los inhabilitaremos para evitar modificar datos y errores
     
     public void bloquear(){
         PROD_COD.setEditable(false);
         
         
         PRE.setEditable(false);
         
         
         NOMBRE_CLIEN.setEditable(false);
        // NOMBRE_CLIEN.setEnabled(false);
         
         
         
         NOM_ADMIN.setEditable(false);
         //NOM_ADMIN.setEnabled(false);
         
         
     }
     
     //este metodo nos permite cojer el dato ingresado y poder compararlo con el dato que fue previamente ingresado o ya estaba ingresado
    // en la base de datos y con la comparacion nos permite traer otros datos de la tabla que se busca usar
     
      public void bus_admin(){
        String[] registros=new String[2];
        String sql="";
        String admin;
        admin=ID_ADMIN.getText();
        
        sql="SELECT nombre FROM empleado where id_empleado='"+admin+"'";
        
        Statement st;
        try{ 
            st=conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
               NOM_ADMIN.setText(rs.getString("nombre"));
               
                          } 
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        bloquear();
    }
      
      //este metodo nos permite hacer la respectiva suma de el valor unitario y la cantidad para hallar el sub total para luego este servir para hallar el total

      public void suma(){
   int num1,num2,tot;
   num1=Integer.parseInt(PRE.getText());
   num2=Integer.parseInt(CANT.getText());
   tot=num1*num2;
   SUB.setText(String.valueOf(tot));

}
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PROD_COD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CANT = new javax.swing.JTextField();
        AGRE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        SUB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PREFA = new javax.swing.JTable();
        LABEL = new javax.swing.JLabel();
        ID_CLIEN = new javax.swing.JTextField();
        LABELL = new javax.swing.JLabel();
        NOMBRE_CLIEN = new javax.swing.JTextField();
        COMPR = new javax.swing.JButton();
        CAL = new javax.swing.JButton();
        COD1 = new javax.swing.JTextField();
        ELIM = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID_FAC = new javax.swing.JTextField();
        LABEL1 = new javax.swing.JLabel();
        ID_ADMIN = new javax.swing.JTextField();
        LABELLLL = new javax.swing.JLabel();
        NOM_ADMIN = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(208, 236, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("COD PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("NOMBRE PROD");

        PROD_COD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROD_CODActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("PRECIO");

        PRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("CANTIDAD");

        CANT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CANTKeyPressed(evt);
            }
        });

        AGRE.setText("AGREGAR");
        AGRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("SUB_TOTAL");

        SUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBActionPerformed(evt);
            }
        });

        PREFA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PREFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°Factura", "Cod_Producto", "Producto", "Cantidad", "Precio_Uni", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PREFA);

        LABEL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LABEL.setText("ID CLIENTE");

        ID_CLIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_CLIENActionPerformed(evt);
            }
        });
        ID_CLIEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ID_CLIENKeyPressed(evt);
            }
        });

        LABELL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LABELL.setText("NOMBRE");

        NOMBRE_CLIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRE_CLIENActionPerformed(evt);
            }
        });

        COMPR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        COMPR.setText("Generar Venta");
        COMPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRActionPerformed(evt);
            }
        });

        CAL.setText("CALCULAR");
        CAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALActionPerformed(evt);
            }
        });

        COD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COD1ActionPerformed(evt);
            }
        });
        COD1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                COD1KeyPressed(evt);
            }
        });

        ELIM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ELIM.setText("Limpiar");
        ELIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(232, 246, 243));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-visual-studio-logo-100.png"))); // NOI18N
        jLabel10.setText("TECNO_STORE");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setText("Factura N°");

        ID_FAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_FACActionPerformed(evt);
            }
        });
        ID_FAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ID_FACKeyPressed(evt);
            }
        });

        LABEL1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LABEL1.setText("ID Vendedor");

        ID_ADMIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ID_ADMINKeyPressed(evt);
            }
        });

        LABELLLL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LABELLLL.setText("Nombre vendedor");

        NOM_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOM_ADMINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_FAC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ID_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LABELLLL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOM_ADMIN)))
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ID_FAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL1)
                    .addComponent(ID_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABELLLL)
                    .addComponent(NOM_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(229, 231, 233));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Sistema de ventas y Facturacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Total a Pagar :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LABEL)
                                .addGap(18, 18, 18)
                                .addComponent(ID_CLIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(COD1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LABELL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NOMBRE_CLIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CAL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AGRE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PROD_COD, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(PRE, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CANT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(ELIM)
                                .addGap(18, 18, 18)
                                .addComponent(COMPR)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(COD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(PROD_COD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(PRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(CANT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL)
                    .addComponent(ID_CLIEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABELL)
                    .addComponent(NOMBRE_CLIEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAL)
                    .addComponent(AGRE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMPR)
                    .addComponent(ELIM)
                    .addComponent(jLabel8)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PROD_CODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROD_CODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROD_CODActionPerformed

    
   // public void eliminar_FA(){
//int fila= PREFA.getSelectedRow();
// String valor = (String) PREFA.getValueAt(fila,0);
 //try{
    // PreparedStatement elimi= conect.prepareStatement("DELETE FROM facturaa WHERE ID_FACTURA='"+valor+"'");
    // elimi.executeUpdate();
     // JOptionPane.showMessageDialog(null,"SE ELIMINO CON EXITO :V") ;
 //}catch(SQLException e){
  //   JOptionPane.showMessageDialog(null,e+" no se logro eliminar");
 //}
      

 
//}
    
    //con esto que hacemos aca mandamos datos qque estan en pantalla a nuestro JTABLE para poder visualizar los pdoductos
public void tablee(){
    DefaultTableModel modelo = (DefaultTableModel) PREFA.getModel();
    Object [] fila=new Object[6];

fila[0]=ID_FAC.getText();
fila[1]=COD1.getText();
fila[2]=PROD_COD.getText();
fila[3]=CANT.getText();
fila[4]=PRE.getText();
fila[5]=SUB.getText();
modelo.addRow(fila);
PREFA.setModel(modelo);
}

//aca usamos una condicion para que el metodo corra por la tabla y sume el subtotal de todos nuestros productos y asi 
//saque el total

public void tot(){
 pay.setText("0");
        int ta=PREFA.getRowCount();
        int c =0;
        do
            try{
                int f=c++;
                int n1=Integer.parseInt(PREFA.getValueAt(f,5).toString());
                String nu=pay.getText();
                int n2=Integer.parseInt(nu);
                long re=n1+n2;
                pay.setText(String.valueOf(re));
            }catch(Exception e){
            }
        while(c<ta);}

//aca agregamos los metodos de agregar en taabla y el total para que como va guardando en tabla vaya mostrando los
//el precio total

    private void AGREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREActionPerformed
      tablee();
tot();


    }//GEN-LAST:event_AGREActionPerformed

    //con este metodo podemos almacenar los datos que requerimos en nuestra tabla factura la cual esta en sql y 
    //tiene relacion con nuestra tabal detalles ya que aca almacenamos lo primordial de la venta los demas detalles se encuentran
    // en el otro metodo y tabla
    
public void intento(){
String sql_Facturas = "INSERT INTO factura (id_venta,id_clientee,nombre_clie,id_admin,nombre_admin,total)VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conect.prepareStatement(sql_Facturas);
            pst.setString(1, ID_FAC.getText());
            pst.setString(2, ID_CLIEN.getText());
            pst.setString(3, NOMBRE_CLIEN.getText());
            pst.setString(4, ID_ADMIN.getText());
            pst.setString(5,NOM_ADMIN.getText());
             pst.setString(6,pay.getText());
            
            int ns = pst.executeUpdate();
            if (ns > 0) {
                JOptionPane.showMessageDialog(null, "Registrado Exitosamente de Facturas ");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error - FACTURAS: " + ex);
            Logger.getLogger(FACTURA.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception ex){
             System.out.println(ex.getMessage());
        }}




    private void SUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBActionPerformed

    private void NOMBRE_CLIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRE_CLIENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRE_CLIENActionPerformed

    private void NOM_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOM_ADMINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOM_ADMINActionPerformed

    //aca al darle al boton comprar por la accion del action perfomed este usara los dos metodos creados para 
    //guardar los datos requeridos en las tablas factura y detalles venta
   
    private void COMPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRActionPerformed

intento();
ejem2();

    }//GEN-LAST:event_COMPRActionPerformed

    //aca podemos usar el metodo suma para sacar el sub total del producto basandonos en su precio
    //y subtotal
    
    private void CALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALActionPerformed
suma(); 
    }//GEN-LAST:event_CALActionPerformed

    private void PREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PREActionPerformed

    private void ID_FACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_FACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_FACActionPerformed

    private void ID_FACKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_FACKeyPressed
       
    }//GEN-LAST:event_ID_FACKeyPressed

    private void ID_CLIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_CLIENActionPerformed
       
    }//GEN-LAST:event_ID_CLIENActionPerformed

//aqui se aplica un KEY PRESSED para que al ingresar un dato se compare y llame a otros datos al dar enter
    
    private void ID_ADMINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_ADMINKeyPressed
 bus_admin();       
    }//GEN-LAST:event_ID_ADMINKeyPressed

    private void COD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COD1ActionPerformed

    //aqui se aplica un KEY PRESSED para que al ingresar un dato se compare y llame a otros datos al dar enter
    
    private void COD1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COD1KeyPressed
        bus_pro();
    }//GEN-LAST:event_COD1KeyPressed

    //aqui se aplica un KEY PRESSED para que al ingresar un dato se compare y llame a otros datos al dar enter
    private void ID_CLIENKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_CLIENKeyPressed
        bus_cliente();
    }//GEN-LAST:event_ID_CLIENKeyPressed

    //este boton nos permite cuando la compra halla culminado y quisieramos registrar op hacer otra venta a otro cliente
    //nos limpie la tabla y todos los campos
    private void ELIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMActionPerformed
        limpiar1();
        limpiartabla();
    }//GEN-LAST:event_ELIMActionPerformed

    
    //aca aplicamos lo de sumar el valor del producto con base a
    //la cantidad pero directamente desde el jtext
    private void CANTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CANTKeyPressed
suma();        // TODO add your handling code here:
    }//GEN-LAST:event_CANTKeyPressed
//este arreglo nos permite vaciar los campos de texto
    public void limpiar1(){
    ID_FAC.setText("");
    COD1.setText("");
       PROD_COD.setText("");
       PRE.setText("");
       CANT.setText("");
       
       SUB.setText("");
       ID_CLIEN.setText("");
       NOMBRE_CLIEN.setText("");
       ID_ADMIN.setText("");
      NOM_ADMIN.setText("");
}
public void limpiar2(){
    
       COD1.setText("");
       PROD_COD.setText("");
       PRE.setText("");
       CANT.setText("");
       SUB.setText("");
       
       
}

//este nos permitira vaciar la tabla y asi poder volver a llenarla
public void limpiartabla(){
    DefaultTableModel temp = (DefaultTableModel) PREFA.getModel();
    int filas = PREFA.getRowCount();

    for (int a = 0; filas > a; a++) {
        temp.removeRow(0);
    }
}

//este arreglo permitira poder guardar los datos como los prodcutos que se compran 
//el id de la venta que permitira saber a que venta pertenece y otros datos caracterisiticos
public void ejem2(){
     
   try{
       for(int i=0;i<PREFA.getRowCount();i++)
       {
           PreparedStatement pst = conect.prepareStatement("INSERT INTO detalle_venta(ID_VENTA,ID_PRODUC,PRODUCTO,CANTIDAD,PRECIO_VENTA)VALUES(?,?,?,?,?)");
           
    String string= PREFA.getValueAt(i, 0).toString();
 int TestTreatmentID = Integer.parseInt(string);
  pst.setInt(1,TestTreatmentID);
  
   String strin= PREFA.getValueAt(i, 1).toString();
   int TestTreatment = Integer.parseInt(strin);
   pst.setInt(2,TestTreatment);
    //pst.setInt(1,(int)PREFA.getValueAt(i, 0));
     //pst.setInt(2,(int)PREFA.getValueAt(i, 1));
     pst.setString(3, PREFA.getValueAt(i, 2).toString());
     pst.setString(4, PREFA.getValueAt(i, 3).toString());
     pst.setString(5, PREFA.getValueAt(i, 4).toString());
     
     
    pst.executeUpdate();
    
    }
   }catch (HeadlessException | SQLException e){
   System.out.print(e.getMessage());
             
    }
}





    /**p
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FACTURA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGRE;
    private javax.swing.JButton CAL;
    private javax.swing.JTextField CANT;
    private javax.swing.JTextField COD1;
    private javax.swing.JButton COMPR;
    private javax.swing.JButton ELIM;
    private javax.swing.JTextField ID_ADMIN;
    private javax.swing.JTextField ID_CLIEN;
    private javax.swing.JTextField ID_FAC;
    private javax.swing.JLabel LABEL;
    private javax.swing.JLabel LABEL1;
    private javax.swing.JLabel LABELL;
    private javax.swing.JLabel LABELLLL;
    private javax.swing.JTextField NOMBRE_CLIEN;
    private javax.swing.JTextField NOM_ADMIN;
    private javax.swing.JTextField PRE;
    private javax.swing.JTable PREFA;
    private javax.swing.JTextField PROD_COD;
    private javax.swing.JTextField SUB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pay;
    // End of variables declaration//GEN-END:variables
}
