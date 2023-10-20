package UTS21.view;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class viewUserChat {
    public static void method1(String hasil, String hasil2, int unreadCount, LocalDateTime lastMessageTime) {
        JOptionPane.showMessageDialog(null, hasil + hasil2 + " \nTotal pesan yang belum di-READ : \n " + unreadCount + " \nWaktu pesan terakhir : \n" + lastMessageTime);
    }
}
