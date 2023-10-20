package UTS21.controller;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import UTS21.model.*;
import UTS21.view.*;

public class Control {
    public static void showUserChats() { // ini nomor 1
        ArrayList<Chat> chat = new ArrayList<Chat>();
        ArrayList<Message> messages = new ArrayList<Message>(); 
        dummyMessageChat.dummy(chat, messages);

        String hasil = " ";
        String hasil2 = " ";
        int unreadCount = 0;
        LocalDateTime lastMessageTime = null;

        for (int i = 0; i < chat.size(); i++) {
            Chat chats = chat.get(i);
            if (chats instanceof GroupChat) {
                GroupChat gc = (GroupChat) chats;
                hasil = gc.toString();
            } else if (chats instanceof IndividualChat) {
                IndividualChat pc = (IndividualChat) chats;
                hasil2 = pc.toString();
            }
            for (int j = 0; j < messages.size(); j++) {
                Message message = messages.get(j);
                if (message.getMessageState() == 0) {
                    unreadCount++;
                    if (lastMessageTime == null || message.getTime().isAfter(lastMessageTime)) {
                        lastMessageTime = message.getTime();
                    }
                }
            }
        }
        viewUserChat.method1(hasil, hasil2, unreadCount, lastMessageTime);
    }

    public static String changeChatState(ArrayList<Chat> listChat, ChatStateEnum newState) { // ini nomor 2
        String hasil = " ";
        ArrayList<Message> messages = new ArrayList<Message>();
        dummyMessageChat.dummy(listChat, messages);

        for (int i = 0; i < listChat.size(); i++) {
            Chat chats = listChat.get(i);
            if (chats instanceof GroupChat) {
                GroupChat gc = (GroupChat) chats;
                ChatStateEnum[] chatStateEnums = gc.getChatsStateEnums();
                if (newState == ChatStateEnum.PINNED) {
                    chatStateEnums[1] = ChatStateEnum.UNPINNED;
                } else if (newState == ChatStateEnum.UNPINNED) {
                    chatStateEnums[0] = ChatStateEnum.PINNED;
                }
                if (newState == ChatStateEnum.MUTED) {
                    chatStateEnums[1] = ChatStateEnum.UNMUTED;
                } else if (newState == ChatStateEnum.UNMUTED) {
                    chatStateEnums[1] = ChatStateEnum.MUTED;
                }
                gc.setChatsStateEnums(chatStateEnums);
                hasil += "Status: " + newState.toString() + "\n";
            } 
        }
        ubahStatus.method2(hasil);
        return hasil;
    }

    public static void showMessage() { // ini nomor 4
        String hasil = " ", content = " ", state = " ";
        ArrayList<Chat> listChat = new ArrayList<Chat>();
        ArrayList<Message> messages = new ArrayList<Message>();
        dummyMessageChat.dummy(listChat, messages);

        for (int i = 0; i < messages.size(); i++) {
            Message message = messages.get(i);
            if (message.getMesssageAvailability() != MessageAvailabilityEnum.DELETED) {
                content = message.getContent();
                state = " ";
                if (message.getMessageState() == 0) {
                    state = "UNREAD";
                } else {
                    state = "READ";
                }
                hasil += state + "\n" + content;
            }
        }
        viewShowMessage.method4(hasil);
    }

    public static void changeUserProfile() { // ini nomor 5 (mengubah data; username, nama, dea dan karina)
        ArrayList<User> listUser = new ArrayList<User>();
        
        LocalDate birthdate = LocalDate.of(2004, 8, 1);
        LocalDate birthdate2 = LocalDate.of(2000, 4, 11);

        User dea = new User("hollahopedeaa", "123", "deaa", birthdate, "deanursyakinah@gmail.com", "0822");
        User karina = new User("katarinabluu", "blue", "karina", birthdate2, "yujimin@gmail.com", "0833");
        listUser.add(dea);
        listUser.add(karina);

        User initialDea = new User(dea.getUsername(), dea.getPassword(), dea.getProfileName(), dea.getBirthdate(), dea.getEmail(), dea.getPhoneNumber());
        User initialKarina = new User(karina.getUsername(), karina.getPassword(), karina.getProfileName(), karina.getBirthdate(), karina.getEmail(), karina.getPhoneNumber());

        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user.getUsername().equals(dea.getUsername())) {
                dea.setUsername("deaimut");
                dea.setProfileName("denusya");
            } else if (user.getUsername().equals(karina.getUsername())) {
                karina.setUsername("karinayujimin");
                karina.setProfileName("stupidcheesecat");
            }
        }
        String updatedProfileInfo = "";
        if (!initialDea.getUsername().equals(dea.getUsername())) {
            updatedProfileInfo += " Username telah diperbarui menjadi " + "\t" + dea.getUsername() + ". ";
        }
        if (!initialDea.getProfileName().equals(dea.getProfileName())) {
            updatedProfileInfo += "Profile Name telah diperbarui menjadi " + "\t" + dea.getProfileName() + ". ";
        }

        if (!initialKarina.getUsername().equals(karina.getUsername())) {
            updatedProfileInfo += "Username telah diperbarui menjadi " + "\t" + karina.getUsername() + ". ";
        }
        if (!initialKarina.getProfileName().equals(karina.getProfileName())) {
            updatedProfileInfo += "Profile Name telah diperbarui menjadi " + "\t" + karina.getProfileName() + ". ";
        }
        ubahProfile.method5(updatedProfileInfo);
    }
}
