package com.company;

import java.util.Date;

public class Message {
    public final Date dateReceived;
    public final String number, message;
    public final long timeReceived;
    public Message(String n, String m){
        dateReceived = new Date();
        number = n;
        message = m;
        timeReceived = dateReceived.getTime();
        /*for(int i = 0; i < MessageList.allmsgs.size(); i++){
            if(this.number.equals(MessageList.allmsgs.get(i).number)){
                MessageList.allmsgs.get(i).add(this);
            }
        }*/
    }
}
