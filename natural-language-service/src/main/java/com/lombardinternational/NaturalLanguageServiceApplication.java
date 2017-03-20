package com.lombardinternational;

import com.lombardinternational.domain.CommandMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.handler.annotation.SendTo;
import reactor.core.publisher.Flux;

@SpringBootApplication
//@EnableBinding(DistributionChannel.class)
@EnableBinding(Processor.class)
public class NaturalLanguageServiceApplication {



	//@StreamListener(DistributionChannel.INPUT)
	//@Output(DistributionChannel.OUTPUT)

	//@StreamListener(Processor.INPUT)
	//@Output(Processor.OUTPUT)

	//@Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Flux<CommandMessage> log( CommandMessage data){
		//System.out.println(data);
		System.out.println(data.toString());
		//Generator g = new Generator(data);
		//return Mono.just(g.getSample().toString());
		//System.out.println(g.getSample().toString());
		return Flux.just(data);
		//return Flux.just(new CommandMessage(1,g.getSample().toString()));
	}

	public static void main(String[] args) {
		SpringApplication.run(NaturalLanguageServiceApplication.class, args);
	}
}