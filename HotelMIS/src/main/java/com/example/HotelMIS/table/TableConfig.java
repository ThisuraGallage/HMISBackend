package com.example.HotelMIS.table;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class TableConfig {

    @Bean
    CommandLineRunner commandLineRunner(TableRepository tableRepository){
        return args ->{
            Table t1=new Table(false,true);
            Table t2=new Table(true,true);
            //Table t2=new Table(false,false);
            tableRepository.saveAll(List.of(t1,t2));
        };
    }
}
