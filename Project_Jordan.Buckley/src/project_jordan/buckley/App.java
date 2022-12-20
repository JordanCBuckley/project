/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_jordan.buckley;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class App extends JordanBuckley{
    
    public static void main(String[] args) {
        JFrame loginScreen = new JFrame("Login");
        GUI myGUI = new GUI(); 
        loginScreen.setSize(300,200);
        loginScreen.setLayout(new BoxLayout(loginScreen.getContentPane(),BoxLayout.Y_AXIS));
        loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding username and password fields to popup
        JLabel usernameLbl = new JLabel("Username:");
        JTextField usernameTF = new JTextField();
        usernameTF.setColumns(7);
        JPanel usernamePnl = new JPanel();
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTF);
        loginScreen.add(usernamePnl);
        
        JLabel passwordLbl = new JLabel("Password:");
        JPasswordField passwordTF = new JPasswordField();
        passwordTF.setColumns(7);
        JPanel passwordPnl = new JPanel();
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTF);
        loginScreen.add(passwordPnl);
        
        //Adding a login button
        JButton loginBtn = new JButton("Login");
        loginScreen.add(loginBtn);
        
        //Loading login screen
        loginScreen.setVisible(true);
        
        //Check for login
        loginBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
        String username = usernameTF.getText();
        char[] password = passwordTF.getPassword();

        // Verify the login information
        if (verifyLogin(username, password)) {
          // Display the main GUI
          myGUI.setVisible(true);

          // Close the login window
          loginScreen.dispose();
        } else {
          // Display an error message
          JOptionPane.showMessageDialog(loginScreen, "Invalid username or password");
        }
      }
    });
    }
    public static boolean verifyLogin(String username, char[] password) {
        String correctUsername = "admin";
        char[] correctPassword = {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};

        return username.equals(correctUsername) && Arrays.equals(password, correctPassword);
    }
}

  
