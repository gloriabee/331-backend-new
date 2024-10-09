package se331.lab_new.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import se331.lab_new.entity.Organizer;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrganizerDaoImpl implements OrganizerDao{
    List<Organizer> organizerList;

    @PostConstruct
    public void init() {
        organizerList = new ArrayList<Organizer>();

        // Add Organizer 1
        organizerList.add(Organizer.builder()
                .id(123L)
                .name("Organization 1")
                .address("Chiangmai")
                .build());

// Add Organizer 2
        organizerList.add(Organizer.builder()
                .id(124L)
                .name("Organization 2")
                .address("Bangkok")
                .build());

// Add Organizer 3
        organizerList.add(Organizer.builder()
                .id(125L)
                .name("Organization 3")
                .address("Phuket")
                .build());

// Add Organizer 4
        organizerList.add(Organizer.builder()
                .id(126L)
                .name("Organization 4")
                .address("Pattaya")
                .build());

// Add Organizer 5
        organizerList.add(Organizer.builder()
                .id(127L)
                .name("Organization 5")
                .address("Chiang Rai")
                .build());

// Add Organizer 6
        organizerList.add(Organizer.builder()
                .id(128L)
                .name("Organization 6")
                .address("Ayutthaya")
                .build());

        // Add Organizer 7
        organizerList.add(Organizer.builder()
                .id(129L)
                .name("Organization 7")
                .address("Mae Hong Son")
                .build());


    }
    @Override
    public Integer getOrganizerSize() {
        return organizerList.size();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize=pageSize==null?getOrganizerSize():pageSize;
        page=page==null?1:page;
        int firstIndex=(page-1)*pageSize;
        if(firstIndex>=organizerList.size()){
            return new ArrayList<>();
        }
        int lastIndex=Math.min(firstIndex+pageSize,organizerList.size());
        return organizerList.subList(firstIndex,lastIndex);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream().filter(organizer ->
                organizer.getId().equals(id)).findFirst().orElse(null);
    }
}
