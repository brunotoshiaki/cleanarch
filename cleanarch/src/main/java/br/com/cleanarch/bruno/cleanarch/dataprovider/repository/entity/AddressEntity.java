package br.com.cleanarch.bruno.cleanarch.dataprovider.repository.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressEntity {

  private String street;
  private String city;
  private String state;
}
