package model;

import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chatId;
    private String chatMessages;
    private String chatText;
    private java.util.Date chatTime;
    private String chatName;

    public Chat(long chatId, String chatMessages, String chatText, java.util.Date chatTime, String chatName){
        this.chatMessages = chatMessages;
        this.chatText = chatText;
        this.chatTime = chatTime;
        this.chatName = chatName;
    }

    public Chat(){

    }

    @OneToMany
    private List<Message> messages;

    public List<Message> getMessages(){
        return messages;
    }

    public void setMessages(List<Message> messages){
        this.messages = messages;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(String chatMessages) {
        this.chatMessages = chatMessages;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText;
    }

    public java.util.Date getChatTime() {
        return chatTime;
    }

    public void setChatTime(Timestamp chatTime) {
        this.chatTime = chatTime;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }
}

