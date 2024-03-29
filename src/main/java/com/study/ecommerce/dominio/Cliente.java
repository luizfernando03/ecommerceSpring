package com.study.ecommerce.dominio;


import lombok.*;

@Data
@AllArgsConstructor
public class Cliente {

    private String id;
    private String tipo;
    private String nome;
    private String email;
    private String endereco;
}
