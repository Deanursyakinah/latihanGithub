package Week7.controller;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import Week7.model.*;

public class Dummy {
    public static void dataDummy() {
        ArrayList<User> listUser = new ArrayList<User>();
        ArrayList<Message> listMessage = new ArrayList<Message>();
        ArrayList<GroupChat> gc = new ArrayList<GroupChat>();
        ArrayList<IndividualChat> pc = new ArrayList<IndividualChat>();

        // dummy chatstatenum
        ChatStateEnum[] chatStateEnums1 = { ChatStateEnum.PINNED, ChatStateEnum.DELETED, ChatStateEnum.HIDE, ChatStateEnum.MUTED };
        ChatStateEnum[] chatStateEnums2 = { ChatStateEnum.PINNED, ChatStateEnum.MUTED };

        // dummmy ultah
        LocalDate birthdate = LocalDate.of(2004, 8, 1);
        LocalDate birthdate2 = LocalDate.of(2000, 4, 11);
        LocalDate birthdate3 = LocalDate.of(2000, 4, 23);
        LocalDate birthdate4 = LocalDate.of(2001, 10, 15);
        LocalDate birthdate5 = LocalDate.of(2004, 11, 21);

        // dummy user
        User dea = new User(chatStateEnums2, "hollahopedeaa", "apa12", "daia", birthdate, "deanursyakinah@gmail.com", "0822");
        User karina = new User(chatStateEnums1, "katarinabluu", "blue", "karina", birthdate2, "yujimin@gmail.com", "0833");
        User jeno = new User(chatStateEnums2, "leejeno", "onemoretime", "jeno", birthdate3, "jenolee@gmail.com", "0855");
        User heeseung = new User(chatStateEnums1, "haiseung", "leeheeseung", "heeseung", birthdate4, "heeseunglee@gmail.com", "0877");
        User grace = new User(chatStateEnums2, "gratine", "markckp", "grass", birthdate5, "gracevalentine@gmail.com", "0844");
        listUser.add(dea);
        listUser.add(karina);
        listUser.add(jeno);
        listUser.add(heeseung);
        listUser.add(grace);

        // dummy group chat
        String[] groupMembers = { "orang1", "orang2", "orang3", "orang4", "orang5" };
        String[] groupMembers2 = { "orang1", "orang2", "orang3" };
        String[] groupMembers3 = { "orang1", "orang2", "orang3", "orang4", "orang5", "orang6", "orang7", "orang8" };
        GroupChat gc1 = new GroupChat(chatStateEnums2, "apa yah", groupMembers);
        GroupChat gc2 = new GroupChat(chatStateEnums1, "tubes PBO", groupMembers2);
        GroupChat gc3 = new GroupChat(chatStateEnums2, "cinta karina", groupMembers3);
        GroupChat gc4 = new GroupChat(chatStateEnums1, "aku kamu kita", groupMembers);
        GroupChat gc5 = new GroupChat(chatStateEnums2, "mang eak?", groupMembers3);
        gc.add(gc1);
        gc.add(gc2);
        gc.add(gc3);
        gc.add(gc4);
        gc.add(gc5);

        // dummy private chat
        IndividualChat pc1 = new IndividualChat(chatStateEnums2, "dea");
        IndividualChat pc2 = new IndividualChat(chatStateEnums1, "grace");
        IndividualChat pc3 = new IndividualChat(chatStateEnums2, "karina");
        IndividualChat pc4 = new IndividualChat(chatStateEnums1, "jeno");
        IndividualChat pc5 = new IndividualChat(chatStateEnums2, "heeseung");
        pc.add(pc1);
        pc.add(pc2);
        pc.add(pc3);
        pc.add(pc4);
        pc.add(pc5);

        LocalDateTime waktu = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        LocalDateTime waktu2 = LocalDateTime.of(2023, 2, 15, 12, 30, 0);
        LocalDateTime waktu3 = LocalDateTime.of(2023, 3, 20, 8, 0, 0);
        LocalDateTime waktu4 = LocalDateTime.of(2023, 4, 5, 16, 45, 0);
        LocalDateTime waktu5 = LocalDateTime.of(2023, 5, 10, 10, 15, 0);
        LocalDateTime waktu6 = LocalDateTime.of(2023, 6, 25, 14, 0, 0);
        LocalDateTime waktu7 = LocalDateTime.of(2023, 7, 30, 18, 20, 0);

        //dummy message
        Message message = new Message(chatStateEnums2, "content 1", waktu, MessageAvailabilityEnum.AVAILABLE);
        Message message2 = new Message(chatStateEnums1, "content 2", waktu2, MessageAvailabilityEnum.DELETED);
        Message message3 = new Message(chatStateEnums2, "content 3", waktu3, MessageAvailabilityEnum.AVAILABLE);
        Message message4 = new Message(chatStateEnums1, "content 4", waktu4, MessageAvailabilityEnum.DELETED);
        Message message5 = new Message(chatStateEnums2, "content 5", waktu5, MessageAvailabilityEnum.AVAILABLE);
        Message message6 = new Message(chatStateEnums2, "content 5", waktu6, MessageAvailabilityEnum.AVAILABLE);
        Message message7 = new Message(chatStateEnums2, "content 5", waktu7, MessageAvailabilityEnum.AVAILABLE);
        listMessage.add(message);
        listMessage.add(message2);
        listMessage.add(message3);
        listMessage.add(message4);
        listMessage.add(message5);
        listMessage.add(message6);
        listMessage.add(message7);
    }

    public static void showUserChats() {
        
    }
}
