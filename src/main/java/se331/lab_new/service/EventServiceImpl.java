package se331.lab_new.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import se331.lab_new.dao.EventDao;
import se331.lab_new.dao.OrganizerDao;
import se331.lab_new.entity.Event;
import se331.lab_new.entity.Organizer;

import java.util.List;

//@Service annotation is used with classes that provide some business functionalities.

@Service
@RequiredArgsConstructor

public class EventServiceImpl implements EventService {
    final EventDao eventDao;

    final OrganizerDao organizerDao;

    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public Page<Event> getEvents(Integer pageSize, Integer page) {
        return eventDao.getEvents(pageSize, page);
    }

    @Override
    public Event getEvent(Long id) {
        return eventDao.getEvent(id);
    }

    @Override
    @Transactional
    public Event save(Event event) {
        Organizer organizer=organizerDao.findById(event.getOrganizer().getId()).orElse(null);
        event.setOrganizer(organizer);
        organizer.getOwnEvents().add(event);
        return eventDao.save(event);
    }


}
