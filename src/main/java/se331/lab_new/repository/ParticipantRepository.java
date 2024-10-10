package se331.lab_new.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab_new.entity.Participant;

import java.util.List;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {
    List<Participant> findAll();
}
