package mk.ukim.finki.wp.lab.web.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {
    public String getEventsPage(@RequestParam(required = false) String error, Model model){

        return error;
    }
}
