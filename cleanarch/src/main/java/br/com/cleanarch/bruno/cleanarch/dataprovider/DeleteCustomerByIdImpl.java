package br.com.cleanarch.bruno.cleanarch.dataprovider;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.DeleteCustomerById;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

  private final CustomerRepository customerRepository;

  @Override
  public void delete(final String id) {
    this.customerRepository.deleteById(id);
  }
}
