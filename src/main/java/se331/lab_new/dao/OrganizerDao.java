package se331.lab_new.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab_new.entity.Organizer;

import java.util.List;
import java.util.Optional;

public interface OrganizerDao {

    Page<Organizer> getOrganizers(Pageable pageRequest);
    Optional<Organizer> findById(Long id);
//    Organizer getOrganizer(Long id);
//
//    //to save organizer from api post method (temporary data)
//    Organizer save(Organizer organizer);



}
