package se331.lab_new.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import se331.lab_new.entity.Event;

import java.util.ArrayList;
import java.util.List;
//the annotation to indicate that the class provide for storage, retrieval, search, update and delete operation on objects
@Repository
@Profile("manual")
public class EventDaoImpl implements EventDao {

    List<Event> eventList;

    @PostConstruct
    public void init() {
        //creating event arraylist to store events
        eventList = new ArrayList<>();

        //adding event item 1
        eventList.add(Event.builder()
                .id(123L)
                .category("animal welfare")
                .title("Cat Adoption Day")
                .description("Find your new feline friend at this event.")
                .location("Meow Town")
                .date("January 28,2022")
                .time("12:00")
                .petsAllowed(true)
                .organizer("Kat Laydee")
                .build());

        //adding event item 2
        eventList.add(Event.builder()
                .id(456L)
                .category("food")
                .title("Community Gardening")
                .description("Join us as we tend to the community edible plants.")
                .location("Flora City")
                .date("March 14, 2022")
                .time("10:00")
                .petsAllowed(true)
                .organizer("Fern Pollin")
                .build());

        //adding event item 3
        eventList.add(Event.builder()
                .id(789L)
                .category("sustainability")
                .title("Beach Cleanup")
                .description("Help pick up trash along the shore.")
                .location("Playa Del Carmen")
                .date("July 22, 2022")
                .time("11:00")
                .petsAllowed(false)
                .organizer("Carey Wales")
                .build());

        //adding event item 4
        eventList.add(Event.builder()
                .id(1001L)
                .category("animal welfare")
                .title("Dog Adoption Day")
                .description("Find your new canine friend at this event.")
                .location("Woof Town")
                .date("August 28, 2022")
                .time("12:00")
                .petsAllowed(true)
                .organizer("Dawg Dahd")
                .build());

        //adding event item 5
        eventList.add(Event.builder()
                .id(1002L)
                .category("food")
                .title("Canned Food Drive")
                .description("Bring your canned food to donate to those in need.")
                .location("Tin City")
                .date("September 14, 2022")
                .time("3:00")
                .petsAllowed(true)
                .organizer("Kahn Opiner")
                .build());

        //adding event item 6
        eventList.add(Event.builder()
                .id(1003L)
                .category("sustainability")
                .title("Highway Cleanup")
                .description("Help pick up trash along the highway.")
                .location("Highway 50")
                .date("July 22, 2022")
                .time("11:00")
                .petsAllowed(false)
                .organizer("Brody Kill")
                .build());

        //adding event item 7
        eventList.add(Event.builder()
                .id(1103L)
                .category("Testing7")
                .title("Testing 7")
                .description("Help pick up trash along the highway.")
                .location("Highway 50")
                .date("July 22, 2022")
                .time("11:00")
                .petsAllowed(false)
                .organizer("Brody Kill")
                .build());


    }

    @Override
    public Integer getEventSize() {
        return eventList.size();
    }

    @Override
    public List<Event> getEvents(Integer pageSize, Integer page) {
        pageSize=pageSize==null?getEventSize():pageSize;
        page=page==null?1:page;
        int firstIndex=(page-1)*pageSize;
        if(firstIndex>=eventList.size()){
            return new ArrayList<>();
        }
        int endIndex=Math.min(firstIndex+pageSize,eventList.size());
        return eventList.subList(firstIndex,endIndex);

    }

    @Override
    public Event getEvent(Long id) {
       return eventList.stream().filter(event ->
               event.getId().equals(id)).findFirst().orElse(null);
    }
}
