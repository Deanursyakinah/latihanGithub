import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    JFrame jframe;
    JButton buttonPerekaman;
    JButton buttonPencarian;
    JButton buttonExit;

    public MainMenu() {
        jframe = new JFrame();
        jframe.setTitle("Main Menu");
        jframe.setSize(250, 150);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);

        buttonPerekaman = new JButton("Perekaman");
        buttonPerekaman.setBounds(10, 30, 100, 20);
        buttonPerekaman.setEnabled(true);
        jframe.add(buttonPerekaman);

        buttonPerekaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Perekaman();
            }
        });

        buttonPencarian = new JButton("Pencarian");
        buttonPencarian.setBounds(120, 30, 100, 20);
        buttonPencarian.setEnabled(true);
        jframe.add(buttonPencarian);

        buttonPencarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pencarian();
            }
        });

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(55, 55, 100, 20);
        buttonExit.setEnabled(true);
        jframe.add(buttonExit);

        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
