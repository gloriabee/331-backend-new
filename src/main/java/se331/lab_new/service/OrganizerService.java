package se331.lab_new.service;

import org.springframework.data.domain.Page;
import se331.lab_new.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> getAllOrganizers();
    Page<Organizer> getOrganizers(Integer pageSize, Integer page);
//    Organizer getOrganizer(Long id);
//    Organizer save(Organizer organizer);
}
