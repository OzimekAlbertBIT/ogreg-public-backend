package com.bit.ogreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OgregPublicBackendApplication {


    @GetMapping("/message")
    public String message() {
        return "Congratulations. Your app has been deployed successfully in Azure 333";
    }


    public static void main(String[] args) {
        SpringApplication.run(OgregPublicBackendApplication.class, args);
    }

}
