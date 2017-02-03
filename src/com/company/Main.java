package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String n, m;

    public static void main(String[] args) {
        messagingSystem();
        //Uncomment to test moving messages
        /*
        MessageList a = new MessageList("100"), b = new MessageList("200");
        Message c = new Message("100", "Hey!  It's c!");
        System.out.println("Date of C: " + c.dateReceived);
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(Exception same){
        }
        Message d  = new Message("100", "Hey!  It's d!");
        System.out.println("Date of D: " + d.dateReceived);
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(Exception ayy){
        }
        Message e = new Message("100", "Hey!  It's e!");
        System.out.println("Date of E: " + e.dateReceived);
        try {
            TimeUnit.SECONDS.sleep(2);
        }
        catch(Exception thisthing){
        }
        Message f = new Message("100", "Hey!  It's f!");
        System.out.println("Date of F: " + f.dateReceived);
        a.add(c);
        a.add(d);
        b.add(f);//This also demonstrates the sorting method:  The messages always appear by earliest received.
        b.add(e);
        System.out.println("A:");
        a.printMessages();
        System.out.println("B:");
        b.printMessages();
        a.moveMessage(0, b);
        System.out.println("\n\nA:");
        a.printMessages();
        System.out.println("B:");
        b.printMessages();
        a.moveMessage(0, b);
        System.out.println("\n\nA:");
        a.printMessages();
        System.out.println("B:");
        b.printMessages();
        b.moveMessage(3, a);
        System.out.println("\n\nA:");
        a.printMessages();
        System.out.println("B:");
        b.printMessages();
        b.moveMessage(1, a);
        System.out.println("\n\nA:");
        a.printMessages();
        System.out.println("B:");
        b.printMessages();
        */
    }

    public static void messagingSystem() {
        Boolean e = false, end;
        System.out.println("Please input a number to send your message to.\t (Or \"Exit\" to exit)");
        n = sc.nextLine();
        System.out.println("Please input a message to send.\t (\"Exit\" to exit, \"Print\" to print all of the messages from this number, and \"Numbers\" to see a list of all available numbers)");
        m = sc.nextLine();
        end = n.equalsIgnoreCase("exit") || m.equalsIgnoreCase("exit");
        if (!end) {
            if (m.equalsIgnoreCase("print")) {
                for (int i = 0; i < MessageList.allmsgs.size(); i++) {
                    if (n.equals(MessageList.allmsgs.get(i).number)) {
                        e = true;
                        MessageList.allmsgs.get(i).printMessages();
                    }
                }
            }
            if (!e && m.equalsIgnoreCase("numbers")) {
                e = true;
                for (int i = 0; i < MessageList.allmsgs.size(); i++) {
                    System.out.print(MessageList.allmsgs.get(i).number);
                }
            }
            if (!e) {
                for (int i = 0; i < MessageList.allmsgs.size(); i++) {
                    if (n.equals(MessageList.allmsgs.get(i).number)) {
                        e = true;
                        MessageList.allmsgs.get(i).add(new Message(n, m));
                    }
                }
            }
            if (!e) {
                new MessageList(new Message(n, m));
            }
            messagingSystem();
        }
    }
}