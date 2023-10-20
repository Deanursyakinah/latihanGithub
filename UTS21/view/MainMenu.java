package UTS21.view;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import UTS21.controller.*;
import UTS21.model.Chat;
import UTS21.model.ChatStateEnum;

public class MainMenu {
    public static void view() {
        ArrayList<Chat> listChat = new ArrayList<Chat>();
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose Menu : \n 1. Show user chat"
                + "\n" + " 2. Change chat state"
                + "\n" + " 3. Send message"
                + "\n" + " 4. Show message"
                + "\n" + " 5. Change User Profile"
                + "\n" + " 6. Show User Favorite Chat"
                + "\n" + " 7. Exit"));

        while (input != 0) {
            if (input == 1) {
                Control.showUserChats();
            } else if (input == 2) {
                ChatStateEnum newState = ChatStateEnum.PINNED;
                String hasil = Control.changeChatState(listChat, newState);
            } else if (input == 3) {
                // isi
            } else if (input == 4) {
                Control.showMessage();
            } else if (input == 5) {
                Control.changeUserProfile();
            } else {
                break;
            }
        }
    }
}
