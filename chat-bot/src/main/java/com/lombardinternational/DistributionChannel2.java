package com.lombardinternational;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by Ersagun on 17/03/17.
 */
public interface DistributionChannel2 {



    String OUTPUT = "sended2";

    String INPUT = "received2";

    @Input(DistributionChannel2.INPUT)
    SubscribableChannel received2();

    @Output(DistributionChannel2.OUTPUT)
    MessageChannel sended2();
}
