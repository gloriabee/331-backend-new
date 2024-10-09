package se331.lab_new.dao;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab_new.entity.Organizer;
import se331.lab_new.repository.OrganizerRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrganizerDaoImpl implements OrganizerDao{
    final OrganizerRepository organizerRepository;

    @Override
    public Page<Organizer> getOrganizers(Pageable pageRequest) {
        return organizerRepository.findAll(pageRequest);
    }
}