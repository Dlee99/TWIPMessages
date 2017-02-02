package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MessageList a = new MessageList(new Message("10", "Hello-1"));
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            a.add(new Message("10", "Hello" + i));
        }
        /*for(int i = 0; i < MessageList.allmsgs.size(); i++){
            MessageList.allmsgs.get(i).printMessages();
        }*/
        a.printMessages();

    }
}
