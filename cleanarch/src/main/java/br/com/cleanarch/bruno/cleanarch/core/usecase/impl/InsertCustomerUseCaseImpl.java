package br.com.cleanarch.bruno.cleanarch.core.usecase.impl;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.cleanarch.bruno.cleanarch.core.dataprovider.InsertCustomer;
import br.com.cleanarch.bruno.cleanarch.core.dataprovider.SendCpfForValidation;
import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.core.usecase.InsertCustomerUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

  private final FindAddressByZipCode findAddressByZipCode;
  private final InsertCustomer insertCustomer;

  private final SendCpfForValidation sendCpfForValidation;

  @Override
  public void insert(final Customer customer, final String zipcode) {
    final var address = this.findAddressByZipCode.find(zipcode);
    customer.setAddress(address);
    this.insertCustomer.insert(customer);
    this.sendCpfForValidation.send(customer.getCpf());
  }
}
