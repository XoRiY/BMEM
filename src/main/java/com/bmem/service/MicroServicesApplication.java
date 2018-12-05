package com.bmem.service;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bmem.service.models.Trottinette;

@SpringBootApplication
public class MicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesApplication.class, args);
	}
	@Bean
	CommandLineRunner start(com.bmem.service.repository.TrottinetteRepository trepo){
			return  args->{
			Stream.of("A","B","C","D").forEach(t ->{
				com.bmem.service.models.Trottinette trotti = new Trottinette(null, t, (short)0, "");
				trepo.save(trotti);
			});
			for (com.bmem.service.models.Trottinette g : trepo.findAll()) {
				System.out.println(g.toString());
			}
		};
		
	}
}
