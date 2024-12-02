package mk.ukim.finki.wp.lab.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.ukim.finki.wp.lab.service.EventService;

import java.io.IOException;

@WebServlet(name = "home", urlPatterns = "/")
public class EventListSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


//        public final EventService eventService;
//
//    public EventListSevlet(EventService eventService) {
//        this.eventService = eventService;
//    }

}
