package com.rogerfreitas.vitrine.produto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto  implements Serializable {

    private Long idProduto;
    private String nome;
    private String descricao;

    private BigDecimal preco;

    private Categoria categoria;
    private String urlImagem;
}
