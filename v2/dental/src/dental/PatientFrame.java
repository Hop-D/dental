
package dental;

import java.awt.*;
import java.time.*;
import java.util.*;
import javax.swing.*;


public class PatientFrame extends javax.swing.JFrame {

    Patient pLog;

    public PatientFrame() {
        initComponents();
    }
    
    public PatientFrame(Patient user) {
        initComponents();
        populateDentist();
        setPatient(user);
        pLog = user;
    }


    private void initComponents() {

        new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pCheck = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        pEmail = new javax.swing.JTextField();
        pContact = new javax.swing.JTextField();
        pCalendar = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pNote = new javax.swing.JTextArea();
        pRequest = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pDentist = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PATIENT");

        pCheck.setText("CHECK APPOINTMENTS");
        pCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					pCheckActionPerformed(evt);
				} catch (MethodAccessDeniedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pCheck)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pCheck)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Name: ");

        jLabel3.setText("Email: ");

        jLabel4.setText("Contact #: ");

        jLabel5.setText("Choose Date of Appointment: ");

        jLabel6.setText("Notes: ");

        pNote.setColumns(20);
        pNote.setRows(5);
        jScrollPane1.setViewportView(pNote);

        pRequest.setText("SEND APPOINTMENT REQUEST");
        pRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
					pRequestActionPerformed(evt);
            }
        });

        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Choose Dentist: ");
      
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pRequest))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pName)
                            .addComponent(pEmail)
                            .addComponent(pContact)
                            .addComponent(pCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel7)
                            .addComponent(pDentist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pDentist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    
    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        this.dispose();
        WelcomeClass welcome = new WelcomeClass();
        welcome.setVisible(true);
        welcome.pack();
        welcome.setLocationRelativeTo(null);
        
    }

    private void pRequestActionPerformed(java.awt.event.ActionEvent evt) {

        try {
        	int choiceDentist = Integer.parseInt(pDentist.getSelectedItem().toString().split(" ")[0]);
        	pLog.bookAppointment(User.getUser(choiceDentist), pCalendar.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), pNote.getText(), pContact.getText());
        	pLog.setContact(pContact.getText());
        	int a = JOptionPane.showConfirmDialog(this, "Appointment Sent. Exit the system?");
        	 if(a == JOptionPane.YES_OPTION) {
                 setDefaultCloseOperation(EXIT_ON_CLOSE);
                 this.dispose();
                 WelcomeClass welcome = new WelcomeClass();
                 welcome.setVisible(true);
                 welcome.pack();
                 welcome.setLocationRelativeTo(null);
             }
             
             clearPatient();
             
        }catch(UserNotFoundException ex){
        	JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
            
    }

    private void pCheckActionPerformed(java.awt.event.ActionEvent evt) throws MethodAccessDeniedException {
        
        patientApp();
    }

    
    
    public void populateDentist() {
        String[] dentistArr = new String[User.countUserType(User.DENTIST_TYPE)];
        int i = 0;
        for(User u: User.getUsers()) {
        	if(u.getType().equals(User.DENTIST_TYPE)) {
        		String choiceDentist = u.getId() + " | " + u.getName();
        		dentistArr[i] = choiceDentist;
        		i++;
        	}
        }
        
        DefaultComboBoxModel<String> dm = new DefaultComboBoxModel<String>(dentistArr);
        pDentist.setModel(dm);
    }
    
    public User currentPatient(User user) {
        return user;
    }
    
    public void setPatient(Patient user) {
        pName.setText(user.getName());
        pEmail.setText(user.getEmail());
        
        pName.setEditable(false);
        pEmail.setEditable(false);
    }
    
    public void clearPatient() {
        Calendar time = Calendar.getInstance();
        pContact.setText(pLog.getContact());
        pCalendar.setCalendar(time);
        pNote.setText("");
    }
    
    public void patientApp() throws MethodAccessDeniedException {
        
        JFrame newFrame = new JFrame("Your Appointments");
        newFrame.setSize(600, 400);
        newFrame.setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Your Appointments");
        lblTitle.setFont(new Font("Serif", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        newFrame.add(lblTitle, BorderLayout.NORTH);

        String[] columnNames = {"Dentist", "Date", "Status"};
        Object[][] data = new Object[pLog.getUserAppointments().size()][3];
        int i = 0;
        for(Appointment app: pLog.getUserAppointments()) {
        	data[i][0] = app.getDentist().getName();
        	data[i][1] = app.getRequestDate();
        	data[i][2] = app.getStatus();
        	i++;
        	app.displayAppointments(pLog.getUserAppointments());
        }
        
        
        JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 200));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        newFrame.add(scrollPane, BorderLayout.CENTER);

        newFrame.setVisible(true);
        newFrame.pack();
        newFrame.setLocationRelativeTo(null);
        
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientFrame().setVisible(true);
            }
        });
    }
    
    
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar pCalendar;
    private javax.swing.JButton pCheck;
    private javax.swing.JTextField pContact;
    private javax.swing.JComboBox<String> pDentist;
    private javax.swing.JTextField pEmail;
    private javax.swing.JTextField pName;
    private javax.swing.JTextArea pNote;
    private javax.swing.JButton pRequest;

}
