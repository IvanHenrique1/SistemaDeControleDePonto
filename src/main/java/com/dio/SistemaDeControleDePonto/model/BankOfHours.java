package com.dio.SistemaDeControleDePonto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Audited
public class BankOfHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BankOfHoursId implements Serializable {

        private long idBankOfHours;
        private long idMovement;
        private long idUser;

    }
    @EmbeddedId
    private BankOfHoursId id;
    private LocalDateTime dateWorked;
    private BigDecimal workedHours;
    private BigDecimal overHours;

}
