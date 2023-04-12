package com.abdelkabir;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;


@SpringBootApplication
public class GestionDeStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeStockApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            if(StringUtils.hasLength("gggggg")){
                System.out.println("Veuillez renseignez le code");
            }else{
                System.out.println("ttttttttttttttttttttt");
            }
        };
    }
}
