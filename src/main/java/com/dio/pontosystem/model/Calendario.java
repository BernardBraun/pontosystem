package com.dio.pontosystem.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "tipo_data_id")
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
