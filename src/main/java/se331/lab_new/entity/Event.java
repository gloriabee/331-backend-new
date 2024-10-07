package se331.lab_new.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Event {
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    Boolean petsAllowed;
    String organizer;

//    Organizer organizer; Many events have one organizer so it keeps organizer object
}
