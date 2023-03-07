package com.br.clientes.clientes.dto.request;


import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteRequestDTO {
    @NotEmpty(message = " O campo nome é obrigaório")
    private String nome;
    @NotEmpty(message = " O campo telefone e é obrigaório")
    private String telefone;
    @NotEmpty(message = " O campo endereco é obrigaório")
    private String endereco;

}
