package com.lombardinternational;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by Ersagun on 17/03/17.
 */

public interface DistributionChannel {



    String OUTPUT = "sended";

    String INPUT = "received";

    @Input(DistributionChannel.INPUT)
    SubscribableChannel received();

    @Output(DistributionChannel.OUTPUT)
    MessageChannel sended();

}
