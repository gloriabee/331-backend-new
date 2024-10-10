package se331.lab_new.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.lab_new.entity.*;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE= Mappers.getMapper(LabMapper.class);


    EventDTO getEventDtO(Event event);
    List<EventDTO> getEventDto(List<Event> events);

    OrganizerDTO getOrganizerDtO(Organizer organizer);
    List<OrganizerDTO> getOrganizerDto(List<Organizer> organizers);

    ParticipantDTO getParticipantDto(Participant participant);
    List<ParticipantDTO> getParticipantDto(List<Participant> participants);

}
