package com.dio.pontosystem.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CategoriaUsuario {
    @Id
    private Long id;
    private String descricao;
}
