/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Person.Student;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DateUtil;
import util.FileUtil;
import vaccine.VaccineRules;
import vaccine.Dose;
import vaccine.Vaccine;


public class StudentsView extends javax.swing.JPanel {
    
    private Vector<Student> studentsList;
    DefaultTableModel myTM;
    /**
     * Creates new form StudentsView
     */
    public StudentsView(Vector<Student> studentsList) {
        initComponents();
        this.studentsList = studentsList;
        postInit();
        myTM  = (DefaultTableModel) studentTable.getModel();
       
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnViewImmunization = new javax.swing.JButton();
        totalCount = new javax.swing.JLabel();
        totalCountLabel = new javax.swing.JLabel();
        addStudentThroughFormButton = new javax.swing.JButton();
        addStudentThroughCSVButton = new javax.swing.JButton();
        btnFormAdd = new javax.swing.JButton();
        btnCsvAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1486, 907));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 1480, 42));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Age(Month)", "Weight", "Father Name", "Mother Name", "Address", "Phone Number", "Registeration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jLabel1.setFont(new java.awt.Font("PT Sans", 0, 24)); // NOI18N
        jLabel1.setText("S T U D E N T S");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/children.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(425, 425, 425)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 1650, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 580, -1, -1));

        btnViewImmunization.setBackground(new java.awt.Color(255, 102, 0));
        btnViewImmunization.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnViewImmunization.setForeground(new java.awt.Color(255, 255, 255));
        btnViewImmunization.setText("View Immunization");
        btnViewImmunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewImmunizationActionPerformed(evt);
            }
        });
        add(btnViewImmunization, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 180, 40));
        add(totalCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 62, 48));

        totalCountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalCountLabel.setText("Total Count:");
        add(totalCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        addStudentThroughFormButton.setBackground(new java.awt.Color(255, 102, 0));
        addStudentThroughFormButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        addStudentThroughFormButton.setForeground(new java.awt.Color(255, 255, 255));
        addStudentThroughFormButton.setText("Add Student by Form");
        addStudentThroughFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentThroughFormButtonActionPerformed(evt);
            }
        });
        add(addStudentThroughFormButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 210, 40));

        addStudentThroughCSVButton.setBackground(new java.awt.Color(255, 102, 0));
        addStudentThroughCSVButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        addStudentThroughCSVButton.setForeground(new java.awt.Color(255, 255, 255));
        addStudentThroughCSVButton.setText("Add Student By CSV File ");
        addStudentThroughCSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentThroughCSVButtonActionPerformed(evt);
            }
        });
        add(addStudentThroughCSVButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 210, 40));

        btnFormAdd.setBackground(new java.awt.Color(255, 102, 0));
        btnFormAdd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnFormAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnFormAdd.setText("Add By Form");
        btnFormAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormAddActionPerformed(evt);
            }
        });
        add(btnFormAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 140, -1));

        btnCsvAdd.setBackground(new java.awt.Color(255, 102, 0));
        btnCsvAdd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnCsvAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnCsvAdd.setText("Add By CSV File");
        btnCsvAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCsvAddActionPerformed(evt);
            }
        });
        add(btnCsvAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentThroughCSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentThroughCSVButtonActionPerformed
       
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("./"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            if(selectedFile.getAbsolutePath().endsWith(".csv"))
            {
                 List<String> csvStrings = FileUtil.readCSVFile( selectedFile.getAbsolutePath());
                 for(String csvString : csvStrings)
                     studentsList.add(new Student(csvString));
                 
                JOptionPane.showMessageDialog(this, "Added Students Successfully..!", "Added Students", 1);
                populateTable();
                updateTotalCount();
                
                jPanel2.setVisible(false); 
            }
            else{
               
                JOptionPane.showMessageDialog(this, "Please select csv files only!!", "CSV file required ", 2);
            }

        }
    }//GEN-LAST:event_addStudentThroughCSVButtonActionPerformed

    private void addStudentThroughFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentThroughFormButtonActionPerformed
        
         try 
         {
            StudentDialog dialog = new StudentDialog(studentsList);
            dialog.setModalityType(ModalityType.APPLICATION_MODAL);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
        jPanel2.setVisible(false);
        populateTable();
        updateTotalCount();
    }//GEN-LAST:event_addStudentThroughFormButtonActionPerformed

    private void btnViewImmunizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewImmunizationActionPerformed

    int row = studentTable.getSelectedRow();
    if(row == -1)
    {
        JOptionPane.showMessageDialog(this, "Please select a student from table!!", "Select a student", 2);
        return;
    }
    
    try 
    {

       Student student = studentsList.get(row);
       ViewImmunizationDialog dialog = new ViewImmunizationDialog(student);
       dialog.setModalityType(ModalityType.APPLICATION_MODAL);
       dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);

    } 
    catch (Exception ex) {
       ex.printStackTrace();
    }
    jPanel6.setVisible(false);
    
    
            
        
        
    }//GEN-LAST:event_btnViewImmunizationActionPerformed

    private void btnCsvAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCsvAddActionPerformed
       
        int row = studentTable.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a student from table!!", "Select a student", 2);
            return;
        }
        Student student = studentsList.get(row);
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("./"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            if(selectedFile.getAbsolutePath().endsWith(".csv"))
            {
                 List<String> csvStrings = FileUtil.readCSVFile( selectedFile.getAbsolutePath());
                 for(String csvString : csvStrings)
                     addVaccine(student, csvString);
                    
                    
                JOptionPane.showMessageDialog(this, "Added Vaccinations Successfully..!", "Added Students", 1);
                populateTable();
                updateTotalCount();
                jPanel2.setVisible(false); 
            }
            else{
               
                JOptionPane.showMessageDialog(this, "Please select csv files only!!", "CSV file required ", 2);
            }

        }

    }//GEN-LAST:event_btnCsvAddActionPerformed

    private void btnFormAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormAddActionPerformed
        
        try 
         {
            int row = studentTable.getSelectedRow();
            if(row == -1)
            {
                JOptionPane.showMessageDialog(this, "Please select a student from table!!", "Select a student", 2);
                return;
            }
            
            Student student = studentsList.get(row);
            ImmunizationDialog dialog = new ImmunizationDialog(student);
            dialog.setModalityType(ModalityType.APPLICATION_MODAL);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         jPanel6.setVisible(false);
       
    }//GEN-LAST:event_btnFormAddActionPerformed
    public void postInit(){
        jPanel2.setVisible(false); 
        generateTable();
        updateTotalCount();
        jPanel6.setVisible(false);
       
    }
    
    public void generateTable(){
        
        myTM = (DefaultTableModel) studentTable.getModel();
        jScrollPane1.setVisible(false);
        studentTable.setAutoCreateRowSorter(true);
        studentTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        studentTable.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(studentTable);
        jScrollPane1.setVisible(true);   
        populateTable();
        
}
    
    public void populateTable(){
        
        myTM.setRowCount(0);
        int ix = 0; // use ix as an index, i.e. id for object in table
        for (Student student : studentsList)
        {
            Object[] studentObj = {++ix, student.getFirstName(), student.getLastName(), student.getAge(), student.getGpa(), student.getFatherName(), student.getMotherName(),student.getAddress(), student.getPhoneNumber(), student.getWalkInDate()};
            myTM.addRow(studentObj);
        }
    
    }
    
    public void addVaccine(Student student, String csvString)
    {
        String[] parsedVaccineData = csvString.split(",");
        String vaccineName = parsedVaccineData[0];
        int doseNumber = Integer.parseInt(parsedVaccineData[1]);
        String date = parsedVaccineData[2];
        
        boolean vaccineExists = false;
        HashMap<String, Integer>  immunizationRequirements = VaccineRules.getImmunizationRequirements(student.getAge());
        if(! immunizationRequirements.containsKey(vaccineName))
            return;
        int maxDoses = immunizationRequirements.get(vaccineName);
        Vaccine newVaccine = new Vaccine(vaccineName, vaccineName, maxDoses);
        for(Vaccine vaccine : student.getVaccineList())
        {
            if(vaccine.getVaccineName().equals(vaccineName))
            {
                newVaccine = vaccine;
                vaccineExists = true;
                break;
            }
        }
        Dose dose = new Dose(doseNumber,DateUtil.parseStringToDate(date, "yyyy-mm-dd"));
        newVaccine.addDose(dose);
        newVaccine.setLatestImmunizationDate(dose.getDate());
        if(!vaccineExists)
            student.addVaccine(newVaccine);
        
    }

    public void updateTotalCount()
    {
        totalCountLabel.setText("Total Count: " + studentsList.size());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentThroughCSVButton;
    private javax.swing.JButton addStudentThroughFormButton;
    private javax.swing.JButton btnCsvAdd;
    private javax.swing.JButton btnFormAdd;
    private javax.swing.JButton btnViewImmunization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel totalCount;
    private javax.swing.JLabel totalCountLabel;
    // End of variables declaration//GEN-END:variables
}
