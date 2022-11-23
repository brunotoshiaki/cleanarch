package br.com.cleanarch.bruno.cleanarch.core.dataprovider;

import br.com.cleanarch.bruno.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

  Address find(final String zipCode);

}
