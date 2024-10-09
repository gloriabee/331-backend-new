package se331.lab_new.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @EqualsAndHashCode.Exclude
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    Boolean petsAllowed;
    //many events can be hold by 1 organizer

    @ManyToOne
    Organizer organizer;


    @ManyToMany(mappedBy = "eventHistory")
    //1 event is belonged to many participants
    List<Participant> participants;



//    Organizer organizer; Many events have one organizer so it keeps organizer object
}
