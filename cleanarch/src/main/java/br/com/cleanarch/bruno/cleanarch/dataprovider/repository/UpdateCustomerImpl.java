package br.com.cleanarch.bruno.cleanarch.dataprovider.repository;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.UpdateCustomer;
import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCustomerImpl implements UpdateCustomer {

  private final CustomerRepository customerRepository;

  @Override
  public void update(final Customer customer) {
    this.customerRepository.save(CustomerEntityMapper.INSTANCE.toCustomerEntity(customer));
  }
}
