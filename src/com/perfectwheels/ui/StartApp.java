/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.ui;

import com.perfectwheels.dto.Software;
import com.perfectwheels.service.ReportsManager;
import com.perfectwheels.service.SoftwareManager;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dell
 */
public class StartApp extends javax.swing.JFrame {

    /**
     * Creates new form StartApp
     */
    public StartApp() {
        //  initComponents();
        JFileChooser jFileChooser1 = new JFileChooser();
        jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jFileChooser1.setDialogTitle("Select Data Directory!");
        FileFilter filter = new FileNameExtensionFilter("text files", "txt");
        jFileChooser1.addChoosableFileFilter(filter);
        int option = jFileChooser1.showDialog(null,
                "Select Data Directory");
        if (option == JFileChooser.APPROVE_OPTION) {
            this.dispose();
            File f = jFileChooser1.getSelectedFile();
            // if the user accidently click a file, then select the parent directory.
            if (!f.isDirectory()) {
                f = f.getParentFile();
            }

            System.out.println("Selected directory for import " + f);
            try {
                File[] selectedFiles = jFileChooser1.getSelectedFile().listFiles();
                readFileContents(selectedFiles);
            } catch (IOException e) {
            }

            //   System.exit(0);
//            setVisible(false);
//            dispose();
//            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            //   JFrame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            new MainFrame().setVisible(true);

        }
    }

    public void readFileContents(File[] selectedFiles) throws FileNotFoundException, IOException {
        File softwareFile = null;
        for (File file : selectedFiles) {
            System.out.println("files " + file.getName());
            if (file.getName().equalsIgnoreCase("software.txt"));
            {
                System.out.println("found software text file");
                softwareFile = file;
            }

        }
        //reading
//        Scanner s = new Scanner(softwareFile);
//        while(s.hasNext()){
//            System.out.println("READ: "+s.nextLine());
//        }
        //writing method
        softwareList = new ArrayList<Software>();
        Software software = new Software();
        software.setName("Photoshop");
        software.setLicense("General");
        software = new Software();
        software.setName("Photoshop1");
        software.setLicense("General2");
        softwareList.add(software);
//        PrintWriter out = new PrintWriter(new FileWriter(softwareFile, true));
//        for (Software line : softwareList) {
//            out.println(line.toString());
//        }
//        out.close();
//        SoftwareManager softwareListManager = new SoftwareManager(softwareList);
//        ReportsManager r = new ReportsManager();
//        r.getAllSoftwareList();
//        softwareListManager.addNewSoftware();
        System.out.println("END OF APP");
    }
    public static List<Software> softwareList;

    
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chose DATA folder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StartApp.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartApp.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartApp.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartApp.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
