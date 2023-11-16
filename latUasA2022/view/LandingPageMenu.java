package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPageMenu {
    JFrame jframe;
    JButton loginPengguna;
    JButton regisUserNew;

    public LandingPageMenu() {
        jframe = new JFrame();
        jframe.setTitle("Landing Page Menu");
        jframe.setSize(250, 150);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);

        loginPengguna = new JButton("Login Pengguna");
        loginPengguna.setBounds(10, 30, 100, 20);
        loginPengguna.setEnabled(true);
        jframe.add(loginPengguna);

        loginPengguna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuLogin();
                jframe.dispose();
            }
        });

        regisUserNew = new JButton("Registrasi Pengguna Baru");
        regisUserNew.setBounds(120, 30, 100, 20);
        regisUserNew.setEnabled(true);
        jframe.add(regisUserNew);

        regisUserNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuRegistrasi();
                jframe.dispose();
            }
        });
        
        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        new LandingPageMenu();
    }
}
