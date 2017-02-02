package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MessageList a = new MessageList(new Message("10", "Hello-1")), b = null;
        for(int i = 0; i < 10; i++){
            a.add(new Message("10", "Hello" + i));
        }
        /*for(int i = 0; i < MessageList.allmsgs.size(); i++){
            MessageList.allmsgs.get(i).printMessages();
        }
        */
    }
}
