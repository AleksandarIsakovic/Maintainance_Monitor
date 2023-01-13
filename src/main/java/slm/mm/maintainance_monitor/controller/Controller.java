package slm.mm.maintainance_monitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private String maintainceMessage = "Everything works as expected";
    @GetMapping("/api/message")
    public String message(){
        return maintainceMessage;
    }
    @PostMapping("/api/message/set")
    public String setmaintance(@RequestParam String param){
        if(param != null){
            maintainceMessage = param;
            return "Reset is ok!";
        }else{
            return "Error while setting Maintaince ";
        }

    }
    @GetMapping("/api/message/reset")
    public String reset(){
        maintainceMessage= "Messege reset worked as expected";
        return maintainceMessage;
    }
}
