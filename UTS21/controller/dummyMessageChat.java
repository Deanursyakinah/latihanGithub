package UTS21.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import UTS21.model.*;

public class dummyMessageChat {
    public static void dummy(ArrayList<Chat> chat, ArrayList<Message> messages) {
        ArrayList<Message> messages2 = new ArrayList<Message>(); //ini biar ga kebaca double

        // dummy chatstatenum
        ChatStateEnum[] chatStateEnums1 = { ChatStateEnum.PINNED, ChatStateEnum.MUTED };
        ChatStateEnum[] chatStateEnums2 = { ChatStateEnum.UNPINNED, ChatStateEnum.UNMUTED };

        // ----DUMMY MESSAGE-----
        String[] groupMembers = { "orang1", "orang2", "orang3" };
        Message orang1 = new Message(chatStateEnums1, "eh kamu udh makan belom?", LocalDateTime.now(), 1,
                MessageAvailabilityEnum.AVAILABLE);
        Message orang2 = new Message(chatStateEnums2, "udaa dong", LocalDateTime.now().plusMinutes(2), 1,
                MessageAvailabilityEnum.AVAILABLE);
        Message orang3 = new Message(chatStateEnums1, "apa itu makan? bershandaa", LocalDateTime.now().plusMinutes(1),
                0, MessageAvailabilityEnum.DELETED);
        messages.add(orang1);
        messages.add(orang2);
        messages.add(orang3);

        GroupChat gc1 = new GroupChat(chatStateEnums1, "family", groupMembers, messages);
        chat.add(gc1);

        // ini dummy but individual chat
        Message person1 = new Message(chatStateEnums1, "eh kamu udh makan belom?", LocalDateTime.now(), 1,
                MessageAvailabilityEnum.AVAILABLE);
        Message person2 = new Message(chatStateEnums2, "udaa dong", LocalDateTime.now().plusMinutes(2), 0,
                MessageAvailabilityEnum.AVAILABLE);
        messages2.add(person1);
        messages2.add(person2);

        IndividualChat pc1 = new IndividualChat(chatStateEnums2, "dea", messages);
        chat.add(pc1);
    }
}
