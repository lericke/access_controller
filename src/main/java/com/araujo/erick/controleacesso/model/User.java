package com.araujo.erick.controleacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {

    @Id
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String nome;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingJourney workingJourney;
    private BigDecimal tolerance;
    private LocalDateTime startJourney;
    private LocalDateTime endJourney;
}
