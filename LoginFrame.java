package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame {

    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel usernameAndPasswordCombinedPnl;

    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;

    private JTextField usernameTxt;

    private JPasswordField passwordFld;

    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public LoginFrame() {
        setTitle("Login Frame");
        setSize(600, 650);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));

        usernameAndPasswordCombinedPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        usernameAndPasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1), "Login details"));

        mainPnl = new JPanel(new BorderLayout());

        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 30));
        headingLbl.setForeground(Color.RED);

        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");

        usernameTxt = new JTextField(10);
        usernameTxt.setFocusable(true);

        passwordFld = new JPasswordField(10);

        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");

        headingPnl.add(headingLbl);

        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxt);

        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordFld);

        usernameAndPasswordCombinedPnl.add(usernamePnl);
        usernameAndPasswordCombinedPnl.add(passwordPnl);

        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);

        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(usernameAndPasswordCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);

        add(mainPnl);

        pack();
        setVisible(true);

    }
}
