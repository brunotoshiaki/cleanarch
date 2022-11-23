package br.com.cleanarch.bruno.cleanarch.core.dataprovider;

import br.com.cleanarch.bruno.cleanarch.core.domain.Customer;
import java.util.Optional;

public interface FindCustomerById {

  Optional<Customer> find(final String id);
}