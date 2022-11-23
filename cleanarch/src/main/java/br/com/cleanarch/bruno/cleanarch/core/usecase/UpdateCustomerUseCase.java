package br.com.cleanarch.bruno.cleanarch.core.usecase;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

  void update(final Customer customer, final String zipCode);

}
