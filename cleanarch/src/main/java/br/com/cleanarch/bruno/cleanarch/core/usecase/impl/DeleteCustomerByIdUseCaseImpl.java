package br.com.cleanarch.bruno.cleanarch.core.usecase.impl;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.DeleteCustomerById;
import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindCustomerById;
import br.com.cleanarch.bruno.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

  private final FindCustomerById findCustomerById;
  private final DeleteCustomerById deleteCustomerById;

  @Override
  public void delete(final String id) {
    this.findCustomerById.find(id);
    this.deleteCustomerById.delete(id);
  }
}
