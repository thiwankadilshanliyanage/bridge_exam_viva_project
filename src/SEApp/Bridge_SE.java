/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEApp;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiwanka
 */
public class Bridge_SE extends  javax.swing.JFrame {

    /**
     * Creates new form Bridge_SE
     */
    public Bridge_SE() {
        initComponents();
        //loadTabale();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Pcbrand = new javax.swing.JLabel();
        Pcmodel = new javax.swing.JLabel();
        Lapmodel = new javax.swing.JLabel();
        Lapbrand = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Computer Type", "Brand", "Model", "RAM", "GPU", "SSD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Pcbrand.setForeground(new java.awt.Color(240, 240, 240));
        Pcbrand.setText("Brand-->pc");

        Pcmodel.setForeground(new java.awt.Color(240, 240, 240));
        Pcmodel.setText("Model-->Pc");

        Lapmodel.setForeground(new java.awt.Color(240, 240, 240));
        Lapmodel.setText("Model-->Pc");

        Lapbrand.setForeground(new java.awt.Color(240, 240, 240));
        Lapbrand.setText("Brand-->pc");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ps2.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/acerlo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("msi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("acer");

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add MSI DeskTop");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Acer Laptop");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Pcmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lapbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Pcbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Lapmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pcmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lapbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pcbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lapmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Desktop dp = new Desktop(new MSI(Pcbrand), new X592(Pcmodel));
        dp.assemble();
        Laptop lp = new Laptop(new Aser(Lapbrand), new Z124(Lapmodel));
        lp.assemble();
         
        //Desktop
        String deskR = dp.ram;
        String deskG = dp.gpu;
        String deskS = dp.ssd;
        String deskb = dp.brand.toString();
        String deskm = dp.model.toString();
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector<String> v = new Vector<>();
        v.add("Desktop Computer");
        v.add(Pcbrand.getText());
        v.add(Pcmodel.getText());
        v.add(deskR);
        v.add(deskG);
        v.add(deskS);
        dtm.addRow(v);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
           Desktop dp = new Desktop(new MSI(Pcbrand), new X592(Pcmodel));
        dp.assemble();
        Laptop lp = new Laptop(new Aser(Lapbrand), new Z124(Lapmodel));
        lp.assemble();
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
         //Laptop
        String lapR = lp.ram;
        String lapG = lp.gpu;
        String lapS = lp.ssd;
        String lapb = lp.brand.toString();
        String lapm = lp.model.toString();

       

        Vector<String> v2 = new Vector<>();
        v2.add("Laptop Computer");
        v2.add(Lapbrand.getText());
        v2.add(Lapbrand.getText());
        v2.add(lapR);
        v2.add(lapG);
        v2.add(lapS);

       
        dtm.addRow(v2);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bridge_SE().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lapbrand;
    private javax.swing.JLabel Lapmodel;
    private javax.swing.JLabel Pcbrand;
    private javax.swing.JLabel Pcmodel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void loadTabale() {
        Desktop dp = new Desktop(new MSI(Pcbrand), new X592(Pcmodel));
        dp.assemble();
        Laptop lp = new Laptop(new Aser(Lapbrand), new Z124(Lapmodel));
        lp.assemble();

        

        
        
       
    }

}

abstract class Computertype {

    Brand brand;
    Model model;

    String ram = "RAM-8GB DDR3";
    String gpu = "GPU-Nvidia X20 2GB";
    String ssd = "SSD-Kingston 250GB";

    public  Computertype(Brand brand, Model model) {
        this.brand = brand;
        this.model = model;
    }
public abstract void assemble();

}

interface Brand {

    public abstract void setBrand();
}

interface Model {

    public abstract void setModel();

}

class MSI implements Brand {

    JLabel pcBrand;
    
    public MSI(JLabel t1) {
        
        this.pcBrand=t1;
        
    }
    @Override
    public void setBrand() {

        
        String brand = "MSI";
        System.out.println(brand);
        
        pcBrand.setText(brand);
        
    }

}

class Aser implements Brand {
        
    JLabel lapBrand;

    public Aser(JLabel l1) {
        this.lapBrand = l1;
    }
    
        

    @Override
    public void setBrand() {
        String brand = "Aser";
        System.out.println(brand);
        lapBrand.setText(brand);
    }

}

class X592 implements Model {

    JLabel pcModel;

    public X592(JLabel m1) {
        this.pcModel = m1;
    }
    
    @Override
    public void setModel() {

        String model = "X592";
        System.out.println(model);
         pcModel.setText(model);
    }

}

class Z124 implements Model {
JLabel lapModel;

    public Z124(JLabel m1) {
        this.lapModel = m1;
    }

    @Override
    public void setModel() {

        String model = "Z124";
        System.out.println(model);
        lapModel.setText(model);

    }

}

class Desktop extends Computertype {

    public Desktop(Brand brand, Model model) {
        super(brand, model);
    }

    
    @Override
    public void assemble() {

        System.out.println("Assemble Desktop");
        System.out.println(super.ram);
        System.out.println(super.gpu);
        System.out.println(super.ssd);
        brand.setBrand();
        model.setModel();
        System.out.println();

    }

   
}

class Laptop extends Computertype {

    public Laptop(Brand brand, Model model) {
        super(brand, model);
    }

    @Override
    public void assemble() {

        System.out.println("Assemble Laptop");
        System.out.println(super.ram);
        System.out.println(super.gpu);
        System.out.println(super.ssd);
        brand.setBrand();
        model.setModel();
        System.out.println();
    }

}
