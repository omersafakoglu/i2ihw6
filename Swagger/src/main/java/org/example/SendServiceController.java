package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SendServiceController {

    @PostMapping("/sendVoice")
    public String sendVoice(
            @RequestParam String aNumber,
            @RequestParam String bNumber,
            @RequestParam int duration,
            @RequestParam String location) {
        return "A call was made from " + aNumber + " to " + bNumber + " for " + duration + " minutes in " + location + ".";
    }

    @PostMapping("/sendSms")
    public String sendSms(
            @RequestParam String aNumber,
            @RequestParam String bNumber,
            @RequestParam String location) {
        return "An SMS was sent from " + aNumber + " to " + bNumber + " in " + location + ".";
    }

    @PostMapping("/sendData")
    public String sendData(
            @RequestParam String aNumber,
            @RequestParam int mb,
            @RequestParam int rg,
            @RequestParam String location) {
        return "Data of " + mb + "MB was sent from " + aNumber + " with RG " + rg + " in " + location + ".";
    }
}
