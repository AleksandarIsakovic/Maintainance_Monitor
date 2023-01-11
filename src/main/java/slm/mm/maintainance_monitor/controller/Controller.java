package slm.mm.maintainance_monitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private String maintainceMessage = "Everything works as expected";
    @PostMapping("/api/message/set")
    public String setmaintance(@RequestParam String param) {
        if (param != null) {
            maintainceMessage = param;
            return "ok";
        } else {
            return "Error while setting Maintaince ";
        }
    }
}