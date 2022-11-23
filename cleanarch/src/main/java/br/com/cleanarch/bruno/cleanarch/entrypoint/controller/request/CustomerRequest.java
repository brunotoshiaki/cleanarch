package br.com.cleanarch.bruno.cleanarch.entrypoint.controller.request;

import javax.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class CustomerRequest {

  @NotBlank
  private final String name;
  @NotBlank
  private final String cpf;
  @NotBlank
  private final String zipCode;
}
