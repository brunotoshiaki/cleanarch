package br.com.cleanarch.bruno.cleanarch.dataprovider.repository.mapper;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

  CustomerEntityMapper INSTANCE = Mappers.getMapper(CustomerEntityMapper.class);

  CustomerEntity toCustomerEntity(final Customer customer);

  Customer toCustomer(final CustomerEntity customer);
}
