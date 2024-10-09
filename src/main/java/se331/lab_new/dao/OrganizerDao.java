package se331.lab_new.dao;

import org.springframework.data.domain.Page;
import se331.lab_new.entity.Organizer;

import java.util.List;

public interface OrganizerDao {
    Integer getOrganizerSize();
    Page<Organizer> getOrganizers(Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);

    //to save organizer from api post method (temporary data)
    Organizer save(Organizer organizer);

}
