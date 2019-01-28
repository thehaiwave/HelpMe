/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoibinfo;

import static java.awt.SystemColor.window;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Carlos Manuel
 */
public class PantallaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form PantallaRegistro
     */
    
    TableRowSorter trs;
    public PantallaRegistro() {
        initComponents();
        setSize(900,600);
        this.setLocationRelativeTo(null);
        this.setTitle("                                                                           REGISTRO");
        setResizable(false);
        showDate();
        jTable1.getColumnModel().getColumn(5).setMinWidth(0);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
        
       
    }
    

    
    
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy    hh:mm a");
        date.setText(s.format(d));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Buscar = new javax.swing.JLabel();
        jtxtFiltro = new java.awt.TextField();
        precioinput = new java.awt.TextField();
        idinput = new java.awt.TextField();
        leyendainput = new java.awt.TextField();
        fechaininput = new com.toedter.calendar.JDateChooser();
        fechaoutinput = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        limpiaFields = new javax.swing.JButton();
        filterCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(66, 134, 244));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        date.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel8.setText("///////////////////////////////////////////////////////////////////////");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(date)
                .addGap(173, 173, 173))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Precio", "ID", "Leyenda", "Fecha In", "Fecha Out", "Title 6"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 513, 370));

        Buscar.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        Buscar.setText("Buscar");
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jtxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFiltroKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 300, 28));

        precioinput.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        jPanel1.add(precioinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 163, -1));

        idinput.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        jPanel1.add(idinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 163, -1));

        leyendainput.setFont(new java.awt.Font("Dialog", 0, 21)); // NOI18N
        jPanel1.add(leyendainput, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 163, 84));

        fechaininput.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        fechaininput.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fechaininputAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(fechaininput, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 163, 32));

        fechaoutinput.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jPanel1.add(fechaoutinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 163, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setText("Precio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel3.setText("Fecha In");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel4.setText("Fecha Out");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel5.setText("Leyenda");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        jButton2.setText("ACTUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 150, -1));

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 120, 30));

        limpiaFields.setText("LIMPIAR");
        limpiaFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiaFieldsActionPerformed(evt);
            }
        });
        jPanel1.add(limpiaFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        filterCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio", "ID", "Leyenda", "Fecha In", "Fecha Out", " " }));
        filterCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterCBItemStateChanged(evt);
            }
        });
        jPanel1.add(filterCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel7.setText("$");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
     DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
       Date r;
       Date t;
       Date v=fechaininput.getDate();
       Date u=fechaoutinput.getDate();
       Calendar cal_fechain;
       String g = null;
       
       
       Object Dato[] = new Object [6];
       
      
      
                 Dato[0]  = precioinput.getText();
                 Dato[1]  = idinput.getText();
                 if (v==null){
                     JOptionPane.showMessageDialog(this,"Por favor ingrese Fecha In");
                 }
                 else {
                   SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
                    Date q = fechaininput.getDate();
                    r=q;
                    LocalDate localDate = r.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    int month = localDate.getMonthValue();
                    String ns = df.format(q);
                    Dato[3]  = ns;
                 }
                 cal_fechain = Calendar.getInstance();
                   if (u==null){
                    
                    g="EN_INVENTARIO";
             
                 Dato[4]  = g;
                 }
                   else {
                 SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
                    Date fc=fechaoutinput.getDate();
                    String fd= ff.format(fc);
                    
             
                 Dato[4]  = fd;
                   }
                 Dato[2]  = leyendainput.getText();
                 if(v != null){
                     cal_fechain = fechaininput.getCalendar();
                     int mes_in = cal_fechain.get(Calendar.MONTH);
                 
                 Dato [5]= mes_in;
                
                  modelo.addRow(Dato);
                 
              
                 } 
                 
              
                
                 
                 
                                          
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
       int i = jTable1.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       if (i >=0)
       {
          Date r;
          Date t;   
          Date v=fechaininput.getDate();
          Date u=fechaoutinput.getDate();
          model.setValueAt(precioinput.getText(),i,0);
          model.setValueAt(idinput.getText(),i,1);
          model.setValueAt(leyendainput.getText(),i,2);
       if (v==null){
                     fechaininput.setDate(null);
                 }
                 else {
                   SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
                    Date q = fechaininput.getDate();
                    r=q;
                    LocalDate localDate = r.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    int month = localDate.getMonthValue();
                    String ns = df.format(q);
                    model.setValueAt(ns,i,3);
                 }
                   if (u==null){
                     fechaoutinput.setDate(null);
                 }
                   else {
                 SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
                    Date fc=fechaoutinput.getDate();
                    String fd= ff.format(fc);
                    
                    
             
               model.setValueAt(fd,i,4);
                   }
       } else {
           JOptionPane.showMessageDialog(this, "Seleccione una fila para actualizar");
       }
       
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Date date;
        Date f;
        String k;
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        precioinput.setText(model.getValueAt(i,0).toString());
        idinput.setText(model.getValueAt(i,1).toString());
        leyendainput.setText(model.getValueAt(i,2).toString());
        
        try {
            
            date = new SimpleDateFormat("dd/MM/yyyy").parse((String)jTable1.getValueAt(i,3));
            fechaininput.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
             f = new SimpleDateFormat("dd/MM/yyyy").parse((String)jTable1.getValueAt(i,4));
            if (f==null) {
            fechaoutinput.setDate(null);
            }
            
            fechaoutinput.setDate(f);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void limpiaFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiaFieldsActionPerformed
        // TODO add your handling code here:
        
        
        precioinput.setText(null);
        idinput.setText(null);
        leyendainput.setText(null);
        fechaininput.setDate(null);
        fechaoutinput.setDate(null);
    }//GEN-LAST:event_limpiaFieldsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i= jTable1.getSelectedRow();
        
        if (i>=0){
           model.removeRow(i);
        }
        else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
        }
                 
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtxtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFiltroKeyTyped
        // TODO add your handling code here:
    
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        jtxtFiltro.addKeyListener(new KeyAdapter() {
            
            @Override
               public void keyReleased (KeyEvent ke){
               int ty;
        String query = filterCB.getSelectedItem().toString();
        
        if (query == "Precio"){
            ty=0;
        }
        else if (query == "ID"){
            ty=1;
        }
        else if (query == "Leyenda"){
            ty=2;
        }
        else if (query == "Fecha In"){
            ty=3;
        }
        else {
           
            ty=4;
        }
                trs.setRowFilter(RowFilter.regexFilter(jtxtFiltro.getText(),ty));
            }
            
        });        
        
        trs = new TableRowSorter(model);
        jTable1.setRowSorter(trs);
        
        
        
    }//GEN-LAST:event_jtxtFiltroKeyTyped

    
    private void filterCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterCBItemStateChanged
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_filterCBItemStateChanged
    private void writte (int in){
        String mes = null;
        
        switch (in){
            case 0:
                mes= "enero";
                break;
            case 1:
                mes="febrero";
                break;
            case 2:
                mes="marzo";
                break;
            case 3:
                mes="abril";
                break;
            case 4:
                mes="mayo";
                break;
            case 5:
                mes="junio";
                break;
            case 6:
                mes="julio";
                break;
            case 7:
                mes="agosto";
                break;
            case 8:
                mes="septiembre";
                break;
            case 9:
                mes="octubre";
                break;
            case 10:
                mes="noviembre";
                break;
            case 11:
                mes="diciembre";
                break;
              
        }
        int c;
        String filePath = "C:\\Users\\Carlos Manuel\\Documents\\NetBeansProjects\\HelpMe\\"+mes+".txt";
        File file = new File(filePath);
        
        
        try {
      //     FileWriter fw = new FileWriter(file); 
        //    BufferedWriter bw = new BufferedWriter(fw);
        //    PrintWriter pw = new PrintWriter(new FileOutputStream(file,true));
        //    FileReader fr;
        //    fr = new FileReader(file);
        //    String rip;
        //    BufferedReader br = new BufferedReader(fr);
        //    Object[] lines = br.lines().toArray();
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new  BufferedWriter (fw);
        PrintWriter pw = new PrintWriter(bw);
        int r = jTable1.getRowCount();
        
        System.out.println(r);
            for(int i = 0; i<jTable1.getRowCount(); i++){
                for (int j=0; j<jTable1.getColumnCount(); j++)
                //esta ejecutando por linea el numero de rows
                    // si hay dos rows, ejecuta este for dos veces para cada row
                {
                    c = (int) jTable1.getValueAt(i,5);
                    
                    if (c==in){
                   // fw.write(jTable1.getValueAt(i,j).toString()+" ");
                   pw.print(jTable1.getValueAt(i,j).toString()+" ");
                   System.out.println("PRINTEANDO");
                    
                    }
                   
                }
                System.out.println("FIN LOOP COLUMNAS");
             bw.newLine();
            }
            System.out.println("FIN LOOP ROWS");
            pw.close();
        //    bw.close();
        //    fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //TableModel model1 = jTable1.getModel();
     int o;   
     o = jTable1.getRowCount();
     if (o==0){
         new Menu().setVisible(true);
         this.dispose();
     }
     else {
     
    int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "¿Estás seguro?", 
                                  "     REGRESAR", 
                                  JOptionPane.YES_NO_OPTION); 
              if (selectedOption == JOptionPane.YES_OPTION) {
  int in;
    for (int t=0; t<1; t++){
        in = (int) jTable1.getValueAt(t, 5);
        System.out.println("yayai");
        writte(in);
        
    }
    new Menu().setVisible(true);
       this.dispose(); 
              
           
    }
     }
        
        
        
     
        
        
            //new Menu().setVisible(true);
            //this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void fechaininputAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fechaininputAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaininputAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
model.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    /**
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
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser fechaininput;
    private com.toedter.calendar.JDateChooser fechaoutinput;
    private javax.swing.JComboBox<String> filterCB;
    private java.awt.TextField idinput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.TextField jtxtFiltro;
    private java.awt.TextField leyendainput;
    private javax.swing.JButton limpiaFields;
    private java.awt.TextField precioinput;
    // End of variables declaration//GEN-END:variables
}
