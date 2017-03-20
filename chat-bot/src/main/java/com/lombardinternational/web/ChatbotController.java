package com.lombardinternational.web;

/**
 * Created by Ersagun on 17/03/17.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.*;
import com.lombardinternational.domain.*;

@RestController
    @EnableAutoConfiguration
    public class ChatbotController {

        /**
         * Request from developer is coming, it's text then I take text and thanks
         * to Open lp natural language library split the request text of user for
         * example : deploy app2 in e2e
         *
         *
         * I want to know if there is a mecanisme already implemented in
         * reactor.core and webflux for getting ALL flux Example : Developer A
         * Called API for deploying app2 Developer B started deploying app3 etc..
         * What I would like to do is, having a get for example /activities that my
         * bot call, and each time /activities called i want to get all current
         * activities (activities started and doesn't finished (a list of flux so))
         *
         * @param text
         * @return
         */


        @Autowired
        Command cmd;


        @RequestMapping("/getInformation/{text}")
        public @ResponseBody
        CommandMessage home(@PathVariable(value = "text") String text) {
         return cmd.sendCommand(text);
            //return text;
        }
    }
