package br.com.cleanarch.bruno.cleanarch.core.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
private String street;
private String city;
private String state;
}
