package br.com.cleanarch.bruno.cleanarch.entrypoint.consumer.message;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class CustomerMessage {

  private final String id;
  private final String nome;
  private final String zipCode;
  private final Boolean isValidCpf;

}
