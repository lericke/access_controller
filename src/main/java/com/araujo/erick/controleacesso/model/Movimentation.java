package com.araujo.erick.controleacesso.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentation {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentationId implements Serializable {
        private Long idMoviment;
        private Long idUser;
    }

    @Id
    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private BigDecimal timeCourse;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
