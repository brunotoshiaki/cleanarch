package br.com.cleanarch.bruno.cleanarch.config;

import br.com.cleanarch.bruno.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.InsertCustomerImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

  @Bean
  public InsertCustomerUseCaseImpl insertCustomerUseCase(
      final FindAddressByZipCodeImpl findAddressByZipCode,
      final InsertCustomerImpl insertCustomer,
      final SendCpfForValidationImpl sendCpfForValidation) {
    return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer,
        sendCpfForValidation);
  }

}
