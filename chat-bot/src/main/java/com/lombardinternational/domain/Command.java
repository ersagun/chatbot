package com.lombardinternational.domain;

/**
 * Created by Ersagun on 20/03/17.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;


@EnableBinding(Source.class)
public class Command {


   private Source source;


    @Autowired
    public Command(Source source) {
        this.source = source;
    }




    public CommandMessage sendCommand(){
        System.out.println("sendCommand");
        //source.output().send(MessageBuilder.withPayload(new CommandMessage(1,message)).build());
        this.source.output().send(MessageBuilder.withPayload(new CommandMessage(1,"changed")).build());
        return new CommandMessage(1,"hihi");
        // return message;

    }
}
