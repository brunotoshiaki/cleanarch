package br.com.cleanarch.bruno.cleanarch.entrypoint.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class CustomerResponse {

  private final AddressResponse addressResponse;
  private final String name;
  private final String cpf;
  private final Boolean isValidCpf;
}
