package br.com.cleanarch.bruno.cleanarch.dataprovider.repository;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindCustomerById;
import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdImpl implements FindCustomerById {

  private final CustomerRepository customerRepository;

  @Override
  public Optional<Customer> find(final String id) {
    final var customerEntity = this.customerRepository.findById(id);
    return customerEntity.map(CustomerEntityMapper.INSTANCE::toCustomer);
  }
}
