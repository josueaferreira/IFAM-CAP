package com.api.api_aluno.domain.Entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aluno")
@Data
@NoArgsConstructor

// Criação da entidade Aluno como extensão do banco de dados para leitura e gravação de informações.
public class Aluno {
    
    @Id
    @Column(name="matricula")
    @NotNull(message = "É obrigatório a inserção do número de Matrícula")
    Long matricula;

    @Column(name="nome")
    @NotBlank(message = "É obrigatório a inserção do Nome")
    @Length(message="O campo de nome deve conter no máximo 50 caracteres",max=50)
    String nome;

    @Column(name="idade")
    @NotNull(message = "Idade é um campo Obrigatório")
    @Min(message = "A idade mínimo deve ser de 1 ano", value = 1)
    @Max(message = "A idade máxima dever ser de 99 anos", value = 99)
    @Positive(message = "São aceitos somente numeros positivos")
    int idade;

    @Column(name="email")
    @NotBlank(message = "A inserção de E-mail é obrigatória")
    @Email(message="O E-mail inserido deve seguir o padrão: seuemail@provedor")
    @Length(message="O E-mail deve conter no máximo 100 caracteres",max=100)
    String email;
}
