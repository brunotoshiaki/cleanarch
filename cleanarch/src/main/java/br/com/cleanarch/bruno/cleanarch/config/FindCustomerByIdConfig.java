package br.com.cleanarch.bruno.cleanarch.config;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.FindCustomerById;
import br.com.cleanarch.bruno.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

  @Bean
  public FindCustomerByIdUseCaseImpl findCustomerById(final FindCustomerById findCustomerById) {
    return new FindCustomerByIdUseCaseImpl(findCustomerById);
  }
}
