package se331.lab_new.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se331.lab_new.dao.EventDao;
import se331.lab_new.entity.Event;

import java.util.List;

//@Service annotation is used with classes that provide some business functionalities.

@Service
@RequiredArgsConstructor

public class EventServiceImpl implements EventService {
    final EventDao eventDao;

    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public List<Event> getEvents(Integer pageSize, Integer page) {
        return eventDao.getEvents(pageSize, page);
    }

    @Override
    public Event getEvent(Long id) {
        return eventDao.getEvent(id);
    }
}
