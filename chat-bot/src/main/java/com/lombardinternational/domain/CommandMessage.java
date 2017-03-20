package com.lombardinternational.domain;

/**
 * Created by Ersagun on 17/03/17.
 */
public class CommandMessage {

    private int id;
    private  String message;


    public CommandMessage(int id, String message){
        this.id=id;
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {
        return "CommandMessage{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
