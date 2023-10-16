package com.rogerfreitas.vitrine.cliente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {

    private Long idCliente;
    private String nome;
    private String email;
    private String password;
}
