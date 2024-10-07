package se331.lab_new.dao;

import se331.lab_new.entity.Organizer;

import java.util.List;

public interface OrganizerDao {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize,Integer page);
    Organizer getOrganizer(Long id);
}
