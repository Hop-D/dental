
package dental;

import static dental.Main.users;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {


    public Login() {
        
        initComponents();
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logPass = new javax.swing.JPasswordField();
        logCBox = new javax.swing.JComboBox<>();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        jLabel4.setText("Type");

        logCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Guest", "Dentist" }));

        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logEmail)
                    .addComponent(logPass)
                    .addComponent(logCBox, 0, 160, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(login)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(logCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(login)
                .addContainerGap(54, Short.MAX_VALUE))
        );

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
    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        
        User log = new User();
        log.email = logEmail.getText();
        log.password = String.valueOf(logPass.getPassword());
        log.type = logCBox.getSelectedItem().toString();
        
        User temp = new User();
        
        boolean userExist = loginUser(users, log.email, log.password, log.type);
        if(userExist == true) {
            JOptionPane.showMessageDialog(this, "Login Successful");
            
            temp = setCurrentUser(users, log.email, log.password, log.type);
            
            if(log.type.equals("Guest")) {
                
                GuestFrame guest = new GuestFrame(temp);
                guest.setVisible(true);
                guest.pack();
                guest.setLocationRelativeTo(null);
                
                this.dispose();
            } else if(log.type.equals("Patient")) {
                
                PatientFrame patient = new PatientFrame(temp);
                patient.setVisible(true);
                patient.pack();
                patient.setLocationRelativeTo(null);
                
                this.dispose();
                
            } else {
                DentistFrame dentist = new DentistFrame(temp);
                dentist.setVisible(true);
                dentist.pack();
                dentist.setLocationRelativeTo(null);
            }
            
        }
        
        
    }

    // check if user exists
    public boolean loginUser(ArrayList<User> users, String email, String password, String type) {
        for (User user : users) {
        	if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getType().equals(type)) {
        		return true;
        	}
        }
        return false;
    }
    
    public User setCurrentUser(ArrayList<User> users, String email, String password, String type) {
        
        User current = new User();
        
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).email.equals(email) && users.get(i).password.equals(password) && users.get(i).type.equals(type)) {
                current = users.get(i);
                return current;
            }
        }
        return current;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> logCBox;
    private javax.swing.JTextField logEmail;
    private javax.swing.JPasswordField logPass;
    private javax.swing.JButton login;

}
