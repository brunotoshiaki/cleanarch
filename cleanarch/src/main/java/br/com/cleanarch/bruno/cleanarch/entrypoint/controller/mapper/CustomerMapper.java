package br.com.cleanarch.bruno.cleanarch.entrypoint.controller.mapper;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "address", ignore = true)
  @Mapping(target = "isValidCpf", ignore = true)
  Customer toCustomer(CustomerRequest customerRequest);

}
