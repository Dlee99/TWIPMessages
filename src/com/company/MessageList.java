package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class MessageList {
    public static ArrayList<MessageList> allmsgs = new ArrayList();
    public ArrayList<Message> msgs = new ArrayList();
    public final String number;
    public MessageList(Message a){
        number = a.number;
        msgs.add(a);
        allmsgs.add(this);
        sortMessageList();
    }
    public void add(Message a){
        msgs.add(a);
    }
    public void sortMessageList(){
        for(int i = 0; i < allmsgs.size(); i++){
            allmsgs.get(i).sortMessages();
        }
        allmsgs.sort(new Comparator<MessageList>() {
            @Override
            public int compare(MessageList o1, MessageList o2){
                return o1.msgs.get(msgs.size() - 1).dateReceived.compareTo(o2.msgs.get(msgs.size() - 1).dateReceived);
            }
        });
    }
    public void sortMessages(){
        msgs.sort(new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2){
                return o1.dateReceived.compareTo(o2.dateReceived);
            }
        });
    }
    public static void moveMessage(int position, String number1, String number2){
        MessageList list1 = null, list2 = null;
        for(int i = 0; i < MessageList.allmsgs.size(); i++){
            if(number1.equals(MessageList.allmsgs.get(i).number)){
                list1 = MessageList.allmsgs.get(i);
            }
        }
        for(int i = 0; i < MessageList.allmsgs.size(); i++){
            if(number2.equals(MessageList.allmsgs.get(i).number)){
                list2 = MessageList.allmsgs.get(i);
            }
        }
        list2.msgs.add(list1.msgs.get(position));
        list1.msgs.remove(position);
        list1.sortMessages();
        list2.sortMessages();
    }
    public static void moveMessage(int position, MessageList list1, MessageList list2){
        list2.msgs.add(list1.msgs.get(position));
        list1.msgs.remove(position);
        list1.sortMessages();
        list2.sortMessages();
    }
    public void printMessages(){
        for(int i = 0; i < msgs.size(); i++){
            System.out.println(msgs.get(i).message);
        }
    }
}
