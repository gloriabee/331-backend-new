package se331.lab_new.config;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab_new.entity.Event;
import se331.lab_new.entity.Organizer;
import se331.lab_new.repository.EventRepository;
import se331.lab_new.repository.OrganizerRepository;


import java.util.List;

@Component
@RequiredArgsConstructor

public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final EventRepository eventRepository;
    final OrganizerRepository organizerRepository;

    @Override

    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
      eventRepository.save(Event.builder()
              .category("Academic")
              .title("Midterm Exam")
              .description("A time for taking the exam")
              .location("CAMT Building")
              .date("3rd Sept")
              .time("3.00-4.00pm.")
              .petsAllowed(false)
              .organizer("CAMT")
              .build());
        eventRepository.save(Event.builder()
                .category("Academic")
                .title("Commencement Day")
                .description("A time for celebration")
                .location("CMU convention hall")
                .date("21st Jan")
                .time("8,00am-4.00pm.")
                .petsAllowed(false)
                .organizer("CMU")
                .build());
        eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Loy Krathong")
                .description("A time for Karathong")
                .location("Ping River")
                .date("21th Nov")
                .time("8.00-10.00pm.")
                .petsAllowed(false)
                .organizer("Chiangmai")
                .build());
        eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Songkran")
                .description("Let's play water")
                .location("Chiang Mai Moat")
                .date("13th April")
                .time("10.00am - 6.00pm.")
                .petsAllowed(true)
                .organizer("Chiangmai Municipality")
                .build());

       //for organizers data initializers
        organizerRepository.save(Organizer.builder()
                .name("Organization 1")
                .address("Chiangmai")
                .build());

        organizerRepository.save(Organizer.builder()
                .name("Organization 2")
                .address("Bangkok")
                .build());

        organizerRepository.save(Organizer.builder()
                .name("Organization 3")
                .address("Phuket")
                .build());

        organizerRepository.save(Organizer.builder()
                .name("Organization 4")
                .address("Pattaya")
                .build());

        organizerRepository.save(Organizer.builder()
                .name("Organization 5")
                .address("Chiang Rai")
                .build());

        organizerRepository.save(Organizer.builder()
                .name("Organization 6")
                .address("Ayutthaya")
                .build());

        organizerRepository.save(Organizer.builder()
                .name("Organization 7")
                .address("Mae Hong Son")
                .build());

    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}
