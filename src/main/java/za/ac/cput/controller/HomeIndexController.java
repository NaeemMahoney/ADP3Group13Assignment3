package za.ac.cput.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeIndexController {

    @RequestMapping({"/", "/home"})
    public String homeindex(){
        return "Welcome to our Clinic!!";
    }

}
