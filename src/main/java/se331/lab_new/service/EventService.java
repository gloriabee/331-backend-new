package se331.lab_new.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab_new.entity.Event;

import java.util.List;

public interface EventService {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Page<Event> getEvents(String title, Pageable page);
    Event getEvent(Long id);
    Event save(Event event);
}
