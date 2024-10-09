package se331.lab_new.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab_new.entity.Organizer;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    List<Organizer> findAll();
}
