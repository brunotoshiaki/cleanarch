package br.com.cleanarch.bruno.cleanarch.config;

import br.com.cleanarch.bruno.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import br.com.cleanarch.bruno.cleanarch.dataprovider.repository.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

  @Bean
  public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
      final FindCustomerByIdImpl findCustomerById,
      final DeleteCustomerByIdImpl deleteCustomerById) {
    return new DeleteCustomerByIdUseCaseImpl(findCustomerById, deleteCustomerById);
  }
}
