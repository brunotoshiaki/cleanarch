package br.com.cleanarch.bruno.cleanarch.entrypoint.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class AddressResponse {

  private final String street;
  private final String city;
  private final String state;
}
