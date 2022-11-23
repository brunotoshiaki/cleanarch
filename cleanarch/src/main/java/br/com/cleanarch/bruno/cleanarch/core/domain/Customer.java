package br.com.cleanarch.bruno.cleanarch.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
  private String id;
  private String name;
  private String cpf;
  private Address address;
  private Boolean isValidCpf;
}
