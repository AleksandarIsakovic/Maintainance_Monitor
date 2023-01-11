package slm.mm.maintainance_monitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private String maintainceMessage = "Everything works as expected";
    @GetMapping("/api/message")
    public String getMessage(){
        return maintainceMessage;

    }

}
