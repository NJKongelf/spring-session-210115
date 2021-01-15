package se.iths.springsession210115.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @GetMapping("/")
    String getSessionID(HttpSession session) {
        return "Hello, your Session ID is: " + session.getId();
    }
}
