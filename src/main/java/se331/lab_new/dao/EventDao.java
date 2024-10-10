package se331.lab_new.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab_new.entity.Event;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);
    // to save data from api post method
    Event save(Event event);

    Page<Event> getEvents(String name, Pageable page);


}
