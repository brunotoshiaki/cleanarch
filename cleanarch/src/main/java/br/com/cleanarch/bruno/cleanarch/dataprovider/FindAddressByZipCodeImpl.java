package br.com.cleanarch.bruno.cleanarch.dataprovider;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.cleanarch.bruno.cleanarch.core.domain.Address;
import br.com.cleanarch.bruno.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import br.com.cleanarch.bruno.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

  private final FindAddressByZipCodeClient findAddressByZipCodeClient;

  @Override
  public Address find(final String zipCode) {
    return AddressResponseMapper.INSTANCE.toAddress(this.findAddressByZipCodeClient.find(zipCode));
  }
}
