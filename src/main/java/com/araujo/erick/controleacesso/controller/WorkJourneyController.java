package com.araujo.erick.controleacesso.controller;

import com.araujo.erick.controleacesso.model.WorkingJourney;
import com.araujo.erick.controleacesso.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class WorkJourneyController {

    @Autowired
    JourneyService journeyService;

    @PostMapping
    public WorkingJourney createJourney(@RequestBody WorkingJourney workingJourney) {
        return journeyService.saveJourney(workingJourney);
    }

    @GetMapping
    public List<WorkingJourney> getJourneyList() {
        return journeyService.findAll();
    }

    @GetMapping("/{idJornada}")
    public WorkingJourney getJourneyById(@PathVariable("idJornada") Long idJourney) throws Exception {
        return journeyService.getById(idJourney).orElseThrow(() -> new Exception("Jornada não encontrada."));
    }

}
