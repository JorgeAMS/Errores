/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metnume;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge M
 */
public class Meet extends javax.swing.JFrame {

    /**
     * Creates new form Meet
     */
    public Meet() {
        initComponents();
        start();
        setLocationRelativeTo(null);
    }
    
    int counter, total;
    double [] submited = new double[45];
    double [] era;
    int [] frecuencia = new int[45];
    double media, sumatoria, varianza, t, errorA, xifi;
    String erra, valor, frecu, errr, xf, mediaa;
    DecimalFormat DF = new DecimalFormat("#.00");
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jSpinner1.setName(""); // NOI18N
        jSpinner1.setValue(1
        );
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 50, -1));

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel2.setText("Media");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel3.setText("Varianza");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Error Absoluto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 70, 300));

        jLabel9.setText("   ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 30, 20));

        jTextField1.setText("jTextField1");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        jCheckBox1.setText("Frecuencia");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Valor");
        jLabel10.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Frecuencia");
        jLabel11.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel11.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel11.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("jLabel12");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel12.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel12.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 300));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel13");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel13.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel13.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 300));

        jButton3.setText("Clean");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Error Relativo");
        jLabel1.setMaximumSize(new java.awt.Dimension(75, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(75, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 14));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel5.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel5.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 300));

        jLabel14.setText("Error Absoluto");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Error Relativo");
        jLabel16.setMaximumSize(new java.awt.Dimension(75, 14));
        jLabel16.setMinimumSize(new java.awt.Dimension(75, 14));
        jLabel16.setPreferredSize(new java.awt.Dimension(75, 14));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Xi * fi");
        jLabel18.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel18.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel18.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("jLabel19");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setMaximumSize(new java.awt.Dimension(69, 14));
        jLabel19.setMinimumSize(new java.awt.Dimension(69, 14));
        jLabel19.setPreferredSize(new java.awt.Dimension(69, 14));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 300));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Σ(Xi*fi)");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 40, -1));

        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Integer.parseInt(jSpinner1.getValue().toString())<=0 || jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Entrada no valida", "Error", JOptionPane.ERROR_MESSAGE);
            jSpinner1.setValue(1);
            jTextField1.requestFocus();
        }
        else{
            submited[counter]=Double.parseDouble(jTextField1.getText());
            if (jCheckBox1.isSelected()) {
                frecuencia[counter]=Integer.parseInt(jSpinner1.getValue().toString());
            }
            else{
                frecuencia[counter]=1;
            }
            valor="<html><body>"+String.valueOf(submited[counter])+"<br>"+valor+"</body></html>";
            frecu="<html><body>"+String.valueOf(frecuencia[counter])+"<br>"+frecu+"</body></html>";
            xf="<html><body>"+String.valueOf(DF.format(submited[counter]*frecuencia[counter]))+"<br>"+xf+"</body></html>";

            xf=xf.replace("null", "");
            valor=valor.replace("null", "");
            frecu=frecu.replace("null", "");

            if (xf.startsWith("<html><body>,") || xf.startsWith("<html><body>-,")) {
                xf=xf.replace(",", "0,");
            }

            jLabel12.setText(valor);
            jLabel13.setText(frecu);
            jLabel19.setText(xf);

            System.out.print(counter+"    ");
            System.out.print(submited[counter]+"    ");
            System.out.println(frecuencia[counter]+"    ");

            jCheckBox1.setEnabled(false);
            jTextField1.requestFocus();
            jTextField1.setText("");
            jSpinner1.setValue(1);
            counter++;

            jButton2.setEnabled(true);
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CALCULAR
        media();
        varianza();
        errorA();
        errorR();
        xifi();
        jTextField1.setEnabled(false);
        jCheckBox1.setEnabled(false);
        jButton2.setEnabled(false);
        jSpinner1.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jSpinner1.isEnabled()) {
            jSpinner1.setEnabled(false);
        }
        else{
            jSpinner1.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        start();
        jTextField1.setEnabled(true);
        jCheckBox1.setSelected(false);
        for (int i = 0; i < counter; i++) {
            submited[i]=0;
            frecuencia[i]=0;
        }
        counter=0;
        total=0;
        erra=null;
        valor=null;
        frecu=null;
        sumatoria=0;
        media=0;
        varianza=0;
        xf="";
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // Key released
        String digit = jTextField1.getText();
        char last=0;
        if (digit.isEmpty()) {
            //Xd
        }
        else{
            try {
                    last=digit.charAt(digit.length()-1);
                    Integer.parseInt(String.valueOf(last));
                    
            } catch (NumberFormatException nfe){
                if (String.valueOf(last).equals(".")) {
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Entrada no valida", "Error", JOptionPane.ERROR_MESSAGE);
                    String write = digit.substring(0, digit.length()-1);
                    jTextField1.setText(write);
                } 
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    public void media(){
        double med=0;
        for (int i = 0; i < counter; i++) {
            med=med+(submited[i]*frecuencia[i]);
        }
        for (int i = 0; i < counter; i++) {
            total=total+frecuencia[i];
        }
        media=med/total;
        mediaa=DF.format(media);
        if (mediaa.startsWith(",")) {
            mediaa=mediaa.replace(",", "0,");
        }
        jLabel6.setText(mediaa);
    }
    
    public void varianza(){
        double [] xmed = new double[counter];
        double [] xmed2 = new double[counter];
        String vari;
        
        for (int i = 0; i < counter; i++) {
            xmed[i]=submited[i]-media;
        }
        
        for (int i = 0; i < counter; i++) {
            xmed2[i]=xmed[i]*xmed[i]*frecuencia[i];
        }
        for (int i = 0; i < counter; i++) {
            sumatoria=sumatoria+xmed2[i];
        }
        
        System.out.println("Total de datos: "+total);
        System.out.println("Sumatoria: "+sumatoria);
        System.out.println("Media: "+media);
        varianza=sumatoria/(total);
        vari=DF.format(varianza);
        if (vari.startsWith(",")) {
            vari=vari.replace(",", "0,");
        }
        jLabel7.setText(vari);
    }
    
    public void errorA(){
        
        era = new double[counter];
        double sumera=0, resultado;
        String result;
        
        for (int i = 0; i < counter; i++) {
            era[i]=media-submited[i];
            erra="<html><body>"+String.valueOf(DF.format(era[i]))+"<br>"+erra+"</body></html>";
            sumera=sumera+Math.abs(era[i]);
        }
        erra=erra.replace("null", "");
        
        if (erra.contains("<html><body>,")) {
            erra=erra.replace(">,", ">0,");
        } 
        if (erra.contains("<html><body>-,")) {
            erra=erra.replace(">-,", ">-0,");
        }
        
        jLabel8.setText(erra);
        
        resultado=sumera/total;
        result=DF.format(resultado);
        if (result.startsWith(",")) {
            result=result.replace(",", "0,");
        }
        jLabel15.setText(mediaa+" ± "+result);
    }
    
    public void errorR(){
        double [] err = new double [counter];
        double sumerr=0;
        String errorr="";
        
        for (int i = 0; i < counter; i++) {
            err[i]=(era[i]/submited[i])*100;
            errorr="<html><body>"+String.valueOf(DF.format(err[i]))+"<br>"+errorr+"</body></html>";
            sumerr=sumerr+err[i];
        }
        errorr=errorr.replace("null", "");
        
        if (errorr.contains("<html><body>,")) {
            errorr=errorr.replace(">,", ">0,");
        } 
        if (errorr.contains("<html><body>-,")) {
            errorr=errorr.replace(">-,", ">-0,");
        }
        
        jLabel5.setText(errorr);
        jLabel17.setText(DF.format(String.valueOf(sumerr)));
    }
    
    public void xifi(){
        String xfi;
        for (int i = 0; i < counter; i++) {
            xifi=xifi+(submited[i]*frecuencia[i]);
        }
        xfi=DF.format(xifi);
        if (xfi.startsWith(",")) {
            xfi=xfi.replace(",", "0,");
        }
        jLabel21.setText(xfi);
    }
    
    public void start(){
        jLabel5.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel15.setText("");
        jLabel17.setText("");
        jLabel19.setText("");
        jLabel21.setText("");
        jTextField1.setText("");
        jButton2.setEnabled(false);
        jSpinner1.setEnabled(false);
        jCheckBox1.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(Meet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
