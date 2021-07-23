package com.araujo.erick.controleacesso.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class HourBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class HourBankId implements Serializable {

        private Long idHourBank;
        private Long idMovimentation;
        private Long idUser;
    }

    @EmbeddedId
    private HourBankId id;
    private LocalDateTime workedDate;
    private BigDecimal wokedHours;
    private BigDecimal hoursBalance;
}
