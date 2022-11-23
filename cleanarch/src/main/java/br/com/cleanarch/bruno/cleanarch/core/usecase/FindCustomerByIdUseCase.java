package br.com.cleanarch.bruno.cleanarch.core.usecase;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

  Customer find(final String id);
}
