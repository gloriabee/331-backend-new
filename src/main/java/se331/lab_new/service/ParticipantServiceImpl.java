package se331.lab_new.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab_new.dao.ParticipantDao;
import se331.lab_new.entity.Participant;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {
    final ParticipantDao participantDao;
    @Override
    public List<Participant> getAllParticipants() {
        return participantDao.getParticipants(Pageable.unpaged()).getContent();
    }
}
