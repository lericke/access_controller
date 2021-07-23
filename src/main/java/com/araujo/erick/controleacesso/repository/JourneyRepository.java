package com.araujo.erick.controleacesso.repository;

import com.araujo.erick.controleacesso.model.WorkingJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkingJourney, Long> {

}
