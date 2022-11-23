package br.com.cleanarch.bruno.cleanarch.entrypoint.consumer.mapper;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMessageMapper {

  CustomerMessageMapper INSTANCE = Mappers.getMapper(CustomerMessageMapper.class);

  @Mapping(target = "address", ignore = true)
  Customer toCostumer(final CustomerMessage customerMessage);

}
