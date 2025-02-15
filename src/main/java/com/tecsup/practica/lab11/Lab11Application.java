package com.tecsup.practica.lab11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tecsup.practica.lab11.models.service.IUploadFileService;

@SpringBootApplication
public class Lab11Application implements CommandLineRunner {
    @Autowired
    IUploadFileService uploadFileService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Lab11Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        uploadFileService.deleteAll();
        uploadFileService.init();

        String password = "12345";

        for(int i=0; i<2; i++) {
            String bcryptPassword = passwordEncoder.encode(password);
            System.out.println(bcryptPassword);
        }
    }

}