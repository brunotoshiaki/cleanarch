package br.com.cleanarch.bruno.cleanarch.dataprovider;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.InsertCustomer;
import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {

  private final CustomerRepository customerRepository;

  @Override
  public void insert(final Customer customer) {
    this.customerRepository.save(CustomerEntityMapper.INSTANCE.toCustomerEntity(customer));
  }
}
