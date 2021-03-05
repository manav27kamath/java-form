import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyLogin implements ActionListener {
    JFrame LoginFrame;
    JPanel LoginPanel;
    JTextField UN;
    JPasswordField pwd;
    JLabel unlbl, pwdlbl, res, res1;
    JButton MyLog, ForgotPass;

    public MyLogin() {
        LoginFrame = new JFrame("Login Page");
        LoginPanel = new JPanel();
        LoginPanel.setLayout(new GridLayout(6, 6));
        addWidgets();
        LoginFrame.getContentPane().add(LoginPanel, BorderLayout.CENTER);
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginFrame.pack();
        LoginFrame.setVisible(true);
    }

    private void addWidgets() {
        UN = new JTextField(25);
        pwd = new JPasswordField(15);
        unlbl = new JLabel("User Name: ",
                SwingConstants.LEFT);
        pwdlbl = new JLabel("Password: ",
                SwingConstants.LEFT);

        MyLog = new JButton("Login...");
	ForgotPass = new JButton("Forgot Password/Username");
        res = new JLabel(" ",
                SwingConstants.LEFT);
	res1 = new JLabel(" ",
		SwingConstants.RIGHT);
        MyLog.addActionListener(this);
        LoginPanel.add(unlbl);
        LoginPanel.add(UN);
        LoginPanel.add(pwdlbl);
        LoginPanel.add(pwd);

        LoginPanel.add(MyLog);
        LoginPanel.add(res);
	LoginPanel.add(ForgotPass);
	LoginPanel.add(res1);

    }

    public void actionPerformed(ActionEvent event) {

        String usr = UN.getText();
        String Ps = pwd.getText();

        if (usr.equals("SICSR") && Ps.equals("12345"))

            res.setText("Successful login.....!");

        else
            res.setText("Wrong login user name/password.....!");

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
        }

        MyLogin Login = new MyLogin();
    }
}