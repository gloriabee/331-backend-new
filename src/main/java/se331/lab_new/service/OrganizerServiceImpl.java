package se331.lab_new.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab_new.dao.OrganizerDao;
import se331.lab_new.entity.Organizer;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService{
    final OrganizerDao organizerDao;


    @Override
    public List<Organizer> getAllOrganizers() {
        return organizerDao.getOrganizers(Pageable.unpaged()).getContent();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerDao.getOrganizers(PageRequest.of(page, pageSize));
    }


}
