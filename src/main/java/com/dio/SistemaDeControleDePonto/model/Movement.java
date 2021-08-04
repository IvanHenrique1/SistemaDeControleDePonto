package com.dio.SistemaDeControleDePonto.model;

import lombok.*;
import org.hibernate.envers.Audited;

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
@Audited
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
        @Embeddable
        public class MovementId implements Serializable {

        private long idMovement;
        private long idUser;

    }
    @EmbeddedId
    private MovementId id;
    private LocalDateTime entrance;
    private LocalDateTime exit;
    private BigDecimal periodOfStay;
    private Occurrence occurrence;
    private Calendar calendar;

}
