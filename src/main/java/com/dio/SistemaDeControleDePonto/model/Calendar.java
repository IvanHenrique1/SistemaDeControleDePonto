package com.dio.SistemaDeControleDePonto.model;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Calendar {
    @Id
    private long id;
    @ManyToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;

}
