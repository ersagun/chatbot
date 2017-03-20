package com.lombardinternational.domain;

/**
 * Created by Ersagun on 20/03/17.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Ersagun on 17/03/17.
 */

@Component
public class Command {
    @Autowired
    Source source;

   // @Output(Source.OUTPUT)
    public CommandMessage sendCommand(String message){
        System.out.println("sendCommand");
        source.output().send(MessageBuilder.withPayload(new CommandMessage(1,message)).build());
         return new CommandMessage(1,message);
       // return message;

    }
}
