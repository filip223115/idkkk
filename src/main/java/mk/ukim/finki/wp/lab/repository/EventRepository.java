package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Event;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public class EventRepository {
    public List<Event> events = null;

    public List<Event> findAll(){

        return events;
    }
    public List<Event> searchEvents(String text){

        return null;
    }
}
