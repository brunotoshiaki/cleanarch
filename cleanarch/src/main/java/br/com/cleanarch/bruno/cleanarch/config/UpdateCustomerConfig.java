package br.com.cleanarch.bruno.cleanarch.config;

import br.com.cleanarch.bruno.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.cleanarch.bruno.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

  @Bean
  public UpdateCustomerUseCaseImpl updateCustomerUseCase(
      final FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, final
  FindAddressByZipCodeImpl findAddressByZipCode, final UpdateCustomerImpl updateCustomer) {
    return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode,
        updateCustomer);
  }

}
