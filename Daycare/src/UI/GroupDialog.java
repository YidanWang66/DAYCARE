/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;


import Person.Student;
import Person.Teacher;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.DB4OUtil;
import model.DayCare;
import model.Group;

public class GroupDialog extends javax.swing.JDialog {
    DayCare daycare;
    int selectedClassroom;
    ClassRoomsView cview;
    DB4OUtil db4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form AddGroupDialog
     */
    public GroupDialog(DayCare daycare, int selectedClassroom, ClassRoomsView cv) {
        this.daycare = daycare;
        this.selectedClassroom = selectedClassroom;
        cview = cv;
        initComponents();
        postInit();
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
        jPanel3 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        groupNameInput = new javax.swing.JTextField();
        teacherLabel = new javax.swing.JLabel();
        confirmAddGroup = new javax.swing.JButton();
        teacherInput = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("PT Sans", 3, 18)); // NOI18N
        jLabel1.setText("New Group");

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        nameLabel.setText("Name");

        groupNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupNameInputActionPerformed(evt);
            }
        });

        teacherLabel.setText("Teacher");

        confirmAddGroup.setBackground(new java.awt.Color(255, 102, 102));
        confirmAddGroup.setText("Confirm");
        confirmAddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddGroupActionPerformed(evt);
            }
        });

        teacherInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teacherInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherInput, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmAddGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teacherLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(confirmAddGroup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupNameInputActionPerformed

    private void confirmAddGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddGroupActionPerformed
        String groupName = groupNameInput.getText();
        int teacherName = teacherInput.getSelectedIndex();
        Group group = new Group(groupName, daycare.getTeachersList().get(teacherName), new Vector<Student>(), daycare.getClassRoomsList().get(selectedClassroom).getMaxGroup());
        daycare.getClassRoomsList().get(selectedClassroom).getGroups().add(group);
        cview.populateGroupTable();
        JOptionPane.showMessageDialog(this, "Group Added Successfully");
        ClassRoomsView.handlePostClassroomCreate(this);
        cview.checkMaxLimitForGroupAddition();
        db4OUtil.storeSystem(daycare);
    }//GEN-LAST:event_confirmAddGroupActionPerformed

    private void teacherInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherInputActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String name = (String)cb.getSelectedItem();
        cb.setSelectedItem(name);
    }//GEN-LAST:event_teacherInputActionPerformed
    
    public void postInit(){
        setTeacherDropDown();
    }
    
    public void setTeacherDropDown(){
        Vector<Teacher> teachers = daycare.getTeachersList();
        int n = teachers.size();
        String[] options = new String[n];
        for(int i = 0; i< n; i++){
            options[i] = (String) teachers.get(i).getFirstName()+" "+teachers.get(i).getLastName();
        }
        teacherInput.setModel(new javax.swing.DefaultComboBoxModel<>(options));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmAddGroup;
    private javax.swing.JTextField groupNameInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> teacherInput;
    private javax.swing.JLabel teacherLabel;
    // End of variables declaration//GEN-END:variables
}
