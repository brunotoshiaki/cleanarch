package br.com.cleanarch.bruno.cleanarch.dataprovider.client.converters;

import br.com.cleanarch.bruno.cleanarch.core.domain.Address;
import br.com.cleanarch.bruno.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

  AddressResponseMapper INSTANCE = Mappers.getMapper(AddressResponseMapper.class);

  Address toAddress(final AddressResponse addressResponse);
}
