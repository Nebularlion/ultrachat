package model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private String messageText;
    private java.util.Date messageTime;

    public Message(String messageText,  java.util.Date messageTime){
        this.messageText = messageText;
        this.messageTime = messageTime;
    }

    @ManyToOne
    @JoinColumn(name = "chatId")
    private Chat chat;

    @JoinColumn(name = "userId")
    private User user;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public java.util.Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Timestamp messageTime) {
        this.messageTime = messageTime;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
