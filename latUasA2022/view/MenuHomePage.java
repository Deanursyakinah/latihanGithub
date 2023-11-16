package view;
import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import controller.Control;

public class MenuHomePage {
    Control control = new Control();
    JFrame jframe;
    JLabel userLabel;
    JTable todoTable;
    JScrollPane scrollPane;

    public MenuHomePage(int userId) {
        jframe = new JFrame();
        jframe.setTitle("Homepage");
        jframe.setSize(500, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(new BorderLayout());

        // Mendapatkan nama pengguna dari basis data
        String userName = getUserName(userId);

        // Menampilkan nama pengguna
        userLabel = new JLabel("Welcome, " + userName + "!");
        jframe.add(userLabel, BorderLayout.NORTH);
    }

    private String getUserName(int userId) {
        try {
            // Mengambil nama pengguna dari basis data menggunakan metode dari Control
            return control.getUserById(userId).getName();
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }
    }
}
