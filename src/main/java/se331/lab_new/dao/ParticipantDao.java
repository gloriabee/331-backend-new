package se331.lab_new.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab_new.entity.Participant;

import java.util.Optional;

public interface ParticipantDao {
    Page<Participant> getParticipants(Pageable pageable);
}
