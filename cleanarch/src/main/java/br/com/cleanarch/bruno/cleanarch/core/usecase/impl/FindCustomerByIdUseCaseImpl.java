package br.com.cleanarch.bruno.cleanarch.core.usecase.impl;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindCustomerById;
import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.core.usecase.FindCustomerByIdUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

  private final FindCustomerById findCustomerById;

  @Override
  public Customer find(final String id) {

    return this.findCustomerById.find(id)
        .orElseThrow(() -> new RuntimeException("Customer not found "));
  }
}
