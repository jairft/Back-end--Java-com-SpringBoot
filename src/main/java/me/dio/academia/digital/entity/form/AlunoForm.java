package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo corretamente!")
  @Size(min = 3, max = 50, message = "O campo precisa estar entre o minimo de 3 e maximo de 50!")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente!")
  @Size(min = 3, max = 50, message = "è inválido!")
  private String cpf;

  @NotBlank(message = "Preencha o campo corretamente!")
  @Size(min = 3, max = 50, message = "O campo precisa estar entre o minimo de 3 e maximo de 50!")
  private String bairro;

  @NotBlank(message = "Preencha o campo corretamente!")
  @Size(min = 3, max = 50, message = "É inválido!")
  private LocalDate dataDeNascimento;
}
