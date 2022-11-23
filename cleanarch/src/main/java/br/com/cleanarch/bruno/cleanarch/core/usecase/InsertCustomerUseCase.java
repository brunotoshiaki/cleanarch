package br.com.cleanarch.bruno.cleanarch.core.usecase;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

  void insert(final Customer customer, final String zipcode);

}
