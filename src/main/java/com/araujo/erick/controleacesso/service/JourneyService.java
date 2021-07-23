package com.araujo.erick.controleacesso.service;

import com.araujo.erick.controleacesso.model.WorkingJourney;
import com.araujo.erick.controleacesso.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    @Autowired
    JourneyRepository journeyRepository;

    public WorkingJourney saveJourney(WorkingJourney workingJourney) {
        return journeyRepository.save(workingJourney);
    }

    public List<WorkingJourney> findAll() {
        return journeyRepository.findAll();
    }

    public Optional<WorkingJourney> getById(Long idJourney) {
        return journeyRepository.findById(idJourney);
    }

    public WorkingJourney updateJourney(WorkingJourney workingJourney) {
        return journeyRepository.save(workingJourney);
    }

    public void deleteJourney(Long idJourney) {
        journeyRepository.deleteById(idJourney);
    }
}
