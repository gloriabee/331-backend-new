package se331.lab_new.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se331.lab_new.entity.Organizer;
import se331.lab_new.service.OrganizerService;
import se331.lab_new.util.LabMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrganizerController {
    final OrganizerService organizerService;
    @GetMapping("/organizers")
    ResponseEntity<?> getOrganizers(){
        return ResponseEntity.ok(
               LabMapper.INSTANCE.getOrganizerDto(organizerService.getAllOrganizers())
        );
    }
}
