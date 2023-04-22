
package UI;

import Person.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import vaccine.VaccineRules;
import vaccine.Dose;
import vaccine.Vaccine;


public class ImmunizationDialog extends javax.swing.JDialog {

    
    private Student student;
    private HashMap<String, Integer>  immunizationRequirements;
    /**
     * Creates new form AddImmunizationDialog
     */
    public ImmunizationDialog(Student student) 
    {
        this.student = student;
        immunizationRequirements  = VaccineRules.getImmunizationRequirements(student.getAge());
        initComponents();
        populateLabel();
        populateComboBox();
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
        jLabel1 = new javax.swing.JLabel();
        comboBoxVaccineName = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxDoseNumber = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnAddVaccine = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Immunization Record");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel1.setText("Vaccine Name");

        comboBoxVaccineName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        comboBoxVaccineName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hib", "DTaP", "Polio", "Hepatitis B", "MMR", "Varicella", "Tdap", "Meningococcal" }));
        comboBoxVaccineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVaccineNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel2.setText("Dose");

        comboBoxDoseNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        comboBoxDoseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDoseNumberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel3.setText("Date");

        btnAddVaccine.setBackground(new java.awt.Color(255, 102, 0));
        btnAddVaccine.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btnAddVaccine.setForeground(new java.awt.Color(255, 255, 255));
        btnAddVaccine.setText("Add");
        btnAddVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVaccineActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        labelTitle.setText("<Student Name>   <AGE>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxDoseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnAddVaccine))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(comboBoxVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxDoseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAddVaccine)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVaccineActionPerformed
        
        Date date = dateChooser.getDate();
        
        if(date == null)
        {
             JOptionPane.showMessageDialog(this, "Please select date!!", "Date Missing", 2);
            return;
        }
        
        int doseNumber = Integer.parseInt(comboBoxDoseNumber.getSelectedItem().toString());
        String VaccineName = comboBoxVaccineName.getSelectedItem().toString();
        Dose dose = new Dose(doseNumber,date);
        addVaccine(VaccineName, dose);
        JOptionPane.showMessageDialog(this, "Added vaccine Successfully..!", "Added Vacine", 1);
        dispose();
    }//GEN-LAST:event_btnAddVaccineActionPerformed

    
    public void addVaccine(String vaccineName, Dose dose)
    {

        boolean vaccineExists = false;
        int maxDose = immunizationRequirements.get(vaccineName);
        Vaccine newVaccine = new Vaccine(vaccineName, vaccineName, maxDose);
        for(Vaccine vaccine : student.getVaccineList())
        {
            if(vaccine.getVaccineName().equals(vaccineName))
            {
                newVaccine = vaccine;
                vaccineExists = true;
                break;
            }
        }
        newVaccine.addDose(dose);
        newVaccine.setLatestImmunizationDate(dose.getDate());
        if(!vaccineExists)
            student.addVaccine(newVaccine);
        
    }
    
    private void comboBoxVaccineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVaccineNameActionPerformed
        
        int index = comboBoxVaccineName.getSelectedIndex();
        if(index != -1)
        {
            String selectedItem = comboBoxVaccineName.getSelectedItem().toString();
            int maxDoses = immunizationRequirements.get(selectedItem);
            int minDose  = getMinDoseCount(selectedItem);
            comboBoxDoseNumber.removeAllItems();
            System.out.println(minDose);
            for(int i = minDose; i<=maxDoses;i++)
            {
                comboBoxDoseNumber.addItem(String.valueOf(i));
            }
        }
    }//GEN-LAST:event_comboBoxVaccineNameActionPerformed

    private void comboBoxDoseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDoseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDoseNumberActionPerformed

   
    public void populateComboBox()
    {
       comboBoxVaccineName.removeAllItems();
       for (Map.Entry mapElement : immunizationRequirements.entrySet())
       {
            String vaccine = (String)mapElement.getKey();
            comboBoxVaccineName.addItem(vaccine);
       }
    }
    
    public void populateLabel()
    {
        String labelText = "Name: "+student.getFirstName() + " " + student.getLastName() + ", Age: " + student.getAge();
        
        labelTitle.setText(labelText);
    }
    public  int getMinDoseCount(String VaccineName)
    {
        int min = 1;
        
        System.out.println("as " + VaccineName);
        for(Vaccine vaccine : student.getVaccineList())
        {
            System.out.println("sa " + vaccine.getVaccineName());
            if( vaccine.getVaccineName().equalsIgnoreCase(VaccineName))
            {
                   return vaccine.getDoseDetails().size() +1 ;
            } 
        }
            
        return min;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVaccine;
    private javax.swing.JComboBox<String> comboBoxDoseNumber;
    private javax.swing.JComboBox<String> comboBoxVaccineName;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
