package com.amos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
<<<<<<< HEAD
        model.addAttribute("title", "Tekton + Spring Boot App + Openshift");
        model.addAttribute("msg", "We are introducing the vault to store the sonarqube token in Tekton on Ohio !!!");
=======
        model.addAttribute("title", "Tekton + Spring Boot App + Openshift + PeerTest + imageversion ");
        model.addAttribute("msg", "We are doing PeerTesting with improvments of Tekton on Ohio !!!");
>>>>>>> 4b88b809d6e8808ab42273c87e854a488c257aea
        
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
