package br.com.cleanarch.bruno.cleanarch.core.usecase.impl;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.cleanarch.bruno.cleanarch.core.dataprovider.UpdateCustomer;
import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.core.usecase.FindCustomerByIdUseCase;
import br.com.cleanarch.bruno.cleanarch.core.usecase.UpdateCustomerUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

  private final FindCustomerByIdUseCase findCustomerByIdUseCase;

  private final FindAddressByZipCode findAddressByZipCode;

  private final UpdateCustomer updateCustomer;

  @Override
  public void update(final Customer customer, final String zipCode) {
    this.findCustomerByIdUseCase.find(customer.getId());
    final var address = this.findAddressByZipCode.find(zipCode);
    customer.setAddress(address);
    this.updateCustomer.update(customer);
  }
}
